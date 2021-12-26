package Week14;
public class StringMethot {
    public static void main(String[] args) {
    String name ="Naphat   ";
    String city = new String("Nakhon Pathom");

    System.out.println(name+city);

    //การต่อสตริง .cancat()
    System.out.println(name+city);

    String result = name+city;
    System.out.println(result);

    String result2 = name+city+".com";
    System.out.println(result2);

    System.out.println(result2.concat(".ac.th"));

    // หาความยาวของสตริง .length
    System.out.println(name.length());

    int count= name.length();
    System.out.println(count);

    // หาตำแหน่งตัวอักษร .charAt
    System.out.println(name.charAt(3));
    char charavters=name.charAt(3);
    System.out.println(charavters);
    
    }
}
