package energypriceproject.generator;

import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import energypriceproject.models.ElectricityPricePoint;
import energypriceproject.models.ElectricityPricePointSerializer;
import energypriceproject.models.Market;

public class AutonomousCitiesDataGenerator implements ElectricityPricePointGenerator{

    @Override
    public ElectricityPricePoint generate() throws IOException {
        String rawElecticityPricePoint = ApiRequester.request(Market.CYM);
        JsonObject electricityPricePointJsonObject = new Gson()
            .fromJson(rawElecticityPricePoint, JsonObject.class);
        ElectricityPricePoint electricityPricePoint = ElectricityPricePointSerializer.serialize(electricityPricePointJsonObject, Market.CYM);
        return electricityPricePoint;
    }
    
}
