
public class CorreioStep {

	
	public void AcessarBuscaCep(String site, String link ) {
		
    	CorreiosMap mp= new CorreiosMap();
    	System.out.println("Step 1: Abra o navegador");
    	mp.abrirNavegador();
    	System.out.println("Step 2: Acesse a URL " + site);
    	mp.acessarURl(site);
    	System.out.println("Step 3: Clique na opção "+link);
    	mp.clicarLink(link);
		
	}

	public void PreencherDadosCep() {
		
    	CorreiosMap mp= new CorreiosMap();
    	System.out.println("Step 4: Preencha o campo CEP");
    	mp.preencherCampo("cep", "01415000");
    	System.out.println("Step 5: Clicar em BUSCAR");
    	mp.ClicarBotao("#Geral > div > div > div.btnform > input");
    	
   	}
	
	public void preencherLogradouro(String select, String option, String text,String valor,String tipo,String valortp , String nomeLogd, String vlrLogdr){
		CorreiosMap mp= new CorreiosMap();
		System.out.println("Step 4: Selecione UF");
    	mp.SelecionarOp(select, option);
    	System.out.println("Step 5: Preencha localidade");
    	mp.preencherTxt(text, valor);
        System.out.println("Step 6: Selecionar tipo");
        mp.SelecionarOp(tipo, valortp);
        System.out.println("Step 7: Preencher logradouro");
        mp.preencherTxt(nomeLogd, vlrLogdr);
        System.out.println("Step 8: Clicar em BUSCAR");
    	mp.ClicarBotao("#Geral > div > div > div.btnform > input");
	}
	
	
	public void validaResultado(){ 
		CorreiosMap mp= new CorreiosMap();
		System.out.println("Step 6: Verificar resultado ");
		mp.validaMensagem();
	}
	
    public void fechaPagina(){
	  CorreiosMap mp= new CorreiosMap();
	  mp.fecharnavegador();
    }
	
}