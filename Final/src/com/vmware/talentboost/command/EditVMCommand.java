package com.vmware.talentboost.command;

import java.util.List;

import com.vmware.talentboost.vmstorage.Storage;

public class EditVMCommand implements ICommand {
	private Storage storage;
	private String vmId;
	private String name;
	private long memory;
	public EditVMCommand(List<String> args, Storage storage) {
		this.storage=storage;
		this.vmId=args.get(0);
		this.name=args.get(1);
		this.memory=Long.valueOf(args.get(2));
	}


	@Override
	public void executeCommand() {
		storage.getVM(vmId).editVm(name, memory);

	}

}
