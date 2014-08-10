package com.vmware.talentboost.validator;

import java.util.List;

public class CreateVMCommandValidator extends CommonValidator {

	@Override
	public void validate(List<String> args) {
		super.validate(args);
		super.validateCommandArgumentsLength(args,3);
		super.validateNumber(args.get(3), "VM memory cannot be negative");
	}

}
