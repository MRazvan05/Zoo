public class Zoo extends Animals implements Birds, wildAnimals {

    private String food;

    public Zoo(String name, String countryOrigin, int visitingArea, String food) {
        super(name, countryOrigin, visitingArea);
        this.food = food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public void sleep() {
        System.out.println(this.name + "is sleeping. \n ZzZzZz!");
    }

    @Override
    public boolean isEating() {
        return true;
    }

    @Override
    public boolean isFlying() {
        return true;
    }

    @Override
    public String toString() {
        return "Animal : " + this.name + ", country of origin : " + this.countryOrigin + ", are : " + this.visitingArea;
    }

    @Override
    public void eat() {
        if(isEating())
            System.out.println(this.name + " is eating " + this.food + " right now.");
        else
            sleep();
    }

    @Override
    public void fly() {
        if(isFlying())
            System.out.println(this.name + " is flying right now.");
        else
            sleep();
    }

}
