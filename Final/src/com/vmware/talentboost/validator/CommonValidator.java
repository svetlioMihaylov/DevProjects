package com.vmware.talentboost.validator;

import java.util.List;

import com.vmware.talentboost.command.factory.SupportedCommands;

public class CommonValidator implements IValidetor {

	@Override
	public void validate(List<String> args) {
		if(args==null){
			throw new IllegalArgumentException("Error in CommonValidator : args is null");
		}
		for(int i=0;i<args.size();i++){
			if(args.get(i)==null){
				throw new IllegalArgumentException("argument at index " + i + "is null");
			}
			if(args.get(i).length()==0){
				throw new IllegalArgumentException("argument at index " + i + "is empty");
			}
		}
	
		SupportedCommands command = SupportedCommands.valueOf(args.get(0));
		if(command==null){
			throw new IllegalArgumentException("No such command suported");
		}
	}

	public void validateNumber(String number,String erroeMessage){ 
		if(Integer.valueOf(number)<0){
			throw new IllegalArgumentException(erroeMessage);
		}
	}
	public void validateCommandArgumentsLength(List<String> args, int numberOfArgs)
	{
		if(args.size()<numberOfArgs){
			throw new IllegalArgumentException("Illegal number Of Arguments");
		}
	}
}
