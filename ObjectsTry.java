class BaseClass1{
	int a;
	int b;
	BaseClass1(int a,int b){
		this.a=a;
		this.b=b;
	}

	int geta(){
		return this.a;
	}
	int getb(){
		return this.b;
	}
}
public class ObjectsTry extends BaseClass1{
	int c;
	ObjectsTry(int c){
		this.c = c;
		super(0,0);
	}
	ObjectsTry(int a,int b,int c){
		this(c);
		super(1,2);
	}
	public static void main(String[] args) {
		ObjectTry o=new ObjectTry(1,2,3);
		ObjectTry o2;
		o2=new ObjectTry(4,5,6);

	}
}
