public class Meth2 {
    public static void main(String[] args) {
        Meth2 obj1=new Meth2();
        String y=obj1.differentDataType(34,"ahad");
        System.out.println(y);
        String z=obj1.differentDataType("ahad",78);
        System.out.println(z);
    }
    public String differentDataType(int x ,String name ){
        return  x+" "+name;
    }
    public String differentDataType(String name, int x ){
        return name+" "+x;
    }
}
