package Services;

import java.util.ArrayList;
import java.util.List;

public class PrintServiceString {

    private List<String> list = new ArrayList<>();

    public void addValue(String value) {
        list.add(value);
    }

    public String first() {
        return list.get(0);
    }

    public void print() {
        if(!list.isEmpty()) {
            System.out.print("[" + list.get(0));
        }
        for(int i = 1; i < list.size(); i++) {
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }
}
