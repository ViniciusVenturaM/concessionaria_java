import javax.swing.JOptionPane;

public abstract class Veiculo 
{
    private String nome; 
    private String placa; 
    private double preco; 
    private Cliente cli;
    
    public Veiculo(String nome, String placa, double preco, Cliente cli)
    {
        this.nome = nome;
        this.placa = placa;
        this.preco = preco;
        this.cli = cli;
    }

    public Veiculo() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) 
    {
        if (preco < 0)
           JOptionPane.showMessageDialog(null, "Preço Inválido");
        else    
          this.preco = preco;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli)
    {
        this.cli = cli;
    } 

    public abstract void putData();   //solicitar a entrada dos dados 

    public abstract String getData();   //exibe os atributos da classe 
        
}
