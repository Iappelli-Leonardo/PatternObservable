package it.prova;

public class ObserverMessage implements Observer {

	private String id;
	private String notifica;

	public ObserverMessage(String id) {
		this.id = id;
	}

	@Override
	public void update(Object notifica) {
		System.out.println(" "+ id + " News: " + (String) notifica);
		this.notifica = (String) notifica;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNotifica() {
		return notifica;
	}

	public void setNotifica(String notifica) {
		this.notifica = notifica;
	}

}
