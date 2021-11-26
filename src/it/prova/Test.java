package it.prova;

public class Test {

	 public static void main(String[] args) {
		 
	        ObservableMessage notifiche = new ObservableMessage();
	        
	        Observer observer1 = new ObserverMessage("Tg");
	        Observer observer2 = new ObserverMessage("Sky");

	        notifiche.addObserver(observer1);
	        notifiche.setNotifica("Ci sono 2 Notizie!");
	        
	        notifiche.addObserver(observer2);
	        notifiche.setNotifica("C'è 1 Notiziza!");


	        notifiche.removeObserver(observer2);
	   

	    }
}
