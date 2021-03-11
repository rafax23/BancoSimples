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
        ContaBanco c1 = new ContaBanco();
        //c1.ver();
        
        //int oConta, String oTipo, String oDono
        c1.abrirConta(1,"cc","rafael");
        c1.ver();
        c1.status = true; //criar Get/Set
        c1.depositar(500);
        c1.ver();
        c1.sacar(100);
        c1.ver();
        c1.pagarMensal();
        c1.ver();
        
    }
    
}
