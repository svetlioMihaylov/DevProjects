package com.vmware.talentboost.devicespec;

public class  AbstractDeviceSpec implements IDeviceSpec {
	protected String id;
	public void showInfo(){
		System.out.println("Device with id :"+ id);
	}
	@Override
	public String getId() {
		return id;
		
	}

}
