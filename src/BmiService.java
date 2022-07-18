public class BmiService {
    public float calculate(int weight, float height){
        int result = (int) (weight / (height * height));
        return result;
    }
}