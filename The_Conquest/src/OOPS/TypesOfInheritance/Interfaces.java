package OOPS.TypesOfInheritance;
//Interface have Many Parent Class
interface Father{ //Interface Must be Abstract
    abstract void call();
    abstract void talk();
}
class Interface implements Father{
   public  void call(){
        System.out.println("Calling");
    }
    public void talk(){
        System.out.println("Talking");
    }

    public static void main(String[] args) {
        Interface ob = new Interface();
        ob.call();
        ob.talk();
    }
}