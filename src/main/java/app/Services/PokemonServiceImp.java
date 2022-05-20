package app.Services;

public class PokemonServiceImp extends PokemonServiceExt implements PokemonService{
    @Override
    public Object get_all()
    {
        return this.connect_to_api("").get("results");
    }
    @Override
    public Object get_one(String name)
    {
        return this.connect_to_api(name);
    }

    @Override
    public Object search(String name) {
        return null;
    }
}
