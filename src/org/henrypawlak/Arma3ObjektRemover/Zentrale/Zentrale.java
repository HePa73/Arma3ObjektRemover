package org.henrypawlak.Arma3ObjektRemover.Zentrale;

import java.util.LinkedList;
import java.util.List;

import org.henrypawlak.Arma3ObjektRemover.Controller;
import org.henrypawlak.Arma3ObjektRemover.Writer;

public class Zentrale {
	private Controller C;
	private List<String> IDList = new LinkedList<>();
	public Zentrale(Controller c) {
		this.C=c;
	}
	
	public String addID(String id) {
		for (String ID : IDList) {
			if(id == ID){
				return "ID already added";
			}
		}
		try {
			Integer.parseInt(id);
			IDList.add(id);
			return "ID successfully added";
		}catch(NumberFormatException e) {
			return "Not a Number";
		}
	}
	public String finish() {
		Writer writer = new Writer(this.IDList);
		return writer.writeCode();
	}
	
	public Controller getC() {
		return C;
	}
	public List<String> getIDList() {
		return IDList;
	}
	
	
	
	
}
