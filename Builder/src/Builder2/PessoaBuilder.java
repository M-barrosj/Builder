package Builder2;

import java.util.ArrayList;
import java.util.List;

public class PessoaBuilder {

    private Pessoa pessoa;
    private Endereço endereco;
    private List telefones = new ArrayList();

    public PessoaBuilder() {
        this.pessoa = new Pessoa();
        this.endereco = new Endereço();
    }
    
    public static PessoaBuilder builder() {
        return new PessoaBuilder();
    }
    
    public PessoaBuilder addNome(String nome, String sobrenome) {
        this.pessoa.setNome(nome);
        this.pessoa.setSobrenome(sobrenome);
        return this;
    }
   
    public PessoaBuilder addDtNascimento(int dia, int mes, int ano) {
        this.pessoa.setDia(dia);
        this.pessoa.setMes(mes);
        this.pessoa.setAno(ano);
        return this;
    }
  
    public PessoaBuilder addLogradouro(String logradouro) {
        this.endereco.setLogradouro(logradouro);
        return this;
    }
    
    public PessoaBuilder addNumero(String numero) {
        this.endereco.setNumero(numero);
        return this;
    }
   
    public PessoaBuilder addComplemento(String complemento) {
        this.endereco.setComplemento(complemento);
        return this;
    }
   
    public PessoaBuilder addBairro(String bairro) {
        this.endereco.setBairro(bairro);
        return this;
    }
   
    public PessoaBuilder addCidade(String cidade) {
        this.endereco.setCidade(cidade);
        return this;
    }
   
    public PessoaBuilder addPais(String pais) {
        this.endereco.setPais(pais);
        return this;
    }
   
    public PessoaBuilder addFone(int ddd, int numero, Telefone.TipoFone tipoFone) {
        this.telefones.add(new Telefone(ddd, numero, tipoFone));
        return this;
    }
   
    public Pessoa get() {
        this.pessoa.setEndereco(this.endereco);
        this.pessoa.setTelefones(this.telefones);
        return this.pessoa;
    }
}