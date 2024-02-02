public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98;
        double height = 1.87;
        int bmi = service.calculate(weight, height);

        System.out.println("При весе тела: " + weight + " кг.");
        System.out.println("Росте тела: " + height + " м.");
        System.out.println("Индекс массы тела BMI равен:");
        System.out.println(bmi);
    }
}