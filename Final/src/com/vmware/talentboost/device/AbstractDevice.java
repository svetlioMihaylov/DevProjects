package com.vmware.talentboost.device;

import com.vmware.talentboost.devicespec.IDeviceSpec;

public abstract class AbstractDevice implements IDevice {
	protected IDeviceSpec spec;
	@Override
	public IDeviceSpec getSpec() {
		return spec;
	}
	public void setSpec(IDeviceSpec spec) {
		this.spec = spec;
	}
	@Override
	public String getId()
	{
		return spec.getId();
	}
	public abstract   void showInfo();
}
