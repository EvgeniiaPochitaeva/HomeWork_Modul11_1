package homeWork_Modul11_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HumanTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ivan");
        list.add("Ruslan");
        list.add("Peter");
        list.add("Artem");

        String result = getIndexAndNameString(list);

        System.out.println(result);
    }

    private static String getIndexAndNameString(List<String> list) {
        List<String> newSpisok = IntStream.range(0, list.size())
                .filter(i->i%2!=1)
                .mapToObj(i -> (i + 1) + ". " + list.get(i))
                .collect(Collectors.toList());

        return String.join(", ", newSpisok);
    }
}


