package com.vmware.talentboost.device;

import com.vmware.talentboost.devicespec.IDeviceSpec;


public class DeviceFactory {

	public static IDevice getInstance(SupportedDevices deviceType, IDeviceSpec device) {
		IDevice newDevice=null;
		switch(deviceType){
		case NetowrkCard :  newDevice =  new NetworkCard(device); 
		case VideoCard : newDevice = new VideoCard(device);
		default : ;
		}
		return newDevice;
	}

}
