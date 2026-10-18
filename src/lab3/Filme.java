package lab3;

public class Filme {
    private String nome;
    private int anoDeLançamento;
    private String local;
    private String status;

    public Filme(String nome, int anoDeLançamento, String local) {
        this.nome = nome;
        this.anoDeLançamento = anoDeLançamento;
        this.local = local;
        this.status = "";
    }

    public String getNome() {
        return this.nome;
    }

    public int getAnoDeLançamento() {
        return this.anoDeLançamento;
    }

    public String getLocal() {
        return this.local;
    }

    public void setStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return this.nome;
    }


    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }

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
