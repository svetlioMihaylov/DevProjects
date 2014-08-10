package com.vmware.talentboost.validator;

import java.util.List;

import com.vmware.talentboost.device.SupportedDevices;

public class AddDeviceCommandValidator extends CommonValidator{

	@Override
	public void validate(List<String> args) {
		super.validate(args);
		super.validateCommandArgumentsLength(args, 3);
	
		SupportedDevices deviceType=SupportedDevices.valueOf(args.get(1));
		DeviceSpecValidator deviceSpecvalidator=new DeviceSpecValidator( deviceType);
		deviceSpecvalidator.validate(args);
	}
	}
