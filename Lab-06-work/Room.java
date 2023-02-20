public class Room {
    int roomno;
    String roomtype;
    float roomarea;
    boolean Acmachine;
    Room(){
        System.out.println("Hello World");
    }
    Room(int roomno, String roomtype, float roomarea, boolean Acmachine){
        this.roomno = roomno;
        this.roomtype = roomtype;
        this.roomarea = roomarea;
        this.Acmachine = Acmachine;
    }
    public void displayData(){
        System.out.println(roomno);
        System.out.println(roomtype);
        System.out.println(roomarea);
        System.out.println(Acmachine);
        
    }
    public static void main(string[] args){
        new Room();
        Room b1 = new Room( 128, "CSE", 4652, false);
        b1.displayData();
    }
}
