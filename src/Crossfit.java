public class Crossfit extends Workout {
    private int avgWeightBarbell;
    public Crossfit(int avgPulse, int duration, int weight, int avgWeightBarbell) {
        super(avgPulse, duration, weight);
        this.avgWeightBarbell = avgWeightBarbell;
    }

    @Override
    protected String Info() {
        return "Кросфіт тренування!\tТривалість в хв: "+getDuration()+"\tСередня вага штанги: "+avgWeightBarbell
                +"\tКілокалорій: "+calorieConsumption(getWeight(), getDuration(),getAvgPulse())
                +"\nВага спортсмена: "+getWeight()+"\tСередній пульс за тренування: "+getAvgPulse()+"\n";
    }
}
