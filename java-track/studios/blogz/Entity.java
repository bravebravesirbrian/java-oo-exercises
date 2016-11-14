package blogz;

public abstract class Entity {
	
	private static int uniqueUid = 0;
	
	private final int uid;
	
	public Entity(){
		this.uid = uniqueUid + 1;
	}
	
	public int getUid(){
		return this.uid;
	}
}
