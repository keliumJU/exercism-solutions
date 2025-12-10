public class Lasagna {
    private final int EXPECTED_MINUTES_IN_OVEN = 40;
    private final int LAYERS_TIME = 2;
    
    public int expectedMinutesInOven() {
        return EXPECTED_MINUTES_IN_OVEN;
    }
    public int remainingMinutesInOven(int n) {
       return 40 - n; 
    }
    public int preparationTimeInMinutes(int layers) {
        return LAYERS_TIME * layers;
    }
    public int totalTimeInMinutes(int layers, int timeOven){
        return 2 * layers + timeOven;
    }
}
