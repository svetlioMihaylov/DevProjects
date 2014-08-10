package com.vmware.talentboost.device;

import com.vmware.talentboost.devicespec.IDeviceSpec;

public class NetworkCard extends AbstractDevice {
	public  NetworkCard(IDeviceSpec spec) {
		super.setSpec(spec);
	}
	@Override
	public void showInfo() {
		spec.showInfo();

	}

}
