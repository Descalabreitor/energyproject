package energypriceproject.models;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class ElectricityPricePointSerializerTest {
    @Test
    public void testSerialize() {
        String jsonString = "{\"date\":\"08-01-2023\",\"hour\":\"12-13\",\"is-cheap\":true,\"is-under-avg\":true,\"market\":\"PVPC\",\"price\":34.61,\"units\":\"€/Mwh\"}";
        JsonObject jsonObject = new Gson().fromJson(jsonString, JsonObject.class);
        ElectricityPricePointSerializer.serialize(jsonObject, Market.PCB);
        assertNotNull(jsonObject);
    }

}
