package chess;

import boardgame.Position;
import boardgame.Tabuleiro;
import chess.pieces.King;
import chess.pieces.Rook;


public class ChessMatch {

    private Tabuleiro tabuleiro;

    public ChessMatch () {
        tabuleiro = new Tabuleiro(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for (int i = 0; i < tabuleiro.getLinhas(); i++) {
            for (int j = 0; j< tabuleiro.getColunas(); j++) {
                mat[i][j] = (ChessPiece) tabuleiro.piece(i, j);
            }
        }
        return mat;
    }

    private void initialSetup() {
        tabuleiro.placePiece(new Rook(tabuleiro, Color.WHITE), new Position(2, 1));
        tabuleiro.placePiece(new King(tabuleiro, Color.BLACK), new Position(0, 4));
        tabuleiro.placePiece(new King(tabuleiro, Color.WHITE), new Position(7, 4));
    }

}
