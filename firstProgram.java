public class firstProgram {
    public static void main(String[] args) {
        Flight F1 = new Flight();
        F1.add1Passenger();
        System.out.println(F1.passengers);

    }

    public static class Flight {
        private int passengers;
        private int seats;

        Flight() {
            passengers = 0;
            seats = 2;
        }

        public int add1Passenger() {
            if (passengers < seats) {
                passengers = passengers + 1;
            } else {
                handleTooMany();
            }
            return passengers;
        }

        private void handleTooMany() {
            System.out.println("Too Many");
        }
    }
}