
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;
import utfpr.ct.dainf.pratica.Lancamento;
import utfpr.ct.dainf.pratica.ProcessaLancamentos;

public class Pratica {
 
    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
        
        Scanner s = new Scanner(System.in);
        Integer conta = 0;
        int n = 0;
        System.out.println("Digite o caminho completo para o arquivo de lançamentos:");
        ProcessaLancamentos pl = new ProcessaLancamentos(s.next());
        do{
            System.out.println("Digite um numero de conta:");
            if(s.hasNextInt())
                conta = s.nextInt();
            else{
                System.out.println("Por favor, informe um valor numérico");
                continue;
            }
            exibeLancamentosConta(pl.getLancamentos(), conta);
            for(Lancamento l: pl.getLancamentos()){
                if(l.getConta().compareTo(conta)==0)
                    n = 1;
            }
            if(n == 0)
                System.out.println("Conta inexistente");
            }while(conta != 0);

    }
    
    public static void exibeLancamentosConta(List<Lancamento> lancamentos, Integer conta) {
            for(Lancamento l: lancamentos){
            if(l.getConta().compareTo(conta)==0)
                System.out.println(l);
}
    }
 
}