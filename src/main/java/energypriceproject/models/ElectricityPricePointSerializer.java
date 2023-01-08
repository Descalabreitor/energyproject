package energypriceproject.models;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import com.google.gson.JsonObject;

public class ElectricityPricePointSerializer {
    public static ElectricityPricePoint serialize(JsonObject jsonObject, Market market){
        ElectricityPricePoint electricityPricePoint = new ElectricityPricePointBuilder()
                                                    .setCheap(jsonObject.get("is-cheap").getAsBoolean())
                                                    .setDate(parseDate(jsonObject.get("date").getAsString()
                                                            ,jsonObject.get("hour").getAsString()))
                                                    .setMarket(market)
                                                    .setUnderAvg(jsonObject.get("is-under-avg").getAsBoolean())
                                                    .setPrice(jsonObject.get("price").getAsFloat())
                                                    .setUnits(jsonObject.get("units").getAsString())
                                                    .build();
        return electricityPricePoint;
    }

    private static ZonedDateTime parseDate(String asStringDate, String asStringHour) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
        ZoneId timeZone = ZoneId.of("Europe/Madrid");
        return LocalDateTime.parse(asStringDate + " "+ asStringHour, dateTimeFormatter).atZone(timeZone);
    }
}
