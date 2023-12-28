public class Hand {
    private double lenght;

    public Hand(double lenght) {
        this.lenght = lenght;
    }

    public double getLenght() {
        return lenght;
    }

    public void setlenght(double lenght) {
        this.lenght = lenght;
    }
    public void growUp(double grow) {
        this.lenght += grow;
    }

}