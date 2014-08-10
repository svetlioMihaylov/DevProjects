package com.vmware.talentboost.vm;

import java.util.Map;

import com.vmware.talentboost.device.DeviceFactory;
import com.vmware.talentboost.device.SupportedDevices;
import com.vmware.talentboost.device.IDevice;

public abstract class AbstractVM implements IVM {
	protected String id;
	protected String name;
	protected long memory;
	protected Map<SupportedDevices,Map<String,IDevice>> devices;
	
	@Override
	public String getId() {
		return id;
	}
//
//	public void setId(String id) {
//		this.id = id;
//	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public long getMemory() {
		return memory;
	}
	@Override
	public void setMemory(long memory) {
		this.memory = memory;
	}
/*	public Map<String, IDevice> getDevices() {
		return devices;
	}
	public void setDevices(Map<String, IDevice> devices) {
		this.devices = devices;
	}*/
	
	@Override
	public boolean addDevice(SupportedDevices deviceType,IDevice device){
		Map <String, IDevice> currDevices = devices.get(deviceType);
		if(currDevices.containsKey(device.getId())){
			return false;
		}
		else {
			currDevices.put(device.getId(), DeviceFactory.getInstance(deviceType,device.getSpec()));
			return true;
		}
		
	}
	@Override
	public void deleteDevice(String id){
		for(SupportedDevices type:devices.keySet()){
			Map<String,IDevice> dev= devices.get(type);
			dev.remove(id);
		}
	}
	@Override
	public void editVm(String name, long memory){
		setName(name);
		setMemory(memory);
		
	}
	public abstract void showInfo();

}
