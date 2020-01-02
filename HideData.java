abstract public class HideData {
    abstract void luckyNumber();
}
class Number extends HideData{
    public void luckyNumber(){
        for(int x=0; x<10; x++){
            System.out.println(x);
        }
    }

}
class Test {
    public static void main(String[] args) {
        HideData Obj1=new Number();
        Obj1.luckyNumber();
    }
}

