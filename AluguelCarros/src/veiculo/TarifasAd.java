package veiculo;

public class TarifasAd {

	private SeguroCarro seguro;
	private CadeiraCrianca cadeira;
	private boolean wifi;
	
	public TarifasAd(SeguroCarro seguro, CadeiraCrianca cadeira, boolean wifi) {
		
		this.seguro = seguro;
		this.cadeira = cadeira;
		this.wifi = wifi;
		
	}
	
	public SeguroCarro getSeguro() {
		return seguro;
	}
	public void setSeguro(SeguroCarro seguro) {
		this.seguro = seguro;
	}
	public CadeiraCrianca getCadeira() {
		return cadeira;
	}
	public void setCadeira(CadeiraCrianca cadeira) {
		this.cadeira = cadeira;
	}
	public boolean isWifi() {
		return wifi;
	}
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	
}