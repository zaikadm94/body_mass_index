public class BmiService {
    public double calculate(double heightMeters, int weightKg) {
        double index = (weightKg / (heightMeters * heightMeters));
        return index;

    }

}
