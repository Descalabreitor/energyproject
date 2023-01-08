package energypriceproject.generator;

import java.io.IOException;

import energypriceproject.models.ElectricityPricePoint;

public interface ElectricityPricePointGenerator {
    ElectricityPricePoint generate() throws IOException;
}
