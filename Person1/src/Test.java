
public class Test {

	public static void main(String[] args) {
		Person1 p=new Person1();


	Person1 taro=new Person1();
	taro.name="taro";
	taro.age=18;
	System.out.println(taro.name);
	System.out.println(taro.age);

	Person1 jiro=new Person1("jiro",20);
	System.out.println(jiro.name);
	System.out.println(jiro.age);

	Person1 saburo=new Person1("saburo");
	System.out.println(saburo.name);
	System.out.println(saburo.age);

	Person1 siro=new Person1(25);
	System.out.println(siro.name);
	System.out.println(siro.age);

	Person1 hanako=new Person1(17,"hanako");
	System.out.println(hanako.name);
	System.out.println(hanako.age);

	}

}
