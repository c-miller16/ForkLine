package src.game;
//  imports
import src.game.Player;
import src.game.map.CityNode;

/**
 * A class to represent a House that can be placed on a city by a player
 * @version 0.1
 * @author devinlinux
 */
public class House {

    /**
     * The player associated with this House
     */
    private final Player PLAYER;

    /**
     * The CityNode (city) where this House is placed
     */
    private CityNode city;

    /**
     * Constructor to make a new House
     * @param PLAYER the Player associated with this House
     */
    public House(final Player PLAYER) {
        this.PLAYER = PLAYER;
        this.city = null;
    }

    /**
     * Setter to set the CityNode (city) where this House is placed
     * @param city the CityNode (city) where this House is to be placed
     */
    public void setCity(CityNode city) {
        this.city = city;
    }

    /**
     * Getter to return the Player associated with this House
     * @return the Player associated with this House
     */
    public Player player() {
        return this.PLAYER;
    }

    /**
     * Getter to return the CityNode (city) where this House was placed
     * @return the CityNode (city) where this House was placed
     */
    public CityNode city() {
        return this.city;
    }
}
