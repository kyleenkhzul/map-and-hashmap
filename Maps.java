import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        
        HashMap<String, Integer> empIds = new HashMap<>();
         
        empIds.put("John", 12345);
        empIds.put("Carl", 54321);
        empIds.put("Jerry", 8675309);

        System.out.println(empIds);

        System.out.println(empIds.get("Carl"));

        System.out.println(empIds.containsKey("George"));

        System.out.println(empIds.containsValue(8675309));

        empIds.put("John", 98765);
        System.out.println(empIds);

        // replace function only replaces a hash key if it exists
        empIds.replace("Kramer", 777);
        System.out.println(empIds);

        //putIfAbsent only updates IF ABSENT. will not affect current keys
        empIds.putIfAbsent("Steve", 222);
        System.out.println(empIds);

        empIds.remove("Steve");
        System.out.println(empIds);

    }
    
}
