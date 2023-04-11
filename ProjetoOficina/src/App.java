import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        
        Oficina objOficina = new Oficina(JOptionPane.showInputDialog("digite o nome da oficina: ") ,
        JOptionPane.showInputDialog("digite o cnpj: "));
        
        Endereco objEndereco = new Endereco();
        Carro objCarro = new Carro();
        ParteCarro objParteCarro = new ParteCarro();
        Colaborador objColaborador = new Colaborador();

        objOficina.setCarro(objCarro);
        objOficina.setEndereco(objEndereco);
        objOficina.setColaborador(objColaborador);

        objCarro.setParteCarro(objParteCarro);
    
        
        
        
        
        
        
    }
}
