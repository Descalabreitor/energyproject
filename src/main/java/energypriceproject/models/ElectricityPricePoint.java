package energypriceproject.models;

import java.time.ZonedDateTime;

public class ElectricityPricePoint {
    private ZonedDateTime date;
    private boolean isCheap;
    private boolean isUnderAvg;
    private Market market;
    private float price;
    private String units;

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

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market2) {
        this.market = market2;
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

    public ZonedDateTime getDate() {
        return date;
    }

    public void setDate(ZonedDateTime zonedDateTime) {
        this.date = zonedDateTime;
    }
}

