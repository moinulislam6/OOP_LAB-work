public class Person {
    private String Name;
    private int ID;
    Person(String Name, int ID){
        this.Name = Name;
        this.ID = ID;
    }
    public String getName(){
        return Name;
    }
    public int getID(){
        return ID;
    }
    public static void main(String[] arg){
        Person b1 = new Person("Moinul Islam", 4652);
        System.out.println(b1.getName());
        System.out.println(b1.getID());
    }
}
