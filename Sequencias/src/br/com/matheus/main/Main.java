package br.com.matheus.main;

import br.com.matheus.sequencias.SequenciaA;
import br.com.matheus.sequencias.SequenciaB;
import br.com.matheus.sequencias.SequenciaC;
import br.com.matheus.sequencias.SequenciaD;
import br.com.matheus.sequencias.SequenciaE;
import br.com.matheus.sequencias.SequenciaF;

public class Main {

	public static void main(String[] args) {
		 SequenciaA seqA = new SequenciaA();
	        System.out.println("a) 1, 3, 5, 7, " + seqA.proximoElemento(7));

	        SequenciaB seqB = new SequenciaB();
	        System.out.println("b) 2, 4, 8, 16, 32, 64, " + seqB.proximoElemento(64));

	        SequenciaC seqC = new SequenciaC();
	        System.out.println("c) 0, 1, 4, 9, 16, 25, 36, " + seqC.proximoElemento(36));

	        SequenciaD seqD = new SequenciaD();
	        System.out.println("d) 4, 16, 36, 64, " + seqD.proximoElemento(64));

	        SequenciaE seqE = new SequenciaE();
	        System.out.println("e) 1, 1, 2, 3, 5, 8, " + seqE.proximoElemento(8, 5));

	        SequenciaF seqF = new SequenciaF();
	        System.out.println("f) 2, 10, 12, 16, 17, 18, 19, " + seqF.proximoElemento(19));

	}

}
