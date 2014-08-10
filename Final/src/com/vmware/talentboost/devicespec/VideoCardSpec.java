package com.vmware.talentboost.devicespec;

public class VideoCardSpec extends AbstractDeviceSpec {
	private int videoRam;
	private int numberOfDisplay;
	public VideoCardSpec(String id,int videoRam,int numberOfDisplay) {
		super.id=id;
		this.videoRam=videoRam;
		this.numberOfDisplay=numberOfDisplay;
	}
	@Override
	public void showInfo() {
	super.showInfo();
	System.out.println(" with videoRam in KB :" + videoRam);
	System.out.println(" with number of displays : "+ numberOfDisplay);

	}
	public int getNumberOfDisplay() {
		return numberOfDisplay;
	}
	public void setNumberOfDisplay(int numberOfDisplay) {
		this.numberOfDisplay = numberOfDisplay;
	}
	public int getVideoRam() {
		return videoRam;
	}
	public void setVideoRam(int videoRam) {
		this.videoRam = videoRam;
	}

}
