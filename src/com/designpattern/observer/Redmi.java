package com.designpattern.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Redmi implements Observable{

	List<Observer> observerList = new ArrayList<Observer>();
	
	private boolean inStock = false;
	
	public boolean isInStock() {
		return inStock;
	}

	public void setInStock(boolean inStock) {
		this.inStock = inStock;
		notifyObservers();
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
		for (Iterator iterator = observerList.iterator(); iterator.hasNext();) {
			Observer observer = (Observer) iterator.next();
			observer.update(this);
			
		}
		
	}

	@Override
	public void addObserver(Observer o) {
		// TODO Auto-generated method stub
		
		observerList.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		
		observerList.remove(o);
		
	}

}
