package net.node.game.board.view.views;

import net.node.game.board.view.BoardView;
import net.node.game.piece.Piece;

public class SquareView extends BoardView {
	
	private int[] pieces = new int[];
	
	@Override
	public void removePiece(int square, int piece) {
		setPiece(square, Piece.NONE);
	}
	
	@Override
	public void setPiece(int square, int piece) {
		pieces[square] = piece;
	}
	
	public int getPiece(int square) {
		return pieces[square];
	}
	
}
