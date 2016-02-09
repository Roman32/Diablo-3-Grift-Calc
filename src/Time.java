
public class Time {
	String time;
	Integer minute;
	Integer second;
	public Time(){
		this.time = "";
		this.minute = 0;
		this.second = 0;
	}
	
	public Time(String time){
		this.time = time;
		this.minute = Integer.valueOf(time.substring(0,time.indexOf(':')));
		this.second = Integer.valueOf(time.substring(time.indexOf(':')+1,time.length()));
	}
	
	public void setTime(String time){
		this.time = time;
		this.minute = Integer.valueOf(time.substring(0,time.indexOf(':')));
		this.second = Integer.valueOf(time.substring(time.indexOf(':')+1,time.length()));
	}
	
	public String getTime(){
		return this.time;
	}

	
	@Override
	public String toString(){
		return Integer.toString(this.minute)+ ":" + Integer.toString(this.second);
	}
}
