package utfpr.ct.dainf.pratica;

import java.util.Comparator;

/**
 * Linguagem Java
 * @author
 */
public class LancamentoComparator implements Comparator<Lancamento> {
    Boolean numero;
    Boolean numero_ascendente;
    Boolean nome_ascendente;
    
    public LancamentoComparator() {
	super();
    }

    @Override
    public int compare(Lancamento t, Lancamento t1) {
            int retorno;
            if(t.getConta().compareTo(t1.getConta()) == 0){
                     retorno = t.getData().compareTo(t1.getData());
            }
            else
                retorno = t.getConta().compareTo(t1.getConta());
            return retorno;
}
}
