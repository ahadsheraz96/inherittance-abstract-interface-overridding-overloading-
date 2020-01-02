public class Meth {
    /**
     *in this class we are gonna pratice method overloading
     * it can be acheived three different ways
     * thru different number of parameters
     * thru different sequence of data types
     * thru different data types of the argument
     **/
    public static void main(String[] args) {

    Meth obj1=new Meth();
    obj1.finalScore(89);
    obj1.finalScore(45,90);
    }
    public void finalScore(int x ){
        System.out.println(x);

    }
    public void finalScore(int x ,int y ){
        System.out.println(x+y);
    }
}
