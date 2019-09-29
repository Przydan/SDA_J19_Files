package pl.sda.files.csv.reader;

public class VacationsPlans {
    private String country;
    private String city;
    private String travelDate;
    private int daysPeriod;
    private double cost;



    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    public int getDaysPeriod() {
        return daysPeriod;
    }

    public void setDaysPeriod(int daysPeriod) {
        this.daysPeriod = daysPeriod;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
