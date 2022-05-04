public class CPU {
    
    public int pc;
    public int[] registers;
    public int op1;
    public Word ir;
    public PCB pcb;
    private Word[] memory;

    public void run() {
        while(true) {

            ir = memory[pc];

            switch(ir.opc){
                case ADD: //acc = acc + op1
                    pcb.acc = pcb.getAcc() + op1;
                    pc++;
            }

        }
    }
}
