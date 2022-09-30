package Models;

public class Produto {
	String nome_produto;
	String quantidade_produto;
	String valor_produto;
	String descricao_produto;
	
	
	
	public Produto(String nome_produto, String quantidade_produto, String valor_produto, String descricao_produto) {
		super();
		this.nome_produto = nome_produto;
		this.quantidade_produto = quantidade_produto;
		this.valor_produto = valor_produto;
		this.descricao_produto = descricao_produto;
	}
	
	public Produto() {
		
	}
	
	public String getNome_produto() {
		return nome_produto;
	}
	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}
	public String getQuantidade_produto() {
		return quantidade_produto;
	}
	public void setQuantidade_produto(String quantidade_produto) {
		this.quantidade_produto = quantidade_produto;
	}
	public String getValor_produto() {
		return valor_produto;
	}
	public void setValor_produto(String valor_produtos) {
		this.valor_produto = valor_produtos;
	}
	public String getDescricao_produto() {
		return descricao_produto;
	}
	public void setDescricao_produto(String descricao_produto) {
		this.descricao_produto = descricao_produto;
	}

	
}