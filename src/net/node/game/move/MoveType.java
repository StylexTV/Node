package net.node.game.move;

import net.node.game.serialize.Serializer;

public class MoveType {
	
	public static final int QUIET = 0;
	public static final int TACTICAL = 1;
	
	public static int ofMove(int move) {
		return Serializer.MOVE.getComponent(move, Serializer.MOVE_TYPE);
	}
	
}
