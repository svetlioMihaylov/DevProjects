package com.vmware.talentboost.main;

import java.io.IOException;
import java.util.List;

import com.vmware.talentboost.command.ICommand;
import com.vmware.talentboost.command.factory.ICommandFactory;
import com.vmware.talentboost.command.factory.SupportedCommands;
import com.vmware.talentboost.reader.Reader;
import com.vmware.talentboost.vmstorage.Storage;

public class Main {
	public static void main(String[] args) {
		Storage storage = new Storage();
		Reader reader = new Reader(System.in);
		try {
			while(reader.hasMoreCommads())
			{
				List<String> arguments=reader.readCommandArguments();
				SupportedCommands commandType=reader.getType(arguments.get(0));
				ICommand command=ICommandFactory.getInstance(commandType, storage, arguments);
				command.executeCommand();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
