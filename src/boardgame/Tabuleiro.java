package boardgame;

public class Tabuleiro {

    private int linhas;
    private int colunas;
    private Piece[][] pieces;

    public Tabuleiro(int linhas, int colunas) {
        if (linhas < 1 || colunas < 1) {
            throw new BoardException("Erro ao criar o tabuleiro: É necessário que existe ao menos uma linha e uma coluna.");
        }
            this.linhas = linhas;
            this.colunas = colunas;
            pieces = new Piece[linhas][colunas];
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public Piece piece(int linha, int coluna) {
        if (!positionExists(linha, coluna)) {
            throw new BoardException("Posição não presente no tabuleiro");
        }
        return pieces[linha][coluna];
    }
    public Piece piece(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Posição não presente no tabuleiro");
        }
        return pieces[position.getLinha()][position.getColuna()];
    }
    public void placePiece (Piece piece, Position position) {
        if (thereIsAPiece(position)) {
            throw new BoardException("Já existe uma peça nessa posição " + position);
        }
        pieces[position.getLinha()][position.getColuna()] = piece;
        piece.posicao = position;
    }
    private boolean positionExists(int linha, int coluna) {
        return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
    }
    public boolean positionExists (Position position) {
        return positionExists(position.getLinha(), position.getColuna());
    }
    public boolean thereIsAPiece(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Posição não presente no tabuleiro");
        }
        return piece(position) != null;
    }
}
