package chess;


import boardgame.Piece;
import boardgame.Tabuleiro;

public abstract class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Tabuleiro tabuleiro, Color color) {
        super(tabuleiro);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
