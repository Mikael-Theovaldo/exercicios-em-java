package conteudos.map.exercicios.agendaDeEventeos;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = eventoMap;
    }
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data,evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento(){
        //Set<LocalDate> dataSet =  eventoMap.keySet();
        //Collection<Evento> values = eventoMap.values();
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        for(Map.Entry<LocalDate,Evento> entry : eventoMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento " + proximoEvento + " acontecera na data  " + proximaData);
                break;
            }
        }

    }
}
