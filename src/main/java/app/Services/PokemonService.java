package app.Services;

public interface PokemonService {
    Object get_all();
    Object get_one(String pokemonName);

    Object search(String name);
}
