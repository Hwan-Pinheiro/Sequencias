package br.com.matheus.sequencias;

public class SequenciaD {
	public int proximoElemento(int ultimoElemento) {
        int numeroPar = (int) Math.sqrt(ultimoElemento) + 2;
        return numeroPar * numeroPar;
    }
}
