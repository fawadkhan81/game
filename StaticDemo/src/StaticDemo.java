class emp{
	
	
	int a;
	int b;
	static String s;
	static {
		
	}
	public emp(){
		a=1;
		b=4200;
		s="lary";
		
	}
	public void show() {
		
		
		System.out.println(a+":"+b+":"+s);
	}
	
}
public class StaticDemo {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
emp e=new emp();
e.a=400;
e.b=800;
emp.s="koko";

emp r=new emp();
r.a=300;
r.b=8300;
emp.s="man";

e.show();
r.show();
	}

}
