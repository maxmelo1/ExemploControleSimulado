package br.edu.ifms.controller;



import controller.SignalLoader;
import net.sourceforge.jFuzzyLogic.FIS;

public class TesteSinal {
	private int size;
	private float erro;
	private SignalLoader sampler;
	
	public TesteSinal() {
		erro = 0;
		sampler = new SignalLoader();
		sampler.printlHelp();
		
		/**
		 * São 3 sinais a simular. Chame os métodos abaixo para cada resolução. É possível usar PID ou apenas o P.
		 * Crie soluções para Fuzzy, P (ou PID)- Fuzzy e uma puramente fuzzy. Em cada solução, salve as saídas de
		 * erro e controle em arquivos erro.csv e controle.csv, respectivamente. Plote-os executando os arquivos
		 * plot_erro.py e plot_controle.py que devem estar na mesma pasta dos arquivos csv. É importante ajustar
		 * os parâmetros observando os gráficos de erro, principalmente fuzzy. Lembre-se que o controle deverá 
		 * responder em sentido contrário ao erro.
		 * Implemente o MAE e o RMSE e mostre os valores ao fim.
		 */
	}
	
	public void sinal1() {
		size = sampler.getSize(0);
		float target, current, error;
		
		
		
		for(int i=0; i<size; i++) {
			target = sampler.getSample(0, i);
		}
	}
	
	public void sinal2() {
		size = sampler.getSize(1);
	}

	public void sinal3() {
		size = sampler.getSize(2);
	}
	
	
	private float getMeanAbsoluteError() {
		//implementar \frac{1}{n}\sum_{i=0}^{n}abs(alvo-obtido)
		return -1.f;
	}
	
	private float getRootMeanSquaredError() {
		//implementar \frac{1}{n}\sum_{i=0}^{n}\sqrt{(alvo-obtido)^2}
		return -1.f;
	}
	
	
	public static void main(String[] args) {
		new TesteSinal();
	}
}
