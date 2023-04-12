public class BmiService {
    public double calculate(double height_meters, int weight_kg) {
        double index = (weight_kg / (height_meters * height_meters));
        return index;

    }

}
