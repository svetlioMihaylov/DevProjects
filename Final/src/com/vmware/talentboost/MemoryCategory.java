package com.vmware.talentboost;

public enum MemoryCategory {
B,KB,MB,GB,TB;
public static String getCategory(int index){
	return MemoryCategory.values()[index].toString();
}
}
