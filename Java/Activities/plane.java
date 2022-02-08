package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class plane {
    private List<String> passengers;
        private int maxPassengers;
        private Date lastTimeTookOf;
        private Date lastTimeLanded;
        public plane(int maxPassengers) {
            this.maxPassengers = maxPassengers;
            this.passengers = new ArrayList<>();
        }

        public void onboard(String passengers) {
            this.passengers.add(passengers);
        }

        public Date takeOff() {
            this.lastTimeTookOf = new Date();
            return lastTimeTookOf;
        }
        public void land() {
            this.lastTimeLanded = new Date();
            this.passengers.clear();
        }

        public Date getLastTimeLanded() {
            return lastTimeLanded;
        }

        public List<String> getPassengers() {
            return passengers;
        }

}
