interface PracFace {
    public abstract void addition();
    public abstract void subtraction();
    public abstract  void multiplication();
}
class Calculator implements PracFace {
    public void addition(){
        System.out.println(100+200);
    }
    public void subtraction(){
        System.out.println(100-20);
    }
    public void multiplication(){
        System.out.println(78*2);
    }
}
class Test4 {
    public static void main(String[] args) {
        Calculator obj1=new Calculator();
        obj1.addition();
        obj1.multiplication();
        obj1.subtraction();
    }
}
