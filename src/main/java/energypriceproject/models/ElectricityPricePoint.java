package energypriceproject.models;

public class ElectricityPricePoint {
    private String date;
    private String hour;
    private boolean isCheap;
    private boolean isUnderAvg;
    private Market market;
    private float price;
    private String units;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public boolean isCheap() {
        return isCheap;
    }

    public void setCheap(boolean cheap) {
        isCheap = cheap;
    }

    public boolean isUnderAvg() {
        return isUnderAvg;
    }

    public void setUnderAvg(boolean underAvg) {
        isUnderAvg = underAvg;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }
}

