package app.Controllers;

import app.Services.PokemonService;
import app.Services.PokemonServiceImp;
import spark.Request;
import spark.Response;
import spark.Route;

public class PokemonController {
    static final PokemonService pokemonService= new PokemonServiceImp();
    public static Route index = (Request request, Response response) ->
    {
        response.type("application/json");
        return pokemonService.get_all();
    };

    public static Route detail = (Request request, Response response) ->
    {
        response.type("application/json");
        return pokemonService.get_one(request.params(":name"));
    };
}
