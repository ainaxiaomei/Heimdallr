package org.heimdallr.common.task;

import java.util.List;

public class ExecutionDefination {
	
	//服务名称
	private String serviceName;
	
	//服务参数
	private List<String> param;

	public ExecutionDefination(String serviceName, List<String> param) {
		super();
		this.serviceName = serviceName;
		this.param = param;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public List<String> getParam() {
		return param;
	}

	public void setParam(List<String> param) {
		this.param = param;
	}
	
}
