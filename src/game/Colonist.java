package src.game;

//  imports
import src.game.map.PathNode;
import src.game.player.Player;

import static src.game.Colonist.ColonistType.SEA;
import static src.game.Colonist.ColonistType.LAND;

/**
 * A class to represent a colonist
 * 
 * @author Jonah Cook
 * @author Caroline Miller
 */
public class Colonist {

	/**
	 * The player that the colonist is associated with
	 */
	private final Player PLAYER;

	/**
	 * The current path that the colonist is on
	 */
	private PathNode path;

	/**
	 * The type of colonist that this colonist is
	 */
	private final ColonistType TYPE;

	/**
	 * Constructor to make a new Colonist
	 * 
	 * @param PLAYER the player that the colonist is associated with
	 * @param TYPE the type of colonist that this colonist is
	 */
	public Colonist(final Player PLAYER, final ColonistType TYPE) {
		this.PLAYER = PLAYER;
		this.TYPE = TYPE;
	}

	/**
	 * Getter to get the player that this Colonist is associated with
	 */
	public Player player() {
		return this.PLAYER;
	}

	/**
	 * Getter to return the PathNode that this colonist is on
	 */
	public PathNode path() {
		return this.path;
	}

	/**
	 * Getter method to return the type of colonist this is
	 */
	public ColonistType type() {
		return this.TYPE;
	}

	/**
	 * Getter to return whether this colonist is a land colonist
	 */
	public boolean isLand() {
		return this.TYPE == LAND;
	}

	/**
	 * Getter to return whether this colonist is a sea colonist
	 */
	public boolean isSea() {
		return this.TYPE == SEA;
	}

	/**
	 * Method to determine if this colonist can move to a PathNode
	 * @param node the PathNode to move to
	 */
	public boolean canMoveTo(PathNode node) {
		return false;
	}

	/**
	 * Setter method to set the PathNode of this Colonist
	 * @param path the PathNode this Colonist is on
	 */
	public void setPathNode(PathNode path) {
		this.path = path;
	}

	/**
	 * An enum to represent the type of colonist that a colonist is
	 */
	public enum ColonistType {
		SEA,
		LAND
	}
}