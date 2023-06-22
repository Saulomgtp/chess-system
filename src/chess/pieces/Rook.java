package chess.pieces;

import boardgame.Tabuleiro;
import chess.Color;
import chess.ChessPiece;

public class Rook extends ChessPiece{
    public Rook(Tabuleiro tabuleiro, Color color) {
        super(tabuleiro, color);
    }

    @Override
    public String toString() {
        return "R";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getTabuleiro().getLinhas()][getTabuleiro().getColunas()];
        return mat;
    }
}
