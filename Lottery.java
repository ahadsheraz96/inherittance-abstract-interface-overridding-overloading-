abstract public class Lottery {
    abstract  void average();
    abstract void arrayNumbers();
}
class AverageNumber extends Lottery{
    public void average(){
        int a=100; int b =200; int c=400;
        int ave=(a+b+c)/3;
        System.out.println(ave);
    }

    @Override
    void arrayNumbers() {

    }


}
class ArrayDemo extends Lottery{
    @Override
    void average() {

    }

    public void arrayNumbers(){
        int [] a={1,2,3,4,500,600,700};
        for(int x=0; x<a.length; x++){
            System.out.println(a[x]);
        }
    }


}
class Testa{
    public static void main(String[] args) {
        Lottery obj1=new AverageNumber();
        obj1.average();
        Lottery obj2=new ArrayDemo();
        obj2.arrayNumbers();
    }

}

