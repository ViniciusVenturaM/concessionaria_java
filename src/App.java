import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

//Arquivo App.java
public class App
{
    public static void main(String[] args) throws Exception 
    {
        List<Veiculo> veiculos = new ArrayList<Veiculo>(); 
        int opcao = 0; 
        while (opcao != 5)
        {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "1-Cadastrar Veículo" + "\n" + 
                    "2-Listagem de Veículos cadastrados" + "\n" + 
                    "3-Pesquisar Veículo" + "\n" +                     
                    "4-Pesquisar Cliente" + "\n" + 
                    "5-Sair do programa" )); 
            switch(opcao)
            {
                case 1: //cadastrar veiculo
                   int opcao2 = 0; 
                   while (opcao2 != 3)                    
                   {
                       opcao2 = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                "1-Cadastrar Veículo de Passeio" + "\n" + 
                                "2-Cadastrar Caminhão " + "\n" + 
                                "3-Retornar ao Menu Principal")); 
                       switch(opcao2)
                       {
                          case 1: //Cadastra veiculo de passeio 
                             Passeio p = new Passeio(); 
                             p.putData(); //entrada dos dados 
                             veiculos.add(p); //adiciona o objeto na lista de veiculos
                          break; 
                          case 2: //Cadastra caminhão
                            Caminhao c = new Caminhao(); 
                            c.putData(); //entrada dos dados 
                            veiculos.add(c); //adiciona o objeto na lista de veiculos

                          break; 
                          case 3:  //retorna ao menu principal 
                          break; 
                          default: 
                            JOptionPane.showMessageDialog(null, 
                                                        "Opção Inválida");
                       }                                 
                   }
                break; 
                case 2: //Listagem de veiculos  
                  for (int i = 0; i < veiculos.size(); i++)
                  {
                      JOptionPane.showMessageDialog(null, 
                                                    veiculos.get(i).getData()); 
                  }
                break; 
                case 3: //Pesquisa de veiculo
                   int posicao = pesquisar_veiculo(veiculos); 
                   if (posicao >= 0)
                   {
                      JOptionPane.showMessageDialog(null, 
                                          veiculos.get(posicao).getData());    
                   }
                   else 
                      JOptionPane.showMessageDialog(null, 
                                                    "Veículo não encontrado"); 
                break; 
                case 4: //Pesquisar cliente 
                   pesquisar_cliente(veiculos);  
                break; 
                case 5: //sair do programa 
                break; 
                default: 
                   JOptionPane.showMessageDialog(null, "Opção Inválida");
            }        
        }   
    }  //fim do main
    public static int pesquisar_veiculo(List<Veiculo> veiculos)
    {
        String placaveiculo; 
        placaveiculo = JOptionPane.showInputDialog(null, 
                                                    "Digite a placa a ser pesquisada");
        for (int i = 0; i < veiculos.size(); i++)                                                    
        {
            if (placaveiculo.equals(veiculos.get(i).getPlaca())) 
               return i;  //veiculo encontrado na posição i 
        }
        return -1; //veiculo não foi encontrado 
    }

    public static void pesquisar_cliente(List<Veiculo> veiculos)
    {
        String cpfcliente; 
        cpfcliente = JOptionPane.showInputDialog(null, 
                                                    "Digite o cpf a ser pesquisado");
        for (int i = 0; i < veiculos.size(); i++)                                                    
        {
            if (cpfcliente.equals(veiculos.get(i).getCli().getCpf())) 
                JOptionPane.showMessageDialog(null, 
                                             veiculos.get(i).getData());        
        }      
    }
}  //fim da classe App 
