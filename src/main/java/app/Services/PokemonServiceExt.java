package app.Services;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class PokemonServiceExt {
    final String urlStr = "https://pokeapi.co/api/v2/pokemon/";
    public JSONObject connect_to_api(String pokemonName){
        try {
            URL url = new URL(this.urlStr+pokemonName);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("HttpResponseCode:" + conn.getResponseCode());
            } else {
                StringBuilder inline = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                //Write all the JSON data into a string using a scanner
                while (scanner.hasNext()) {
                    inline.append(scanner.nextLine());
                }
                //Close the scanner
                scanner.close();
                //Using the JSON simple library parse the string into a json object
                JSONParser parse = new JSONParser();
                return (JSONObject) parse.parse(inline.toString());
                //return data_obj;
            }
        }catch(Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
