public class Atividades extends Conteudo{
    private int cargaHoraria;
    private double xpPadrao = 20d;

    public Atividades(){
    }

    

    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria(){
        return this.cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return xpPadrao * cargaHoraria;
    }

    @Override
    public String toString(){
        return "{titutlo = " + super.getTitulo() + ", descrição = " + super.getDescricao() + ", carga horária = " + this.cargaHoraria + "}";
    }

}
