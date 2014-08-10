package com.vmware.talentboost.validator;

import java.util.List;

import com.vmware.talentboost.SimulatorConstants;
import com.vmware.talentboost.device.SupportedDevices;

public class DeviceSpecValidator extends CommonValidator{
	private SupportedDevices device;
	public DeviceSpecValidator(SupportedDevices deviceType){
		device=deviceType;
	}
	@Override
	public void validate(List<String> args) {
		super.validate(args);
		
		switch(device){
		case VideoCard: 
			super.validateCommandArgumentsLength(args, 4);
			super.validateNumber(args.get(2),"VideoCard Memory cannot be negative");
			super.validateNumber(args.get(3),"Number of displays cannot be negative");
			if(Integer.valueOf(args.get(4))>SimulatorConstants.maxNumberOfDisplays){
				throw new IllegalArgumentException("number of displays cannot be more than" +SimulatorConstants.maxNumberOfDisplays);
			}
			if(Integer.valueOf(args.get(2))>SimulatorConstants.maxVideoRam){
				throw new IllegalArgumentException("video memoty cannot be more than " +SimulatorConstants.maxVideoRam);
			}
		case NetowrkCard:
			super.validateCommandArgumentsLength(args, 3);
			if(args.get(0).length()!=17)
				throw new IllegalArgumentException("Incorect lenght of mac Adress. Expected  HH-HH-HH-HH-HH-HH");
			if(args.get(0).split("-").length!=6){
				throw new IllegalArgumentException("Incorrect MAC address");
			}
		}
		
	}

}
