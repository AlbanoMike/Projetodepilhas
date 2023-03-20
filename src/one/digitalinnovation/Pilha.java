package one.digitalinnovation;

public class Pilha {

    private No RefNoEntradaPilha;

    public Pilha() {
        this.RefNoEntradaPilha = null;
    }

    public void push(No NovoNo){
        No refAuxiliar = RefNoEntradaPilha;
        RefNoEntradaPilha = NovoNo;
        RefNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop(){
        if (!this.isEmpty()){
            No NoPoped = RefNoEntradaPilha;
            RefNoEntradaPilha = RefNoEntradaPilha.getRefNo();
        }
        return null;
    }

    public No top(){
        return RefNoEntradaPilha;
    }

    public boolean isEmpty() {
       /* if(RefNoEntradaPilha == null){
            return true;
        }
        return false;

    }*/
        return RefNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {

        String StringRetorno = "-------------\n";
        StringRetorno += "     Pilha\n";
        StringRetorno += "--------------\n";

        No NoAuxiliar = RefNoEntradaPilha;

        while (true){
            if (NoAuxiliar != null){
               StringRetorno += "[No{dado=" +NoAuxiliar.getDado()+"}]\n";
               NoAuxiliar = NoAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        StringRetorno += "=============\n";
        return StringRetorno;
    }
}
