import java.time.LocalDate;

public class Mentorias extends Conteudo {
    private LocalDate dataMentoria;
    private double xpPadrao = 20d;

    public Mentorias(){
    }

    public void setDataMentoria(LocalDate dataMentoria){
        this.dataMentoria = dataMentoria;
    }

    public LocalDate getDataMentoria(){
        return this.dataMentoria;
    }
    
    @Override
    public double calcularXp() {
        return xpPadrao += 10d ;
    }

    @Override
    public String toString(){
        return "{titutlo = " + super.getTitulo() + ", descrição = " + super.getDescricao()  + ", data da mentoria = " + this.dataMentoria + "}";
    }

}
