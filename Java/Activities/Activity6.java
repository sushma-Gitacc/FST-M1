package activities;

public class Activity6 {



        public static void main(String[] args) throws InterruptedException {


            Plane1 plane = new Plane1(10);

            plane.onboard("Sushma");
            plane.onboard("Karthikeya");
            plane.onboard("Surya");
            plane.onboard("passenger1");

            System.out.println("Plane took off at: " + plane.takeOff());

            System.out.println("Passengers on the plane: " + plane.getPassengers());

            Thread.sleep(3000);

            plane.land();

            System.out.println("Time at which plane landed: " + plane.getLastTimeLanded());
            System.out.println("Number of people after landing the plane: " + plane.getPassengers());

    }

}
