public class Kickboxing extends Workout {

    public Kickboxing(int avgPulse, int duration, int weight) {
        super(avgPulse, duration, weight);
    }

    @Override
    protected String Info() {
        return "Тренування з кікбоксингу!\tТривалість в хв: "+getDuration()
                +"\tКілокалорій: "+calorieConsumption(getWeight(), getDuration(), getAvgPulse())
                +"\nВага спортсмена: "+getWeight()+"\tСередній пульс за тренування: "+getAvgPulse()+"\n";
    }
}
