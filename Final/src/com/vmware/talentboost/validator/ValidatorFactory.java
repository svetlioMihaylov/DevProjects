package com.vmware.talentboost.validator;

import com.vmware.talentboost.command.factory.SupportedCommands;

public class ValidatorFactory {

	public static IValidetor getInstance(SupportedCommands commandType) {
		IValidetor validator = null;
		switch(commandType){
		case AddDevice: validator=new AddDeviceCommandValidator(); break;
		case CreateVM: validator= new CreateVMCommandValidator(); break;
		case DeleteDevice: validator= new DeleteDeviceCommandValidator(); break;
		case DeleteVM: validator= new DeleteVMCommandValidator(); break;
		case EditVM: validator = new EditVMCommandValidator() ; break;
		default:
			break;
		}
		return validator;
	}

}
