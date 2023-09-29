public class Kickboxing extends Workout {

    public Kickboxing(int avgPulse, int duration, int weight) {
        super(avgPulse, duration, weight);
    }

    @Override
    protected String Info() {
        return "Тренування з кікбоксингу\tТривалість: "+getDuration()
                +"\tКілокалорій: "+calorieConsumption(getWeight(), getDuration(), getAvgPulse());
    }
}
