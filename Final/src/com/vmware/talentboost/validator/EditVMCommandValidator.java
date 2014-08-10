package com.vmware.talentboost.validator;

import java.util.List;

public class EditVMCommandValidator extends CommonValidator {

	@Override
	public void validate(List<String> args) {
		super.validate(args);
		super.validateCommandArgumentsLength(args, 3);
	}
}
