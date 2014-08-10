package com.vmware.talentboost.devicespec;

import com.vmware.talentboost.device.SupportedDevices;

public class DeviceSpecFactory {
public static IDeviceSpec getInstance(SupportedDevices type,String... args){
	
	IDeviceSpec spec=null;
	switch(type){
	case VideoCard : spec=new VideoCardSpec(args[0], Integer.valueOf(args[1]), Integer.valueOf(args[2]));
		break;
 	case NetowrkCard : spec = new NetworkCardSpec(args[0], args[1], args[2]);
	}
	return spec;
	
}

}
