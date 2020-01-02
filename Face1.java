interface Face1 {
    public abstract void sports();
    //public abstract  void phoneNumbers();
}
class PlayersInfo{
    public void sports(){
        int [] c ={100,200,300,400,500};
        for (int x =0; x<c.length; x++){
            System.out.println(c[x]);
        }
    }
}
class Testing1 {
    public static void main(String[] args) {
        PlayersInfo obj1=new PlayersInfo();
        obj1.sports();
    }
}
