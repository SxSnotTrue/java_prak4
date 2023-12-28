class Human {
    private Head head;
    private Leg leg;
    private Hand hand;
    private double weight;
    private double height;
    private String name;

    public Human(double weight,double height,String color,String name) {
        head = new Head(color);
        leg = new Leg(height*0.4);
        hand = new Hand(height*0.3);
        this.weight =weight;
        this.height = height;
        this.name=name;
    }
    public void growUp(double grow){
        this.leg.growUp(grow*0.4);
        this.hand.growUp(grow*0.3);
        height+=grow;
    }
    public double getHeight(){
        return this.height;
    }

    public double getWeight(){
        return this.weight;
    }
    public String toString(){
        return "Name: "+this.name+"\n"+"height: "+this.height+"\n"+"weight: "+this.weight+"\n"
                +"Legs: "+this.leg.getLenght()+"\n"+"Hands: "+this.hand.getLenght();
    }
}