public class SaiStack {
	
	private int topIndex;
	
	private int[] space;
	
	public SaiStack(){
		this.space = new int[100];
		this.topIndex = 0;
	}
	
	private int getHeight(){
		return this.topIndex;
	}
	
	public void push(final int value){
		this.space[topIndex] = value;
		this.topIndex++;
	}
	
	public int pop(){
		this.topIndex--;
		int value = this.space[topIndex];		
		return value;
	}
	
	public void clearAll(){
		this.topIndex=0;
	}
	
	public String toString(){
		String output = "";
		for(int count=0;count<topIndex;count++){
			output+=space[count];
			output+=", ";
		}		
		return output+"with height: "+topIndex ;
	}
}