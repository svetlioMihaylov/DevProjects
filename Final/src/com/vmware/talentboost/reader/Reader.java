package com.vmware.talentboost.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.vmware.talentboost.command.factory.SupportedCommands;
import com.vmware.talentboost.validator.IValidetor;
import com.vmware.talentboost.validator.ValidatorFactory;

public class Reader {
	private String rawInput;
	private InputStream source;
	private List<String> args;
	private IValidetor validator;

	public Reader(InputStream stream) {
		rawInput=new String();
		this.source = stream;
		args = new ArrayList<>();
	}

	public List<String> readCommandArguments() throws IOException {
		args.clear();
		SupportedCommands commandType = getType(rawInput);
		validator = ValidatorFactory.getInstance(commandType);
		 parseCommand(rawInput);
		validator.validate(args);
		
		return args;
	}

	private void parseCommand(String arg) {
		if(arg.contains("'")){
			arg=arg.trim();
			String [] split=arg.split("'");
			args.addAll(Arrays.asList(split[0].trim().split(" ")));
			args.add(split[1].trim());
			args.addAll(Arrays.asList(split[2].trim().split(" ")));
			
		}
		else {
			args=Arrays.asList(arg.split("\\s+"));
		}

	
	}

	public SupportedCommands getType(String temp) {
		temp = temp.trim();
		SupportedCommands command = SupportedCommands.valueOf(temp
				.split("\\s+")[0]);
		if (command == null) {
			throw new IllegalArgumentException("No such supported command!!!");
		} else
			return command;
	}

	public boolean hasMoreCommads() throws IOException {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(source));
		String temp = new String();
		temp = reader.readLine();
		if (temp != null){
			rawInput=temp;
			return true;
		}else{
			return false;
			}
	}
}
