package controllers;

import Model.Deck;
import ninja.Context;
import ninja.Result;
import ninja.Results;

/**
 * Created by Codysseus on 1/22/2016.
 */
public class DeckController {

    public Result DeckMVCJsonListGet(){
        Deck tl = new Deck();

        return Results.json().render(tl);
    }
    public Result DeckMVCJsonListPost(Context context, Deck list) {

        return Results.json().render(list.draw());
    }
}
