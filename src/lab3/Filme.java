package lab3;

/**
 * Representação de um filme, que é composto pelo nome, seu ano de lançamento e o local onde é reproduzido. Ele pode ou
 * não ser classificado como um hot filme, definido pelo atributo status.
 *
 * @author Sofia Gomes Braga
 */
public class Filme {
    /**
     * Nome do filme.
     */
    private String nome;
    /**
     * Ano de lançamento do filme.
     */
    private int anoDeLançamento;
    /**
     * Local onde o filme é reproduzido.
     */
    private String local;
    /**
     * Define se o filme é classificado como hot.
     */
    private String status;

    /**
     * Constrói um filme a partir do nome, do ano de lançamento e do local onde é reproduzido.
     * @param nome nome do filme.
     * @param anoDeLançamento ano em que o filme foi lançado.
     * @param local local onde o filme é reproduzido.
     */
    public Filme(String nome, int anoDeLançamento, String local) {
        this.nome = nome;
        this.anoDeLançamento = anoDeLançamento;
        this.local = local;
        this.status = "";
    }

    /**
     * Retorna a String que define o nome do filme.
     * @return a representação em String do nome.
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Retorna o inteiro que define o ano de lançamento do filme.
     * @return o inteiro que determina o ano em que o filme foi lançado.
     */
    public int getAnoDeLançamento() {
        return this.anoDeLançamento;
    }

    /**
     * Retorna a String que define o local onde o filme é reproduzido.
     * @return a representação em String do local onde o filme é reproduzido.
     */
    public String getLocal() {
        return this.local;
    }

    /**
     * Define o status do filme, ou seja, se ele é um hotfilm ou não.
     * @param novoStatus o novo status do filme.
     */
    public void setStatus(String novoStatus) {
        this.status = novoStatus;
    }

    /**
     * Retorna a String que representa o status do filme, ou seja, se ele é um hotfilm ou não.
     * @return a representação em String do status do filme.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Retorna a String que representa o nome do filme. A reprsentação segue o formato "Nome do Filme".
     * @return a representação em String do filme.
     */
    public String toString() {
        return this.nome;
    }

    /**
     * Retorna o inteiro que representa um objeto.
     * @return a representação em inteiro do hashCode do objeto.
     */
    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }

    /**
     * Retorna true caso os objetos comparados tenham o mesmo hashCode, e falso caso contrário.
     * @param o  o objeto de referência com o qual comparar.
     * @return true caso os objetos sejam iguais, e false caso contrário.
     */
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        if (!(o instanceof Filme)) {
            return false;
        }

        Filme oFilme = (Filme) o;

        return (this.nome.equals(oFilme.getNome()) && this.anoDeLançamento == oFilme.getAnoDeLançamento());
    }
}
