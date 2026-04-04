abstract class Ride {
    int distance;
    abstract int calculateFare();
}

class BikeRide extends Ride {
    int calculateFare() {
        return distance * 5;
    }
}

class AutoRide extends Ride {
    int calculateFare() {
        return distance * 8;
    }
}

class CarRide extends Ride {
    int calculateFare() {
        return distance * 12;
    }
}
