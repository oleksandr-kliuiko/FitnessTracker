
public class Main {
    public static void main(String[] args) {
        Workout[] training = new Workout[] {
                new RunningTraining(90, 30, 70, 5),
                new RunningTraining(95, 40, 80, 10),
                new Crossfit(85, 20, 90, 75),
                new Kickboxing(75, 20, 90)
        };

        for (Workout w : training) {
            System.out.println(w.Info());
        }
    }
}