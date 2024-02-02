public class BmiService {

    public int calculate(double weight, double height) {
        int result;
        result = (int) (weight / (height * height));
        return result;
    }
}

