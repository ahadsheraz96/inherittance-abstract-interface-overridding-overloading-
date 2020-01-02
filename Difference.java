public class Difference {
    public static void main(String[] args) {
        Difference obj1=new Difference();
        obj1.myId(90);
        obj1.myId("khan");

    }
    public void myId(int x ){
        System.out.println(x);
    }
    public void myId(String name){
        System.out.println(name);
    }
}
