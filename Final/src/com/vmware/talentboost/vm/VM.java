package com.vmware.talentboost.vm;

import java.util.HashMap;
import java.util.Map;

import com.vmware.talentboost.MemoryCategory;
import com.vmware.talentboost.MemoryConverter;
import com.vmware.talentboost.device.SupportedDevices;
import com.vmware.talentboost.device.IDevice;
import com.vmware.talentboost.device.VideoCard;
import com.vmware.talentboost.devicespec.VideoCardSpec;


public class VM extends AbstractVM {
	public VM(String id,String name,long memory){
		this.id=id;
		this.name=name;
		this.memory=memory;
		this.devices=new HashMap<SupportedDevices, Map<String,IDevice>>();
	}
	@Override
	public void showInfo() {
		System.out.println(" VM with id :" + id + "has name " + name+ " has memory "+memory);
		
	}

	@Override
	public boolean addDevice(SupportedDevices deviceType, IDevice device) {
		return super.addDevice(deviceType, device);
		
	}

	@Override
	public void editVm(String name, long memory) { 
		super.editVm(name,memory);

	}

	@Override
	public void showInfo(boolean full) {
		showInfo();
		
		for(SupportedDevices devType:devices.keySet()){
			if(devType.equals(SupportedDevices.VideoCard)){
				long totalMemory= 0;
				int numberOfDisplays=0;
				Map<String,IDevice> videoCards=devices.get(devType);
				for(String id:videoCards.keySet()){
					VideoCardSpec vCardSpec= (VideoCardSpec) videoCards.get(id).getSpec();
					totalMemory+=vCardSpec.getVideoRam();
					numberOfDisplays+=vCardSpec.getNumberOfDisplay();
				}
						System.out.println("has " + devices.get(devType).size() + "devices of type" + devType.toString() + " with total memory of " + 
											MemoryConverter.convert(totalMemory, MemoryCategory.B) + " with total display nomber of " + numberOfDisplays);
			}
			else if(devType.equals(SupportedDevices.NetowrkCard)){
				System.out.println("has " + devices.get(devType).size() + "devices of type " + devType.toString());
			}
			
		}
		System.out.println(); 
	}
}
