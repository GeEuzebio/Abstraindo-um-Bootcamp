import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Devs {
    private String nome;
    private Set<Conteudo> conteudosInscrito = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public Set<Conteudo> getConteudosInscrito() {
        return this.conteudosInscrito;
    }

    public void setConteudosInscrito(Set<Conteudo> conteudosInscrito) {
        this.conteudosInscrito = conteudosInscrito;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return this.conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public Devs(){
    }

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscrito.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
       Optional<Conteudo> conteudo = this.conteudosInscrito.stream().findFirst();
       if(conteudo.isPresent()){
        this.conteudosConcluidos.add(conteudo.get());
        this.conteudosInscrito.remove(conteudo.get());
       } else {
        System.err.println("Você não está matriculado em nenhum conteúdo!");
       }
    }

    public double calcularTotalXp(){ 
        return this.conteudosConcluidos
                                .stream()
                                .mapToDouble(Conteudo::calcularXp)
                                .sum();
    }

    public Set<Conteudo> exibirCursos(){
        return conteudosConcluidos;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Devs)) {
            return false;
        }
        Devs devs = (Devs) o;
        return Objects.equals(nome, devs.nome) && Objects.equals(conteudosInscrito, devs.conteudosInscrito) && Objects.equals(conteudosConcluidos, devs.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscrito, conteudosConcluidos);
    }

}
