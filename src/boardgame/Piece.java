package boardgame;

public class Piece {
    protected Position posicao;
    private Tabuleiro tabuleiro;

    public Piece(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        posicao = null;
    }

    protected Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

}
