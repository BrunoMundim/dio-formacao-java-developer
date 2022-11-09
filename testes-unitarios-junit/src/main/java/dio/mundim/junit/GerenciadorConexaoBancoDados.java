package dio.mundim.junit;

import java.util.logging.Logger;

public class GerenciadorConexaoBancoDados {

    private static final Logger LOGGER = Logger.getLogger(GerenciadorConexaoBancoDados.class.getName());

    public static void iniciarConexao(){
        // fez algo
        LOGGER.info("Iniciou conexão.");
    }

    public static void finalizarConexao(){
        // fez algo
        LOGGER.info("Finalizou conexão.");
    }

    public static void insereDados(){
        LOGGER.info("Inseriu dado!");
    }

    public static void removeDados(){
        LOGGER.info("Removeu dado!");
    }
}
