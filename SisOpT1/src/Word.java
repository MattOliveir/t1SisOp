public class Word { 
    public Opcode opc; 
    public int op1;  
    public int p; 

    public Word(Opcode _opc, int _op1, int _p) {
        opc = _opc;
        op1 = _op1;
        p = _p;
    }
}