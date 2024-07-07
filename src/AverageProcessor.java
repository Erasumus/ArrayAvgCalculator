import java.util.List;

// Реализация интерфейса для вычисления среднего значения подмассива
public class AverageProcessor implements SubArrayProcessor {
    @Override
    public double processSubArray(List<Integer> subArray, int k) {
        int sum = 0;
        for (int num : subArray) {
            sum += num;
        }
        return sum / (double) k;
    }
}
