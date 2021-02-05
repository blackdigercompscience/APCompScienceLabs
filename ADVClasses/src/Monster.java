

public class Monster{
	
	private String name;
	private int size;
	
	public Monster(String name, int size) {
		this.name = name;
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}
	public String getName() {
		return name;
	}
	
	public boolean isBigger(Monster m) {
		if(size>m.getSize()) {
			return true;
		}
		return false;
	}
	
	public boolean isSmaller(Monster m) {
		if(size<m.getSize()) {
			return true;
		}
		return false;
	}
	
	public boolean namesTheSame(Monster m) {
		if(name.equalsIgnoreCase(m.getName())) {
			return true;
		}
		return false;
	}
	
	
	
}