package net.node.game.board.property.properties.types;

import net.node.game.board.property.BoardProperty;

public abstract class SymmetricProperty extends BoardProperty {
	
	public abstract void onMove(int move);
	
	@Override
	public void onMoveMake(int move) {
		onMove(move);
	}
	
	@Override
	public void onMoveUnmake(int move) {
		onMove(move);
	}
	
}
