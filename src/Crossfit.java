public class Crossfit extends Workout {
    private int avgWeightBarbell;
    public Crossfit(int avgPulse, int duration, int weight, int avgWeightBarbell) {
        super(avgPulse, duration, weight);
        this.avgWeightBarbell = avgWeightBarbell;
    }

    @Override
    protected String Info() {
        return "Кросфіт тренування!\tТривалість: "+getDuration()+"\tСередня вага штанги: "+avgWeightBarbell
                +"\tКілокалорій: "+calorieConsumption(getWeight(), getDuration(),getAvgPulse());
    }
}
