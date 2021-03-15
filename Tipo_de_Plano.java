

public class Tipo_de_Plano {
	private Integer codigo; 
	private String descricao;
	private Float valorMensal;
	private Float franquia;
	private Float valorChamada;
	
	public Tipo_de_Plano() {
		
	}
	
	public Tipo_de_Plano(Integer codigo, String descricao, Float valorMensal, Float franquia, Float valorChamada) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valorMensal = valorMensal;
		this.franquia = franquia;
		this.valorChamada = valorChamada;
		}
	
	public Integer getCodigo() {
		return codigo ;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Float getValorMensal() {
		return valorMensal;
	}
	public void setValorMensal(Float valorMensal) {
		this.valorMensal = valorMensal;
	}
	public Float getFranquia() {
		return franquia;
	}
	public void setFranquia(Float franquia) {
		this.franquia = franquia;
	}
	public Float getValorChamada() {
		return valorChamada;
	}
	public void setValorChamada(Float valorChamada) {
		this.valorChamada = valorChamada;
	}
	

}
