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
    private int numConta;
    private String tipo;
    private String dono;
    private int saldo;
    private boolean status; 
    
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
        //this.numConta = oConta; //usando atributos em vez de assessor
        //this.tipo = oTipo;
        //this.dono = oDono;
        if(oTipo == "cc"){ 
        //IMPORTANTE: tem que comparar o parametro recebido no método
        //no caso: [["oTipo"]]
        //se comparar o "this.tipo" vai estar vazio pois ainda não recebeu valor
            this.setNumConta(oConta);
            this.setTipo(oTipo);
            this.setSaldo(50);
            this.setDono(oDono);
            //this.saldo = 50;
            System.out.println("CC aberta: Saldo 50");
        }
        else if(oTipo == "cc"){ 
            this.setNumConta(oConta);
            this.setTipo(oTipo);
            this.setSaldo(50);
            //this.saldo = 150;
            this.setSaldo(150);
            System.out.println("CP Aberta: Saldo 150");
        }else{// if(this.tipo != "cp" || this.tipo != "cc"){
            System.out.println("Tipo inválido. CC ou CP");
        }
    }
    
    public void fecharConta(){
        if(this.getSaldo() == 0){
            //this.status = false;
            this.setStatus(false);
            System.out.println("Conta fechada.");
        }else{
            System.out.println("ERRO: O saldo precisa estar zerado para FECHAR");
        }
    }
    
    public void depositar(int valor){
        if(this.getStatus() == true){
            //this.saldo = this.saldo + valor;
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Valor depositado: "+ valor + 
                    "| Novo Saldo: " + this.getSaldo() );
        }
        else{
            System.out.println("A conta NÃO está aberta. Não depositado");
        }
    }
    
    public void sacar(int saque){
        if(this.getStatus() == true){ //verifica se conta tá aberta
            if((this.getSaldo() - saque) >= 0){ //verifica se o saque é até o valor do saldo
                //this.saldo = this.saldo - saque;
                this.setSaldo(this.getSaldo() - saque);
                System.out.println("Valor sacado: " + saque + 
                        "| Novo saldo: " + this.getSaldo());
            }
            else{
                System.out.println("Saldo insuficiente. Disponível: " + this.getSaldo());
            }
        }
        else{
            System.out.println("Conta fechada não é possível sacar");
        }
    }
    
    public void pagarMensal(){
        if(this.getTipo() == "cc"){
            //this.saldo = this.saldo - 10
            this.setSaldo(this.getSaldo() - 10);
            System.out.println("CONTA *CC* R$ 10 paga | Novo saldo: "+this.getSaldo() );
        }
        // else if("cp".equals(this.getTipo())){ EXEMPLO USANDO EQUALS
        else if(this.getTipo() == "cp"){
            //this.saldo = this.saldo - 20;
            this.setSaldo(getSaldo() - 20);
            System.out.println("POUPANÇA *CP* R$ 20 paga | Novo saldo: "+this.getSaldo());
        }
        else{
            System.out.println("Erro no pagamento");
        }
    }
    
    public void ver(){
        /*
        public int numConta;
        protected String tipo;
        private String dono;
        private int saldo;
        private boolean status; 
         */
        System.out.println("___________");
        System.out.println("Conta : "  + this.getNumConta());
        System.out.println("Tipo : "  + this.getTipo());
        System.out.println("Dono : "  + this.getDono());
        System.out.println("Saldo : "  + this.getSaldo());
        System.out.println("Status : "  + this.getStatus());
    
    }
    

    //getters e setters
    
    /*
    ALT + INSERT cria Getters e Setters
    Com os métodos acessores os atributos podem se tornar privdados 
    */

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() { //poderia ser isStatus mas mantive pardrão get
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
