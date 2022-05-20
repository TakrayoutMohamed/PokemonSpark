package app;

import app.Controllers.PokemonController;
import app.Routes.PATH;

import static spark.Spark.port;
import static spark.Spark.get;
import static spark.Spark.staticFiles;

public class Application
{
    public static void main(String[] args) {
        port(8000);
        staticFiles.location("/public");

        //setup routes
        get(PATH.Web.INDEX , PokemonController.index);
        get(PATH.Web.DETAIL, PokemonController.detail);
    }
}
