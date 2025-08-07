class pen{
    String type;
    String colour;

    public void write(){
        System.out.println(this.colour);
    }
}


public class obj {
public static void main(String[] args) {
    pen p=new pen();
    p.colour="blue";
    p.type="wall";
    p.write();
}
    
}