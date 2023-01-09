public abstract class Conteudo {
    private String titulo;
    private String descricao;

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getDescricao(){
        return this.descricao;
    }
    
    public abstract double calcularXp();
}
