package test;

import pack1.Protected1;
import pack1.Protected2;

public class TestInheritedClient extends Protected1 {
    Protected1 pr1= new Protected1();
    Protected2 pr2= new Protected2();
    public void display2(){

    }
}
class TestNotInherited{
    Protected1 pr1= new Protected1();
    Protected2 pr2= new Protected2();

    public void test(){

    }

}
