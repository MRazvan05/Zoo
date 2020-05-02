public abstract class Animals {

    String name, countryOrigin;
    int visitingArea;

    public Animals(String name, String countryOrigin, int visitingArea) {
        this.name = name;
        this.countryOrigin = countryOrigin;
        this.visitingArea = visitingArea;
    }

    public String getName() {
        return name;
    }


    public int getVisitingArea() {
        return visitingArea;
    }

    public void setVisitingArea(int visitingArea) {
        this.visitingArea = visitingArea;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }
}
