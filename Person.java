public class Test{


}

	class Person{
		//签名: sleep( )
		public void sleep( ){       //方法名相同: sleep
			System.out.println("躺着睡..");
		}
		//签名: sleep(int)
		public void sleep(int age){  //方法名相同: sleep
			System.out.println("坐着睡..");
		}
	}




class Boss extends Person{
	public void sleep(double d){  //方法名相同: sleep
		System.out.println("站着睡..");
	}
}

