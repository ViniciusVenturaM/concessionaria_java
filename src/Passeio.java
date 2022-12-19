import javax.swing.JOptionPane;

public class Passeio  extends Veiculo
{
   private String cor; 
   private String modelo;

public Passeio()
{
    
}   

public Passeio(String nome, String placa, double preco, Cliente cli, 
               String cor, String modelo) 
{
    super(nome, placa, preco, cli);
    this.cor = cor;
    this.modelo = modelo;
}

public String getCor() {
    return cor;
}

public void setCor(String cor) {
    this.cor = cor;
}

public String getModelo() {
    return modelo;
}

public void setModelo(String modelo) {
    this.modelo = modelo;
}


public void putData()  //solicitar os dados da classe 
{
    //preenchendo os atributos do cliente 
    String nomecliente; 
    nomecliente = JOptionPane.showInputDialog(null, "Digite o nome do cliente"); 
    String cpfcliente; 
    cpfcliente = JOptionPane.showInputDialog(null, "Digite o cpf do cliente"); 
    Cliente c = new Cliente(nomecliente, cpfcliente); 

    //preenchendo os atributos da classe Veiculo
    setNome(JOptionPane.showInputDialog(null, "Digite o nome do veículo"));
    setPlaca(JOptionPane.showInputDialog(null, "Digite a placa do veículo"));   
    setPreco(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o preço do veículo")));
    setCli(c);    

    //preenchendo os atributos da classe Veiculo de passeio 
    setCor(JOptionPane.showInputDialog(null, "Digite a cor do veículo"));
    setModelo(JOptionPane.showInputDialog(null, "Digite o modelo do veículo"));    

}

public String getData()
{
    String v; 
    v = "Nome do Veículo:  " + getNome() + "\n" + 
        "Placa do Veículo: " + getPlaca() + "\n" +
        "Preço do Veículo: " + getPreco() + "\n" +
        "Cor do Veículo:   " + getCor() + "\n" +
        "Modelo do Veículo:" + getModelo() + "\n" +
        "Nome do Cliente:  " + getCli().getNome() + "\n" + 
        "CPF do Cliente:   " + getCli().getCpf(); 

    return v;     
}
}
