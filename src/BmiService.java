public class BmiService {
    public float calculate(int a, float b){
        int result = (int) (a / (b * b));
        return result;
    }
}