package conteudos.map.exercicios.agendaDeEventeos;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2026, Month.JANUARY,15),"Evento 1", " Atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2026, Month.APRIL,3),"Evento 2", " Atracao 2");
        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();


    }
}
