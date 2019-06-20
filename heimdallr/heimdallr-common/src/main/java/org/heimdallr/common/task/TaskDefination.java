package org.heimdallr.common.task;

public class TaskDefination {
	
	//任务的探测类型
	private String probeType;
	
	//任务的开始时间
	private long beginTime;
	
	//任务的结束时间
	private long endTime;
	
	//上次执行时间
	private long lastExeutetime;
	
	//下次执行时间
	private long nextExeutetime;
	
	//任务的状态是否已完成
	private String status;

	public String getProbeType() {
		return probeType;
	}

	public void setProbeType(String probeType) {
		this.probeType = probeType;
	}

	public long getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(long beginTime) {
		this.beginTime = beginTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	public long getLastExeutetime() {
		return lastExeutetime;
	}

	public void setLastExeutetime(long lastExeutetime) {
		this.lastExeutetime = lastExeutetime;
	}

	public long getNextExeutetime() {
		return nextExeutetime;
	}

	public void setNextExeutetime(long nextExeutetime) {
		this.nextExeutetime = nextExeutetime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
