package lab3;

public class FilmNow {
    private Filme[] filmes;
    private Filme[] hotList;

    public FilmNow() {
        this.filmes = new Filme[100];
        this.hotList = new Filme[10];
    }

    public boolean adicionaFilme (String nome, int anoDeLançamento, String local, int posiçãoFilmeLista){
        this.filmes[posiçãoFilmeLista-1] = new Filme(String nome, int anoDelançamento, String local, int posiçãoFilmeLista);

    }
}
