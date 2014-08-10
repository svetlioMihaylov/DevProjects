package com.vmware.talentboost.command;

import java.util.List;

import com.vmware.talentboost.vmstorage.Storage;

public class DeleteVMCommand implements ICommand {
	private String vmId;
	private Storage storage;
	public DeleteVMCommand(List<String> args, Storage storage) {
		this.storage=storage;
		vmId=args.get(0);
	}

	@Override
	public void executeCommand() {
		storage.deleteVm(vmId);
	}

}

