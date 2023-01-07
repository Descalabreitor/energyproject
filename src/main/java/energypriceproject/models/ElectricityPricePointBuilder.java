package energypriceproject.models;

public class ElectricityPricePointBuilder {
    
    private ElectricityPricePoint electricityPricePoint;

    public ElectricityPricePointBuilder(){
        electricityPricePoint = new ElectricityPricePoint();
    }

    public ElectricityPricePointBuilder setDate(String date) {
        electricityPricePoint.setDate(date);
        return this;
    }

    public ElectricityPricePointBuilder setHour(String hour) {
        electricityPricePoint.setHour(hour);
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
