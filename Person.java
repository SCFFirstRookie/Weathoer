public class Test{


}

	class Person{
		//ǩ��: sleep( )
		public void sleep( ){       //��������ͬ: sleep
			System.out.println("����˯..");
		}
		//ǩ��: sleep(int)
		public void sleep(int age){  //��������ͬ: sleep
			System.out.println("����˯..");
		}
	}




class Boss extends Person{
	public void sleep(double d){  //��������ͬ: sleep
		System.out.println("վ��˯..");
	}
}

