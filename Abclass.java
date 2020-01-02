abstract class Abclass {
    abstract void numbers();
    abstract  void names();
}
class Nums extends Abclass{
    void numbers(){
        System.out.println("this method will show numbers ");
    }
    void names(){
        System.out.println("this method will show names ");
    }
}
 class Mtest{
     public static void main(String[] args) {
         Nums obj1=new Nums();
         obj1.numbers();
         obj1.names();
     }
 }
