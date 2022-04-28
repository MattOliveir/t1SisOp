
// classe do controlador de processos, cada processo/programa tem um PCB próprio.

public class PCB {


    public int pid;
    public int acc;
    public int tamMemoria;
    public int prioridade; // 2 = Baixa prioridade | 1 = Media prioridade | 0 = Alta prioridade
    public int status; // 0 = finalizado | 1 = pronto para executar | 2 = executando | 3 = bloqueado |      <- isso poderia ser uma lista também.
    public int tempoEsperando;
    public int tempoExecucao;


    PCB(int umPid,int umTamMemoria, int umaPrioridade,int umStatus){

        this.pid = umPid;
        this.tamMemoria = umTamMemoria;
        this.prioridade = umaPrioridade;
        this.status = umStatus;

    }


    public int getPid() {
        return pid;
    }


    public int getAcc() {
        return acc;
    }


    public void setAcc(int acc) {
        this.acc = acc;
    }


    public int getTamMemoria() {
        return tamMemoria;
    }


    public void setTamMemoria(int tamMemoria) {
        this.tamMemoria = tamMemoria;
    }


    public int getPrioridade() {
        return prioridade;
    }


    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }


    public int getStatus() {
        return status;
    }


    public void setStatus(int status) {
        this.status = status;
    }


    public int getTempoEsperando() {
        return tempoEsperando;
    }


    public int getTempoExecucao() {
        return tempoExecucao;
    }

}
