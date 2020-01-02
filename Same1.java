public class Same1 extends Same {
    public static void main(String[] args) {
        Same obj1=new Same1();
        obj1.fruits();
        obj1.phoneNumbers();

    }
    public void fruits(){
        int apples=509;
        int mango=508;
        super.fruits();
        System.out.println(apples+mango);
    }
    public void phoneNumbers(){
        int x=516;
        super.phoneNumbers();
        System.out.println(x);
    }
}
