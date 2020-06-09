package dailimoshi;



//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		SchoolGirl jiaojiao = new SchoolGirl();
		jiaojiao.setName("小可爱");

		Proxy daili = new Proxy(jiaojiao);
		daili.giveDolls();
		daili.giveFlowers();
		daili.giveChocolate();
	}
}
/*
//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		SchoolGirl jiaojiao = new SchoolGirl();
		jiaojiao.setName("小可爱");

		Proxy daili = new Proxy(jiaojiao);

		daili.giveDolls();
		daili.giveFlowers();
		daili.giveChocolate();
	}
}
*/
/*
//客户端代码
public class Main
{
	public static void main(String[] args)
	{
		SchoolGirl jiaojiao = new SchoolGirl();
		jiaojiao.setName("小仙女");

		Pursuit zhuojiayi = new Pursuit(jiaojiao);

		zhuojiayi.giveDolls();
		zhuojiayi.giveFlowers();
		zhuojiayi.giveChocolate();
	}
}
*/