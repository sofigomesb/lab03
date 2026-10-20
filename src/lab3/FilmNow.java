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

        if (posiçãoFilmeLista < 1 || posiçãoFilmeLista >= this.filmes.length) {
            return false;
        }

        for (int i = 0; i < this.filmes.length; i++) {
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
        for (int i = 0; i < this.filmes.length; i++) {
            if (filmes[i] != null) {
                cont += 1;
            }
        }

        String[] retorno = new String[cont];

        int index = 0;
        for (int i = 0; i < this.filmes.length; i++) {
            if (filmes[i] != null) {
                retorno[index] = i + " - " + filmes[i].toString();
                index += 1;
            }
        }
        return retorno;
    }
    public String detalhaFilme(int posiçãoFilmeLista) {
        if (posiçãoFilmeLista < 1 || posiçãoFilmeLista >= this.filmes.length) {
            return "POSIÇÃO INVÁLIDA!";
        }

        if (!this.filmes[posiçãoFilmeLista-1].getStatus().isBlank()) {
            return "🔥 " + filmes[posiçãoFilmeLista-1].getNome() + ", " + filmes[posiçãoFilmeLista-1].getAnoDeLançamento() + "\n" + filmes[posiçãoFilmeLista-1].getLocal();
        }

        return filmes[posiçãoFilmeLista-1].getNome() + ", " + filmes[posiçãoFilmeLista-1].getAnoDeLançamento() + "\n" + filmes[posiçãoFilmeLista-1].getLocal();
    }

    public boolean adicionaHot(int posiçãoFilmeLista, int posiçãoNaHotList) {
        if (posiçãoFilmeLista < 1 || posiçãoFilmeLista >= this.filmes.length || posiçãoNaHotList < 1 || posiçãoNaHotList >= this.hotList.length) {
            return false;
        }
        this.hotList[posiçãoNaHotList-1] = this.filmes[posiçãoFilmeLista-1];
        this.filmes[posiçãoFilmeLista-1].setStatus("🔥");
        return true;
    }

    public boolean removeHot(int posiçãoFilmeLista) {
        if (posiçãoFilmeLista < 1 || posiçãoFilmeLista >= this.filmes.length) {
            return false;
        }
        for (int i = 0; i < hotList.length; i++) {
            if (this.filmes[posiçãoFilmeLista-1].equals(this.hotList[i])) {
                this.hotList[i] = null;
                this.filmes[posiçãoFilmeLista-1].setStatus("");
            }
        }
        return true;
    }

    public String[] exibeListaHot() {
        int cont = 0;
        for (int i = 0; i < this.hotList.length; i++) {
            if (hotList[i] != null) {
                cont += 1;
            }
        }

        String[] retorno = new String[cont];

        int index = 0;
        for (int i = 0; i < this.hotList.length; i++) {
            if (hotList[i] != null) {
                retorno[index] = i + " - " + hotList[i].toString() + ", " + hotList[i].getAnoDeLançamento();
                index += 1;
            }
        }
        return retorno;
    }
}
