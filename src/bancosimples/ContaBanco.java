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
        //this.status = false;
        this.setStatus(false);
        //this.saldo = 0; //passado via atributo em vez de Setter
        this.setSaldo(0);
    }
    
    /*
    * VOID é sem retorno
    Se tiver retorno escreve o tipo (String, Int...)
    EXEMPLO: GET COM VALOR
    */
    
    //teste metodo para não usar System.out.println
    public void imp(String texto){
        //esse é o único System.out.println
        System.out.println(texto);
    }
    
    /*
    public void testeImp(){
        imp("\n== UM NOVO TESTE ==");
        imp("\n 0 | " + this.saldo);
        imp("\n 0 | " + this.getSaldo());
    }
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
            this.setDono(oDono);
            //this.saldo = 50;
            this.setSaldo(50);
            imp("CC aberta: Saldo 50");
        }
        else if(oTipo == "cc"){ 
            this.setNumConta(oConta);
            this.setTipo(oTipo);
            this.setDono(oDono);
            //this.saldo = 150;
            this.setSaldo(150);
            imp("CP Aberta: Saldo 150");
        }else{// if(this.tipo != "cp" || this.tipo != "cc"){
            imp("Tipo inválido. CC ou CP");
        }
    }
    
    public void fecharConta(){
        if(this.getSaldo() == 0){
            //this.status = false; //se for ZERO fecha. Se não, tem que zerar antes.
            this.setStatus(false);
            imp("Conta fechada.");
        }else{
            imp("ERRO: O saldo precisa estar zerado para FECHAR");
        }
    }
    
    
    public void depositar(int valor){
        if(this.getStatus() == true){
            //this.saldo = this.saldo + valor;
            this.setSaldo(this.getSaldo() + valor);
            imp("Valor depositado: "+ valor + 
                    "| Novo Saldo: " + this.getSaldo() );
        }
        else{
            imp("A conta NÃO está aberta. Não depositado");
        }
    }
    
    public void sacar(int saque){
        if(this.getStatus() == true){ //verifica se conta tá aberta
            if((this.getSaldo() - saque) >= 0){ //verifica se o saque é até o valor do saldo
                //this.saldo = this.saldo - saque;
                this.setSaldo(this.getSaldo() - saque);
                imp("Valor sacado: " + saque + 
                        "| Novo saldo: " + this.getSaldo());
            }
            else{
                imp("Saldo insuficiente. Disponível: " + this.getSaldo());
            }
        }
        else{
            imp("Conta fechada não é possível sacar");
        }
    }
    
    public void pagarMensal(){
        if(this.getTipo() == "cc"){
            //this.saldo = this.saldo - 10
            this.setSaldo(this.getSaldo() - 10);
            imp("CONTA *CC* R$ 10 paga | Novo saldo: "+this.getSaldo() );
        }
        // else if("cp".equals(this.getTipo())){ EXEMPLO USANDO EQUALS
        else if(this.getTipo() == "cp"){
            //this.saldo = this.saldo - 20;
            this.setSaldo(getSaldo() - 20);
            imp("POUPANÇA *CP* R$ 20 paga | Novo saldo: "+this.getSaldo());
        }
        else{
            imp("Erro no pagamento");
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
        imp("___________");
        imp("Conta : "  + this.getNumConta());
        imp("Tipo : "  + this.getTipo());
        imp("Dono : "  + this.getDono());
        imp("Saldo : "  + this.getSaldo());
        imp("Status : "  + this.getStatus());
    
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

    public boolean getStatus() { //poderia ser [IS] isStatus mas mantive pardrão get
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
