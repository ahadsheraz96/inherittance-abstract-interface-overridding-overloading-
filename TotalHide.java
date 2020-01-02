interface TotalHide {
    public abstract void numbers();
    //public abstract void luckyNumbers();
}

class Num implements TotalHide {
    public void numbers(){
        System.out.println(110);
    }
}
class Testing {
    public static void main(String[] args) {
        Num obj1=new Num();
        obj1.numbers();

    }
}