import java.util.Arrays;
import java.util.Comparator;

class Item {
    int profit, weight;

    public Item(int profit, int weight) {
        this.profit = profit;
        this.weight = weight;
    }
}

public class FractionalKnapsack {
    public static double fractionalKnapsack(int W, Item[] arr) {
        Arrays.sort(arr, Comparator.comparingDouble(item -> (double) item.profit / item.weight));
        double res = 0.0;
        int currCap = W;

        for (Item item : arr) {
            if (item.weight <= currCap) {
                res += item.profit;
                currCap -= item.weight;
            } else {
                res += (double) item.profit * currCap / item.weight;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int W = 50;
        Item[] arr = {new Item(60, 10), new Item(100, 20), new Item(120, 30)};
        System.out.println("Maximum profit: " + fractionalKnapsack(W, arr));
    }
}
