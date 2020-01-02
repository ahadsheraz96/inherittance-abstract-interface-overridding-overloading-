public class OverDemo2 extends OverDemo {
    public static void main(String[] args) {

        OverDemo obj1=new OverDemo2();
        obj1.temprature();
        obj1.money();


    }
        public void temprature(){
          int x=100;
            System.out.println(x);
        }
    public void money(){
        int y =490;
        super.money();
        System.out.println(y);
    }
    }

