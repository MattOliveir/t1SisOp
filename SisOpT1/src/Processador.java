import java.util.LinkedList;
import java.util.Queue;

// classe que vai processar todos os programas e manipular os PCBs. Politicas de Escalonamento vão aqui.

public class Processador {


    int Clock = 1;

    Queue prontos = new LinkedList(); // métodos de manipulação já tem na estrutura de fila, só precisa fazer uns metodos pra usar eles de acordo com a necessidade

    Queue bloqueados = new LinkedList();

    Queue finalizados = new LinkedList();

    Processo Executando = new Processo();

}
