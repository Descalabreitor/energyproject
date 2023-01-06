package energypriceproject.generator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class ApiRequester {
   public static String request(Zone zone) throws IOException {
      // Create the URL to the API endpoint
      URL url = new URL("https://api.preciodelaluz.org/v1/prices/now?zone=" + zone.toString());

      // Open the connection
      HttpURLConnection connection = (HttpURLConnection) url.openConnection();

      // Set the request method
      connection.setRequestMethod("GET");

      // Set any additional headers
      connection.setRequestProperty("Content-Type", "application/json");

      // Set any additional request parameters
      connection.setRequestProperty("key", "value");

      // Set the response format
      connection.setRequestProperty("Accept", "application/json");

      // Send the request
      connection.connect();

      // Get the response code
      int responseCode = connection.getResponseCode();

      // Check if the request was successful
      if (responseCode == 200) {
         // Read the response
         BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
         String inputLine;
         StringBuilder response = new StringBuilder();
         while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
         }
         in.close();
         return response.toString();
      } else {
         // Print the error message
         System.out.println("Request failed with code: " + responseCode);
      }
      return null;
   }
}

