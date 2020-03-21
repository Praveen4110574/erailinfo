package pages;

public class ParentClass {
int a=10,b=20;
public ParentClass(int a,int b) {
	this.a=a;
	this.b=b;
}

public int add(int a,int b) {
	return a+b;
}

public int subtract(int a,int b) {
	return b-a;
}

public static void main(String[] args) {
	ParentClass calculate=new ParentClass(40,40);
	int sumResult = calculate.add(25, 35);
	System.out.println(sumResult);
}

}
