package com.vmware.talentboost.device;

import com.vmware.talentboost.devicespec.IDeviceSpec;

public class VideoCard extends AbstractDevice {
	public VideoCard(IDeviceSpec spec) {
		super.setSpec(spec);
	}
	@Override
	public void showInfo() {
		spec.showInfo();
	
	}
	
	

}
