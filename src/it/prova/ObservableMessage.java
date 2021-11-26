package it.prova;

import java.util.ArrayList;
import java.util.List;

public class ObservableMessage {

	private String notizia;
	private List<Observer> notizie = new ArrayList<>();

	public void addObserver(Observer observer) {
		observer.update(this.notizia);
		this.notizie.add(observer);
	}

	public void removeObserver(Observer observer) {
		this.notizie.remove(observer);
	}

	public ObservableMessage() {
		this.notizia = "Non ci sono notizie";
	}

	public void setNotifica(String nuovaNotifica) {
		this.notizia = nuovaNotifica;
		for (Observer observer : this.notizie) {
			observer.update(this.notizia);
		}
	}

	public List<Observer> getDispositivi() {
		return notizie;
	}

	public void setDispositivi(List<Observer> notizie) {
		this.notizie = notizie;
	}

	public String getNotifica() {
		return notizia;
	}
	
}
