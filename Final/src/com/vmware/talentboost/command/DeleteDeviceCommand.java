package com.vmware.talentboost.command;

import java.util.List;

import com.vmware.talentboost.vmstorage.Storage;

public class DeleteDeviceCommand implements ICommand {
	private String vmId;
	private String deviceId;
	private Storage storage;
	public DeleteDeviceCommand(List<String> args , Storage storage) {
		this.storage=storage;
		vmId=args.get(0);
		deviceId=args.get(0);
	}

	@Override
	public void executeCommand() {
		storage.getVM(vmId).deleteDevice(deviceId);;
	}

}
