package Builder2;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	private String nome;
    private String sobrenome;
    private int dia;
    private int mes;
    private int ano;
    private Endere�o endereco;
    private List telefones = new ArrayList();

    public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public int getDia() {
		return dia;
	}


	public void setDia(int dia) {
		this.dia = dia;
	}


	public int getMes() {
		return mes;
	}


	public void setMes(int mes) {
		this.mes = mes;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	public Endere�o getEndereco() {
		return endereco;
	}


	public void setEndereco(Endere�o endereco) {
		this.endereco = endereco;
	}


	public List getTelefones() {
		return telefones;
	}


	public void setTelefones(List telefones) {
		this.telefones = telefones;
	}


	@Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dia=" + dia +
                ", mes=" + mes +
                ", ano=" + ano +
                ", endereco=" + endereco +
                ", telefones=" + telefones +
                '}';
    }

}
