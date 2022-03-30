import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();

        curso.setTitulo("Java orientada a objeto");
        curso.setDescricao("Aprenda na Prática Programação Orientada a Objetos");
        curso.setCargaHoraria(60);
        System.out.println(curso.getTitulo()+" -> "+curso.getDescricao() +" -> "+ curso.getCargaHoraria());


        Mentoria mentoria= new Mentoria();
        mentoria.setTitulo("alguma coisa aqui");
        mentoria.setDescricao("teste teste teste");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria.getTitulo()+" -> "+mentoria.getDescricao()+" -> "+ mentoria.getData());
    }
}
