package energypriceproject.generator;

import org.junit.Assert;
import org.junit.Test;

public class ApiRequesterTest {
    @Test
    public void testPCBRequest() {
        String response = ApiRequester.request(Zone.PCB);
        assertEquals("Success", response);
   }
   @Test
   public void testCYMRequest() {
       String response = ApiRequester.request(Zone.CYM);
       assertEquals("Success", response);
  }
    }
