import java.util.Enumeration;
import java.util.Hashtable;

public class SymbolTableDemo {
    public static void main(String[] args) {
        Hashtable<String, Integer> symbolTable = new Hashtable<>();
        symbolTable.put("A", 1);
        symbolTable.put("B", 2);
        symbolTable.put("C", 3);

        int valueA = symbolTable.get("A");
        System.out.println("Value of A: " + valueA);

        symbolTable.remove("B");

        Enumeration<String> keys = symbolTable.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("Key: " + key + ", Value: " + symbolTable.get(key));
        }
    }
}
