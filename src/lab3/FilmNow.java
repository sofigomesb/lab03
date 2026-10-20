package lab3;

public class FilmNow {
    private Filme[] filmes;
    private Filme[] hotList;

    public FilmNow() {
        this.filmes = new Filme[100];
        this.hotList = new Filme[10];
    }

    public boolean adicionaFilme (String nome, int anoDeLançamento, String local, int posiçãoFilmeLista){
        Filme filme = new Filme(nome, anoDeLançamento, local);

        if (posiçãoFilmeLista < 1 || posiçãoFilmeLista > 100) {
            return false;
        }

        for (int i = 0; i < 100; i++) {
            if (filmes[i] != null && filmes[i].equals(filme)) {
                return false;
            }
        }

        if (nome.isBlank() || local.isBlank()) {
            return false;
        }
        this.filmes[posiçãoFilmeLista-1] = filme;
        return true;
    }

    public String[] mostraFilmes() {
        int cont = 0;
        for (int i = 0; i < 100; i++) {
            if (filmes[i] != null) {
                cont += 1;
            }
        }

        String[] retorno = new String[cont];

        int index = 0;
        for (int i = 0; i < 100; i++) {
            if (filmes[i] != null) {
                retorno[index] = i + " - " + filmes[i].toString();
                index += 1;
            }
        }
        return retorno;
    }
    public String detalhaFilme(int posiçãoFilmeLista) {
        if (posiçãoFilmeLista < 1 || posiçãoFilmeLista > 100) {
            return "POSIÇÃO INVÁLIDA!";
        }

        return filmes[posiçãoFilmeLista-1].getNome() + ", " + filmes[posiçãoFilmeLista-1].getAnoDeLançamento() + "\n" + filmes[posiçãoFilmeLista-1].getAnoDeLançamento();
    }

    public boolean adicionaHot(int posiçãoFilmeLista, int posiçãoNaHotList) {
        this.hotList[posiçãoNaHotList-1] = this.filmes[posiçãoFilmeLista-1];
    }
}
