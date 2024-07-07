import java.util.ArrayList;
import java.util.Arrays;

// Основной класс программы
public class Main {
    public static void main(String[] args) {
        int k = 2;
        ArrayList<Integer> asList = new ArrayList<>(Arrays.asList(1, 2, 3, 5));

        // Создание экземпляров классов
        SubArrayProcessor processor = new AverageProcessor();
        SubArrayHandler handler = new SubArrayHandler(processor);

        try {
            // Вызов метода для обработки подмассивов
            handler.printSubArray(asList, k);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
