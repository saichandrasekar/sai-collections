
public class SaiStackTest {
	
	
	public static void main(String a[]){		
		test_1();		
		test_2();	
		test_3();	
	}
	
	private static void test_1(){
		SaiStack saiStack = new SaiStack();
		System.out.println(saiStack);
	}
	
	private static void test_2(){
		SaiStack saiStack = new SaiStack();
		System.out.println(saiStack);
		
		saiStack.push(14);
		System.out.println(saiStack);
		
		saiStack.push(13);
		System.out.println(saiStack);
		
		saiStack.push(23);
		System.out.println(saiStack);
		
		saiStack.push(24);
		System.out.println(saiStack);
		
		saiStack.push(19);
		System.out.println(saiStack);
		
		saiStack.push(14);
		System.out.println(saiStack);
	}
	
	private static void test_3(){
		SaiStack saiStack = new SaiStack();
		saiStack.push(14);
		saiStack.push(13);
		saiStack.push(23);
		saiStack.push(24);
		saiStack.push(19);
		saiStack.push(14);
		
		saiStack.pop();
		System.out.println(saiStack);
	}
	
}

class SaiStack {
	
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
	
	public String toString(){
		String output = "";
		for(int count=0;count<topIndex;count++){
			output+=space[count];
			output+=", ";
		}		
		return output+"with height: "+topIndex ;
	}
}