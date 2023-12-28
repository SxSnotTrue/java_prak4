public class Head {
    private String hairColor;

    public Head(String color) {
        this.hairColor = color;
    }

    public String getColor() {
        return hairColor;
    }

    public void setColor(String color) {
        this.hairColor = color;
    }
    public void hairLightening(double grow) {
        this.hairColor = "Blonde";
    }

}