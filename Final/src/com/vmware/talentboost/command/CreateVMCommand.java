package com.vmware.talentboost.command;

import java.util.List;

import com.vmware.talentboost.vm.VM;
import com.vmware.talentboost.vmstorage.Storage;

public class CreateVMCommand implements ICommand {
	private Storage storage;
	private String vmId;
	private String name;
	private long memory;
	public CreateVMCommand(List<String>  args, Storage storage) {
		this.storage=storage;
		this.vmId=args.get(1);
		this.name=args.get(2);
		this.memory=Long.valueOf(args.get(3));
	}

	@Override
	public void executeCommand() {
		storage.addVM(new VM(vmId, name, memory));
	}

}
