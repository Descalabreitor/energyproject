package energypriceproject.models;

import java.time.ZonedDateTime;

public class ElectricityPricePointBuilder {
    
    private ElectricityPricePoint electricityPricePoint;

    public ElectricityPricePointBuilder(){
        electricityPricePoint = new ElectricityPricePoint();
    }

    public ElectricityPricePointBuilder setDate(ZonedDateTime zonedDateTime) {
        electricityPricePoint.setDate(zonedDateTime);
        return this;
    }

    public ElectricityPricePointBuilder setCheap(boolean cheap) {
        electricityPricePoint.setCheap(cheap);
        return this;
    }

    public ElectricityPricePointBuilder setUnderAvg(boolean underAvg) {
        electricityPricePoint.setUnderAvg(underAvg);
        return this;
    }

    public ElectricityPricePointBuilder setMarket(Market market) {
        electricityPricePoint.setMarket(market);
        return this;
    }

    public ElectricityPricePointBuilder setPrice(float price) {
        electricityPricePoint.setPrice(price);
        return this;
    }

    public ElectricityPricePointBuilder setUnits(String units) {
        electricityPricePoint.setUnits(units);
        return this;
    }

    public ElectricityPricePoint build() {
        return electricityPricePoint;
    }
}
