public class polymorphismTest {
    public void fly(){
        System.out.println("Man can not fly");
    }
}
class superman extends polymorphismTest{
public void fly(){
    System.out.println("superman can fly");
}
}
