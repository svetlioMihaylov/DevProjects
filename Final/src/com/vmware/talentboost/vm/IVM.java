package com.vmware.talentboost.vm;

import com.vmware.talentboost.device.SupportedDevices;
import com.vmware.talentboost.device.IDevice;

public interface IVM {
	void showInfo();
	void showInfo(boolean full);
	boolean addDevice(SupportedDevices deviceType,IDevice device);
	void deleteDevice(String id);
	void editVm(String name, long memory);

	String getId();
	String getName();
	void setName(String name);
	void setMemory(long memory);
	long getMemory();
	
}
