package br.ifms.cx.iot.util;

import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class RXTXUtil {

    private OutputStream serialOut;
    private SerialPort serialPort;

    public List<CommPortIdentifier> listarPortasSeriais() {       
        // TODO - RXTX Listar Portas
        return null;
    }

    public void conectar(CommPortIdentifier porta){
        // TODO - RXTX Conectar
    }

    public void desconectar(){
        // TODO - RXTX Desconectar
    }

    public void enviarDados(String mensagem) throws IOException {
        // TODO - RXTX EnviarDados
    }
}
