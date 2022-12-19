
import javax.swing.JOptionPane;

public class Caminhao  extends Veiculo
{
   private double toneladas; 
   private double altura_max;

   public Caminhao()
   {
    
   }

   public Caminhao(String nome, String placa, double preco, Cliente cli, 
                   double toneladas, double altura_max) 
   {
      super(nome, placa, preco, cli);
      this.toneladas = toneladas;
      this.altura_max = altura_max;
   }

public double getToneladas() {
    return toneladas;
}

public void setToneladas(double toneladas) {
    this.toneladas = toneladas;
}

public double getAltura_max() {
    return altura_max;
}

public void setAltura_max(double altura_max) {
    this.altura_max = altura_max;
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

    //preenchendo os atributos da classe Caminhao 
    setAltura_max(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do caminhão")));
    setToneladas(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a capacidade (em ton.) do caminhão")));

}

public String getData()
{
    String v; 
    v = "Nome do Veículo:  " + getNome() + "\n" + 
        "Placa do Veículo: " + getPlaca() + "\n" +
        "Preço do Veículo: " + getPreco() + "\n" +
        "Capacidade do Veículo:   " + getToneladas() + "\n" +
        "Altura do Veículo:" + getAltura_max() + "\n" +
        "Nome do Cliente:  " + getCli().getNome() + "\n" + 
        "CPF do Cliente:   " + getCli().getCpf(); 

    return v;     
}

   
}
