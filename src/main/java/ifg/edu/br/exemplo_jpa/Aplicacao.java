package ifg.edu.br.exemplo_jpa;

import ifg.edu.br.exemplo_jpa.entidades.Usuario;

public class Aplicacao {
	
    public static void main( String[] args ) {
    	System.out.println("Iniciado com sucesso!");        
    	
    	Usuario maria = new Usuario();
    	maria.setId(1L);
    	maria.setCpf("12345678909");
    	maria.setEmail("maria.silva@gmail.com");
    	maria.setNome("Maria da Silva");
    	maria.setSenha("maria");
    	
    	UsuarioDAO usuarioDao = new UsuarioDAO();
    	usuarioDao.inserir(maria);
    	
    	Usuario usuario = usuarioDao.obter(1);
    	System.out.println(usuario);
    	
    	usuario.setNome("Maria de Sousa");
    	usuarioDao.atualizar(usuario);
    	usuario = usuarioDao.obter(1);
    	System.out.println(usuario);

    	usuarioDao.excluir(usuario);
    	
    }
}
