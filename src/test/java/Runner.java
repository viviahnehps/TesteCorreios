
public class Runner {
	
	public static void main (String args[]) {

		CorreioStep cStp= new CorreioStep(); 
		System.out.println("------------TESTES CORREIOS----------------------------------\n");
		
		//Teste 1: No site dos correios, pesquisar um CEP e dar output das informações retornadas.
		System.out.println("Cenário: Verificar no site dos correios se busca por CEP retorna informações corretas.");
		cStp.AcessarBuscaCep("http://www.buscacep.correios.com.br/sistemas/buscacep/buscaCepEndereco.cfm", "Endereço por CEP");
		cStp.PreencherDadosCep();
		cStp.validaResultado();
		cStp.fechaPagina();
		
		System.out.println("\n\n\n");

		//Teste 2: No site dos correios, pesquisar um logradouro que retorne mais de um resultado e dar output de todos os dados da tabela retornada.
		System.out.println("Cenário: Verificar no site dos correios se busca por logradouro retorna informações corretas.");
		cStp.AcessarBuscaCep("http://www.buscacep.correios.com.br/sistemas/buscacep/buscaCepEndereco.cfm","CEP por Localidade | Logradouro");		
		cStp.preencherLogradouro("UF", "SP","Localidade", "Osasco", "Tipo", "Estação", "Logradouro","Rua da Estação");
		cStp.validaResultado();
		cStp.fechaPagina();
	}
}
