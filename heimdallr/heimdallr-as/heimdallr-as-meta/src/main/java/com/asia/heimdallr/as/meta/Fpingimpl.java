package com.asia.heimdallr.as.meta;

import org.apache.dubbo.config.annotation.Service;

@Service
public class Fpingimpl implements IFpingService{
	
	static {
		
		System.loadLibrary("fping");
	}
	
	 public Fpingimpl() {
		 
	}
	
	
	 public native void fping(int argc,String[] args);

	public void fping0(int argc, String[] args) {
		fping(argc,args);
		
	}
	


	

}
