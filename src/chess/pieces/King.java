package chess.pieces;

import boardgame.Tabuleiro;
import chess.Color;
import chess.ChessPiece;

public class King extends ChessPiece{
    public King(Tabuleiro tabuleiro, Color color) {
        super(tabuleiro, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
