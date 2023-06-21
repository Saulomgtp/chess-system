package chess;


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
    private void placeNewPiece(char coluna, int linha, ChessPiece piece) {
        tabuleiro.placePiece(piece, new ChessPosition(coluna, linha).toPosition());
    }

    private void initialSetup() {
        placeNewPiece('b', 6, new Rook(tabuleiro, Color.WHITE));
        placeNewPiece('e', 8, new King(tabuleiro, Color.BLACK));
        placeNewPiece('e', 1, new King(tabuleiro, Color.WHITE));
    }

}
