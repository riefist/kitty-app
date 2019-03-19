package osg3.kel6.kittyapp.model.response;

import java.util.List;

import osg3.kel6.kittyapp.model.Kitty;

public class ListKittyResponse {

    private List<Kitty> kitties;

    public ListKittyResponse(List<Kitty> kitties) {
        this.kitties = kitties;
    }

    public List<Kitty> getKitties() {
        return kitties;
    }

    public void setKitties(List<Kitty> kitties) {
        this.kitties = kitties;
    }
}
