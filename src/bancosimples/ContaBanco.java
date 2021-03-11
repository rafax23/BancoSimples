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
public class ContaBanco {
    
    //proriedades
    public int numConta;
    protected String tipo;
    private String dono;
    private int saldo;
    public boolean status; 
    
    //construtor
    public ContaBanco(){
        this.status = false;
        this.saldo = 0; //passado via atributo em vez de Setter
    }
    
    /*
    * VOID é sem retorno
    Se tiver retorno escreve o tipo (String, Int...)
    EXEMPLO: GET COM VALOR
    */
    
    //metodos
    
    public void abrirConta(int oConta, String oTipo, String oDono){
        this.numConta = oConta;
        this.tipo = oTipo;
        this.dono = oDono;
        if(this.tipo == "cc"){
            this.saldo = 50;
            System.out.println("CC aberta: Saldo 50");
        }
        else if(this.tipo == "cp"){
            this.saldo = 150;
            System.out.println("CP Aberta: Saldo 150");
        }else{
            System.out.println("Tipo inválido. CC ou CP");
        }
    }
    
    public void fecharConta(){
        if(this.saldo == 0){
            this.status = false;
            System.out.println("Conta fechada.");
        }else{
            System.out.println("ERRO: O saldo precisa estar zerado para FECHAR");
        }
    }
    
    public void depositar(int valor){
        if(this.status == true){
            this.saldo = this.saldo + valor;
            System.out.println("Valor depositado: "+ valor + "| Novo Saldo: " + this.saldo );
        }
        else{
            System.out.println("A conta NÃO está aberta. Não depositado");
        }
    }
    
    public void sacar(int saque){
        if(this.status == true){ //verofica se tá aberto
            if((this.saldo - saque) >= 0){ //verifica se o saque é até o valor do saldo
                this.saldo = this.saldo - saque;
                System.out.println("Valor sacado: " + saque + "| Novo saldo: " + this.saldo);
            }
            else{
                System.out.println("Saldo insuficiente. Disponível: " + this.saldo);
            }
        }
        else{
            System.out.println("Conta fechada não é possível sacar");
        }
    }
    
    public void pagarMensal(){
        if(this.tipo == "cc"){
            this.saldo = this.saldo - 12;
            System.out.println("*CC* R$ 12 paga | Novo saldo: "+this.saldo );
        }
        else if(this.tipo == "cp"){
            this.saldo = this.saldo - 20;
            System.out.println("*CP* R$ 20 paga | Novo saldo: "+this.saldo);
        }
        else{
            System.out.println("Erro no pagamento");
        }
    }
    
    public void ver(){
        /*    public int numConta;
        protected String tipo;
        private String dono;
        private int saldo;
        private boolean status; 
         */
        System.out.println("___________");
        System.out.println("Conta : "  + this.numConta);
        System.out.println("Tipo : "  + this.tipo);
        System.out.println("Dono : "  + this.dono);
        System.out.println("Saldo : "  + this.saldo);
        System.out.println("Status : "  + this.status);
    
    }
    
    
    //getters e setters
    
    
    
}
