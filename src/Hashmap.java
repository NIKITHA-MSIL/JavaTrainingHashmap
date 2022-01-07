import java.util.HashMap;
import java.util.Scanner;

public class Hashmap {
    static 	Scanner sc = new Scanner(System.in);
    static HashMap<String,String>maps = new HashMap<String,String>();
    public static void main(String[]args) {

        maps.put("100", "kavya");
        maps.put("101", "kiran");
        maps.put("102", "Anju");
        maps.put("103", "parvathy");
        maps.put("104", "karishma");
        maps.put("105", "sadhika");
        System.out.println("map is "+maps);
        String input = "";
        while(true)
        {
            System.out.println("1.search or add\n2.remove\n3.replace\n select any option");
            if(sc.hasNext()) {
                input = sc.nextLine();
            }

            switch(input)
            {
                case "1": searchandadd();
                    break;
                case "2":remove();
                    break;
                case "3":replace();
                    break;
                default:break;
            }
        }
    }

    public static void searchandadd()
    {
        System.out.println("enter a key to search or add");
        String input = sc.nextLine();
        if(maps.containsKey(input))
        {
            System.out.println("key is already present");

        }
        else
        {
            System.out.println("enter a value to add");
            String value = sc.nextLine();
            maps.put(input, value);
            System.out.println("map is "+maps);

        }
    }
    public static void remove()
    {
        System.out.println("enter a key to remove");
        String value = sc.nextLine();
        maps.remove(value);
        System.out.println("map is "+maps);
    }
    public static void replace()
    {
        System.out.println("enter  key and value to replace");
        String key = sc.nextLine();
        String value = sc.nextLine();
        maps.replace(key, value);
        System.out.println("map is "+maps);

    }
}
