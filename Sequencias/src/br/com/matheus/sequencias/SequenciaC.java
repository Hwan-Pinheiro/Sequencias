package br.com.matheus.sequencias;

public class SequenciaC {
	 public int proximoElemento(int ultimoElemento) {
	        int numeroNatural = (int) Math.sqrt(ultimoElemento) + 1;
	        return numeroNatural * numeroNatural;
	 }
	 }
