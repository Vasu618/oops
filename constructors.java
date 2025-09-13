class Geeks{
    String name;int id;
Geeks(String name,int id)
{
    this.name=name;
    this.id=id;
}

Geeks()
{
System.out.println("welcome to Geeks");
}
public static void main(String args[])
{
Geeks geek=new Geeks();
Geeks geek1=new Geeks( "jyoti basu",1234);
System.out.println("Geeks name ="+geek1.name+" geeks id="+geek1.id);
}
}
