package energypriceproject.generator;

import static org.junit.Assert.assertNotNull;
import java.io.IOException;

import org.junit.Test;

import energypriceproject.models.Market;

public class ApiRequesterTest {
    @Test
    public void testPCBRequest() throws IOException {
        String response = ApiRequester.request(Market.PCB);
        assertNotNull(response);
   }
   @Test
   public void testCYMRequest() throws IOException {
       String response = ApiRequester.request(Market.CYM);
       assertNotNull(response);
  }
    }
