abstract class Workout {
    private int avgPulse;
    private int duration;
    private int weight;

    public Workout(int avgPulse, int duration, int weight) {
        this.avgPulse = avgPulse;
        this.duration = duration;
        this.weight = weight;
    }

    protected double calorieConsumption (int weight, int duration, int avgPulse) {
        return 0.014 * weight * duration * (0.12 * avgPulse -7);
    }

    protected abstract String Info();

    public int getAvgPulse() {
        return avgPulse;
    }

    //public void setAvgPulse(int avgPulse) {
    //    this.avgPulse = avgPulse;
    //}

    public int getDuration() {
        return duration;
    }

    //public void setDuration(int duration) {
    //    this.duration = duration;
    //}

    public int getWeight() {
        return weight;
    }

    //public void setWeight(int weight) {
    //    this.weight = weight;
    //}

}
