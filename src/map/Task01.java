package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task01 {
    public static final Logger logger = Logger.getLogger(
            Task01.class.getName());

//1.
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        int n = 100;
        int[] arrayKeys = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            arrayKeys[i] = i;
        }
        for (int i = 0; i < n; i++) {
            int x = rand.nextInt(0, 99);
            map.put(arrayKeys[x], Integer.toString(i));
        }
        for (Map.Entry<Integer, String> i : map.entrySet()) {
            logger.log(Level.INFO ,() ->"key: " + i.getKey() + "; value: " + i.getValue());
        }
        map.clear();

    }
}
