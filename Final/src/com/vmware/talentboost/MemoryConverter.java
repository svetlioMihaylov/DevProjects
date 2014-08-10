package com.vmware.talentboost;

public class MemoryConverter {
	public static long bytesToKiloBytes(long bytes){
		return bytes/1024;
	}
	public static long kiloBytesToMegaBytes(long kiloBytes){ 
		return kiloBytes/1024;
	}
	public static long megaBytesToGigaBytes(long megaBytes){ 
		return megaBytes/1024;
	}
	public static long gigaBytesToTeraBytes(long gigaBytes){ 
		return gigaBytes/1024;
	}
	public static long bytesToMegaBytes(long bytes){
		return bytes/1024;
	}
	public static  String convert(long bytes, MemoryCategory category){
		String result= null;
		int counter;
		long temp=0;
		switch(category){
		case B: 
			counter=0;
			do{
				temp=bytes/1024;
				if(temp>0)
					counter++;
				else {
					temp=bytes;
					break;
				}
				bytes=bytes/1024;
			}
			while(bytes>=1024);
	
			result=new String(temp + MemoryCategory.getCategory(counter));
			break;
	case KB: 
		counter=1;
		do{
			temp=bytes/1024;
			if(temp>0)
				counter++;
			else {
				temp=bytes;
				break;
			}
			bytes=bytes/1024;
		}
		while(bytes>=1024);

		result=new String(temp + MemoryCategory.getCategory(counter));
		break;
case MB: 
	counter=2;
	do{
		temp=bytes/1024;
		if(temp>0)
			counter++;
		else {
			temp=bytes;
			break;
		}
		bytes=bytes/1024;
	}
	while(bytes>=1024);

	result=new String(temp + MemoryCategory.getCategory(counter));
	break;
case GB: 
	counter=3;
	do{
		temp=bytes/1024;
		if(temp>0)
			counter++;
		else {
			temp=bytes;
			break;
		}
		bytes=bytes/1024;
	}
	while(bytes>=1024);

	result=new String(temp + MemoryCategory.getCategory(counter));
	break;
		default:
			break;
		}
		return result;
	}

	
}
