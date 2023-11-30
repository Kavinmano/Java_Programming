package OOPS.TypesOfInheritance;

public class Single_Inheritance {
    public static void main(String[] args) {
        Daughter s = new Daughter();
        System.out.println(s.gender);
        s.print();

        GrandDaughter su = new GrandDaughter();
        System.out.println(su.gender);
        su.print();

        GGDaughter GD = new GGDaughter();
        System.out.println(GD.gender);
        GD.print();
    }
}

class GrandFather {
    char gender = 'M';

    void print() {
        System.out.println("Parent Class");
    }
}
class Mother extends GrandFather{
    char gender = 'F';
}

class Daughter extends Mother {

}
class GrandDaughter extends Daughter{ //Hybrid Inheritance
        void print()
        {
            System.out.println("GrandDaughter");
        }
}
class GGDaughter extends  GrandDaughter
{
    void print()
    {
        System.out.println("GGDaughter");
    }
}
//Multiple Inheritance Means Two Parents And One Child!!