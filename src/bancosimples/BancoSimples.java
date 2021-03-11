/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancosimples;

/**
 *
 * @author Rafael
 */
public class BancoSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
        
        //objeto C2 para guardar infos
        ContaBanco c2 = new ContaBanco();
        c2.abrirConta(2, "cp", "Agatha");
        c2.setStatus(true);
        c2.depositar(900);
        c2.ver();
        
        //objeto C1 para manipular
        ContaBanco c1 = new ContaBanco();
        //int oConta, String oTipo, String oDono
        c1.abrirConta(1,"cc","rafael");
                c1.ver();
        //c1.status = true; //[[ATENÇÃO]] criar Get/Set
        c1.setStatus(true);
        c1.depositar(500);
        c1.ver();
        c1.sacar(550);
        c1.ver();
        //c1.fecharConta();
        //c1.ver();
        c1.pagarMensal();
        c1.ver();
        
        //verificando se teve alteração em [C2]
        c2.ver();
        
        //c1.testeImp();
        
    }
    
}
