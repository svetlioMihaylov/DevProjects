package com.vmware.talentboost.vmstorage;

import java.util.HashMap;
import java.util.Map;

import com.vmware.talentboost.vm.IVM;

public class Storage {
	private Map<String,IVM> storage;
	
	public Storage()
	{
		storage=new HashMap<String,IVM>();
	}
	
	public void addVM(IVM vm){
		if(storage.containsKey(vm.getId())){
			throw new IllegalArgumentException("A VM with id "+ vm.getId() + " already exists");
		}
		else {
			storage.put(vm.getId(), vm);
		}
	}
	
	public IVM getVM(String id){
		IVM vm=storage.get(id);
		if(vm==null){
			throw new IllegalArgumentException("There is no Vm with id" + id);
		}
		else 
		return storage.get(id);
	}
	
	public void deleteVm(String id){
		if(!storage.containsKey(id)){
			throw new IllegalArgumentException("There is no Vm with id" + id);
		}
		else {
			storage.remove(id);
		}
	}
	
	public void editVm(String id,String name, long memory){
		IVM vm=getVM(id);
		vm.setName(name);
		vm.setMemory(memory);
	}
	public void showInfo(){
		System.out.println("Currently active " + storage.size() + "VMs");
		for(String s:storage.keySet()){
			storage.get(s).showInfo();
		}
	}
	public void showInfo(boolean full){
		System.out.println("Currently active " + storage.size() + "VMs");
		for(String s:storage.keySet()){
			storage.get(s).showInfo(full);
		}
	}
	
}
