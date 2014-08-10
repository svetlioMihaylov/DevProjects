package com.vmware.talentboost.command;

import java.util.List;

import com.vmware.talentboost.device.DeviceFactory;
import com.vmware.talentboost.device.SupportedDevices;
import com.vmware.talentboost.devicespec.DeviceSpecFactory;
import com.vmware.talentboost.devicespec.IDeviceSpec;
import com.vmware.talentboost.vmstorage.Storage;

public class AddDeviceCommand implements ICommand {
	private String id;
	private SupportedDevices type;
	private IDeviceSpec spec;
	private Storage storage;
	public AddDeviceCommand(List<String> args,Storage storage){
		this.id = args.get(0);
		this.type=SupportedDevices.valueOf(args.get(1));
		this.spec=initSpec(type,args);
		this.storage=storage;
	}
	private IDeviceSpec initSpec(SupportedDevices type, List<String> args) {
		String[] argsToPass = new String[args.size()];
		for(int i=2;i<args.size();i++){
			argsToPass[i-2]=args.get(i);
		}
		
		return DeviceSpecFactory.getInstance(type, argsToPass);
	}
	//TODO tests when: no id, dev already already exists
	@Override
	public void executeCommand() {
		storage.getVM(id).addDevice(type, DeviceFactory.getInstance(type, spec));

	}

}
