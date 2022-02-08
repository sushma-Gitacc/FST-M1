package activities;

public class Activity7 {
    public static void main(String args[]) {
        MountainBike mb = new MountainBike(2, 0, 10);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(30);
        mb.applyBrake(10);
    }
}
