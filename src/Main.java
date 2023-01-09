import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Atividades curso1 = new Atividades();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso Java");
        curso1.setCargaHoraria(8);

        Atividades curso2 = new Atividades();

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do Curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentorias mentoria = new Mentorias();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição da Mentoria Java");
        mentoria.setDataMentoria(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Devs george = new Devs();
        george.setNome("George");
        george.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + george.getConteudosInscrito());
        george.progredir();
        System.out.println("Conteúdos Concluidos: " + george.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos: " + george.getConteudosInscrito());
        System.out.println(george.calcularTotalXp());

        Devs nayanne = new Devs();
        nayanne.setNome("Nayanne");
        nayanne.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + nayanne.getConteudosInscrito());
        nayanne.progredir();
        nayanne.progredir();
        System.out.println("Conteúdos Concluidos: " + nayanne.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos: " + nayanne.getConteudosInscrito());
        System.out.println(nayanne.calcularTotalXp());
    }
}
