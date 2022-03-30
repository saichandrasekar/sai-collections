
public class SaiStackTest {
	
	
	public static void main(String a[]){		
		test_1();		
		test_2();	
		test_3();	
		test_clearAll();
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
	
	private static void test_clearAll(){
		SaiStack saiStack = new SaiStack();
		saiStack.push(14);
		saiStack.push(13);
		saiStack.push(23);
		saiStack.push(24);
		saiStack.push(19);
		saiStack.push(14);
		
		saiStack.pop();
		
		saiStack.clearAll();
		System.out.println(saiStack);
	}
}

