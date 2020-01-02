import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

abstract public class Friends {
    abstract public String bestFriends();
    abstract public int friendsPhoneNumbers();
}
class Best extends Friends{
    public String bestFriends(){
        String a="afaq";
        String b="hassan";
        String c ="waqar";
        String d="amir";
        String all=a+" "+b+" "+c+" "+d;
        return all;

    }

    @Override
    public int friendsPhoneNumbers() {
        return 0;
    }

}
class CellNumbers extends Friends{


    @Override
    public String bestFriends() {
        return null;
    }

    public int friendsPhoneNumbers(){
        int amir=345;
        int waqar=516;
        int both=waqar+ amir;
        return both;
    }

}
class Test3{
    public static void main(String[] args) {
        Friends obj1=new Best();
        String N=obj1.bestFriends();
        System.out.println(N);
        Friends obj2=new CellNumbers();
        int z=obj2.friendsPhoneNumbers();
        System.out.println(z);
    }
}
