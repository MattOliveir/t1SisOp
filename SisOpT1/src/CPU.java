public class CPU {
    
    public int pc;
    public Processo ir;
    public int acc;
    public int op1;
    public int label;

    public void run() {
        while (true) {
            switch (ir.code) {
                case "ADD":
                    acc = acc + op1;
                    
                    break;
            
                case "SUB":
                    acc = acc - op1;

                    break;

                case "MULT":
                    acc = acc * op1;

                case "DIV":
                    acc = acc/op1;

                case "LOAD":
                    acc = op1;

                case "STORE":
                    op1 = acc;

                case "BRANY":
                    pc = label;

                case "BRPOS":
                    if(acc>0){
                        pc = op1;
                    }

                case "BRZERO":
                    if(acc>0){
                        pc = op1;
                    }

                case "BRNEG":
                    if(acc>0){
                        pc = op1;
                    }
                default:
                    break;
            }
        }
    }

}
