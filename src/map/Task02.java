package map;
//Напишите функцию, которая получает список из 100 значений
// (сгенерируйте его заранее с числами в диапазоне от 1 до 10) и число N,
//и выдаёт список из тех значений в этом списке, которые повторяются не менее N раз.
// Используйте словарь для этого.


import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Task02 {

public static final Logger logger = Logger.getLogger(
        Task02.class.getName());


    //2.
    public static List<Integer> function(ArrayList<Integer> arrayList, Integer N) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (Integer integer : arrayList) {
            if (map.containsKey(integer)) {
                int x = 1 + map.get(integer);
                map.replace(integer, x);
            } else {
                map.put(integer, 1);
            }
            if (map.get(integer) >= N && !result.contains(integer)) {
                result.add(integer);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 100;
        ArrayList<Integer> integers = new ArrayList<>(n);

        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            Integer x = rand.nextInt(1, 10);
            integers.add(x);
        }

        logger.log(Level.SEVERE, integers::toString);
        Integer m = 12;
        List<Integer> result = function(integers, m);
        logger.log(Level.SEVERE, result::toString);
    }
}
