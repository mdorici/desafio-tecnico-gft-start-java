package challenge02;

import java.util.ArrayList;
import java.util.List;

public class Monkey {
    private String name;
    private List<String> stomach = new ArrayList<>();

    public void toEat(String food) {
        if(stomach.size() == 3) {
            System.out.println("Full");
        }
        else {
            stomach.add(food);
        }
        System.out.println(stomach);
    }

    public void toDigest() {
        if(stomach.isEmpty()) {
            System.out.println("Empty");
        }
        else {
            stomach.remove(stomach.get(0));
        }
        System.out.println(stomach);
    }
}
