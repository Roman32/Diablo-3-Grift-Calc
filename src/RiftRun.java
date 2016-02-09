
public class RiftRun {
	private String toonName;
	private String toonClass;
	private Integer level;
	private Time runTime;

	public RiftRun(){
		this.toonName = "";
		this.toonClass = "";
		this.level = 0;
		this.runTime = new Time();
	}
	
	public RiftRun(int lvl,String time){
		this.toonClass= "";
		this.toonName ="";
		this.level = lvl;
		this.runTime = new Time(time);
	}
	
	public RiftRun(int lvl,String time,String name, String clss){
		this.toonClass= clss;
		this.toonName =name;
		this.level = lvl;
		this.runTime = new Time(time);
	}
	
	public void setLevel(int lvl){
		this.level = lvl;
	}
	/**
	 * 
	 * @return Level of the Rift
	 */
	public int getLevel(){
		return this.level;
	}
	
	public void setName(String name){
		this.toonName = name;
	}
	
	public String getName(){
		if(this.toonName.equals("")){
			return "No name given";
		}
		return this.toonName;
	}
	
	public void setClass(String clss){
		this.toonClass = clss;		
	}
	
	public String getToonClass(){
		if(this.toonClass.equals("")){
			return "No class given";
		}
		return this.toonClass;
	}
	
	public void setTime(String time){
		this.runTime.setTime(time);
	}
}
