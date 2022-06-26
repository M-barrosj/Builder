package Builder2;

import java.util.ArrayList;
import java.util.List;

public class CadastroBySetMethod {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Alice");
        pessoa.setSobrenome("dos Santos");
        pessoa.setDia(22);
        pessoa.setMes(5);
        pessoa.setAno(1980);

        Endereço endereco = new Endereço();
        endereco.setLogradouro("Rua das Oliveiras");
        endereco.setNumero("272");
        endereco.setComplemento("Bloco B");
        endereco.setCidade("Porto Alegre");
        endereco.setBairro("Centro");
        endereco.setPais("Brasil");

        pessoa.setEndereco(endereco);

        List telefones = new ArrayList();

        Telefone residencial = 
                new Telefone(51, 32221236, Telefone.TipoFone.RESIDENCIAL);
        
        Telefone celular = 
                new Telefone(51, 99623632, Telefone.TipoFone.CELULAR);

        telefones.add(residencial);
        telefones.add(celular);

        pessoa.setTelefones(telefones);

        System.out.println(pessoa.toString());
    }
}