class OuterClass
{
    public void outerMethod()
    {
        System.out.println("This is outer class method");
    }
     class InnerClass
    {
        public void innerMethod()
        {
            System.out.println("This is inner class method");
        }
    }
}
public class demoSample {
    static void main(String[] args)
    {
        OuterClass outer=new OuterClass();
        outer.outerMethod();
        OuterClass.InnerClass inner=outer.new InnerClass();
        inner.innerMethod();
    }
}
