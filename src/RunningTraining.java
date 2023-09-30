public class RunningTraining extends Workout {
    private int distance;
    public RunningTraining(int avgPulse, int duration, int weight, int distance) {
        super(avgPulse, duration, weight);
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    protected String Info() {
        return "Бігове тренування!\tТривалість в хв: "+getDuration()
                +"\tДистанція в км: "+getDistance()+"\tКілокалорій: "
                +calorieConsumption(getWeight(), getDuration(), getAvgPulse())
                +"\nВага спортсмена: "+getWeight()+"\tСередній пульс за тренування: "+getAvgPulse()+"\n";

    }
}
