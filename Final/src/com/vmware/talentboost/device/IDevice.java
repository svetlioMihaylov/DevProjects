package com.vmware.talentboost.device;

import com.vmware.talentboost.devicespec.IDeviceSpec;

public interface IDevice {
	void showInfo();
	String getId();
	IDeviceSpec getSpec();
}
