package com.vmware.talentboost.devicespec;


public class NetworkCardSpec extends AbstractDeviceSpec {
	private String MACAddress;
	private String IPAdress;
	public  NetworkCardSpec(String id,String MACAddress,String IPAddress) {
		super.id=id;
		this.MACAddress=MACAddress;
		this.IPAdress=IPAddress;
	}
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println(" with MACAddress :" + MACAddress);
		System.out.println(" with IPAddress" + IPAdress);

	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMACAddress() {
		return MACAddress;
	}
	public void setMACAddress(String mACAddress) {
		MACAddress = mACAddress;
	}
	public String getIPAdress() {
		return IPAdress;
	}
	public void setIPAdress(String iPAdress) {
		IPAdress = iPAdress;
	}

}
