package boardgame;

public class Tabuleiro {

    private int linhas;
    private int colunas;
    private Peca[][] pieces;

    public Tabuleiro(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        pieces = new Peca[linhas][colunas];
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }

    public Peca peca(int linha, int coluna) {
        return pieces[linha][coluna];
    }
    public Peca peca(Position position) {
        return pieces[position.getLinha()][position.getColuna()];
    }


}
