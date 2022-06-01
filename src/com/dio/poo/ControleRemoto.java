package com.dio.poo;

public class ControleRemoto implements Controlador {
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleRemoto() {
		this.volume=50;
		this.ligado=false;
		this.tocando=false;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean getLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean getTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public void ligar() {
		this.setLigado(true);		
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		if(this.getLigado()) {
			System.out.println("----------MENU----------");
			System.out.println("Esta ligado?"+this.getLigado());
			System.out.println("Esta tocando? "+this.getTocando());
			System.out.println("Volume:"+this.getVolume());
			for(int i=0;i<=this.getVolume();i+=10) {
				System.out.print("|");
			}
		}else {
			System.out.println("APARELHO DESLIGADO!!");
		}System.out.println("");
	}

	@Override
	public void fecharMenu() {
		if(this.getLigado()) {
			System.out.println("FECHANDO MENU!!!");
		}else {
			System.out.println("APARELHO DESLIGADO!!");
		}
		
	}

	@Override
	public void maisVol() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume()+5);
		}else {
			System.out.println("APARELHO DESLIGADO!");
		}
	}

	@Override
	public void menosVol() {
		if(this.getLigado() && (this.getVolume()>0)) {
			this.setVolume(this.getVolume()-5);
		}else {
			System.out.println("APARELHO DESLIGADO!!");
		}
	}

	@Override
	public void mute() {
		if (this.getLigado()&&(this.getVolume()>0)) {
			this.setVolume(0);
		}else {
			System.out.println("APARELHO DESLIGADO!!");
		}
	}

	@Override
	public void desmute() {
		if(this.getLigado()&& (this.getVolume()==0)) {
			this.setVolume(50);
		}else {
			System.out.println("APARELHO DESLIGADO!!");
		}
	}

	@Override
	public void play() {
		if (this.getLigado()) {
			this.setTocando(true);
		}else {
			System.out.println("APARELHO DESLIGADO!!");
		}
	}

	@Override
	public void pause() {
		if (this.getLigado()&&(this.getTocando()==true)) {
			this.setTocando(false);
		}else {
			System.out.println("APARELHO DESLIGADO!!");
		}
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	

}
