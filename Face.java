interface Face {
    public abstract void features();
    public abstract  void looks();
}
interface Face3{
    public abstract void score();
}
class Display implements Face,Face3 {
    public void features(){
        System.out.println("this will show features");
    }
    public void looks(){
        System.out.println("this will show looks ");
    }
    public void score(){
        System.out.println("this will display score");
    }
}
class TestSpe{
    public static void main(String[] args) {
        Display obj1=new Display();
        obj1.features();
        obj1.looks();
        obj1.score();
    }
}
