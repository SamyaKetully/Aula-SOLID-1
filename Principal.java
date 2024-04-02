
package Principal;

/**
 * @author Lorenzo
 */
public class Principal {

    public void cadastraAmigos(){
        CadastroAmigo cAmg = new CadastroAmigo();
    }
    public void cadastraDVD(){
        CadastroDVD cDvd = new CadastroDVD();
    }
    public void registraEmprestimos(){
        RegistroEmprestimo rEmp = new RegistroEmprestimo();
    }
    public static void main(String[] args) {
        Interface inF = new Interface();
    }
    
}
