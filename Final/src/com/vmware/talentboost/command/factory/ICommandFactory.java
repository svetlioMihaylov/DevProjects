package com.vmware.talentboost.command.factory;

import java.util.List;

import com.vmware.talentboost.command.AddDeviceCommand;
import com.vmware.talentboost.command.CreateVMCommand;
import com.vmware.talentboost.command.DeleteDeviceCommand;
import com.vmware.talentboost.command.DeleteVMCommand;
import com.vmware.talentboost.command.EditVMCommand;
import com.vmware.talentboost.command.ICommand;
import com.vmware.talentboost.command.PrintCommand;
import com.vmware.talentboost.vmstorage.Storage;

public class ICommandFactory {
	public static ICommand getInstance(SupportedCommands commandType,Storage storage, List<String>args){
		ICommand command=null;
		switch(commandType){
		case AddDevice : command=new AddDeviceCommand(args,storage); break;
		case CreateVM :  command=new CreateVMCommand(args,storage); break;
		case DeleteDevice:  command=new DeleteDeviceCommand(args,storage); break;
		case DeleteVM:  command=new DeleteVMCommand(args,storage); break;
		case  EditVM :  command=new EditVMCommand(args,storage); break;
		case Print : command=new PrintCommand(args,storage); break;
		}
		return command;
	}
}
