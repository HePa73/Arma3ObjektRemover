package org.henrypawlak.Arma3ObjektRemover;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Writer {
		private List<String> IdList;
		public Writer(List<String> Idlist) {
			this.IdList = Idlist;
		}
		
		public String writeCode() {
			FileWriter fwriter = null;
			BufferedWriter writer = null;
			try {
				fwriter = new FileWriter("./code.txt");
				writer = new BufferedWriter(fwriter);
				for (String ID : IdList) {
					writer.write("this enableSimulation false; this allowDamage false; delh = [0,0,0] nearestObject 1779863; delh hideObject true; delh = [0,0,0] nearestObject " +  ID + "; delh hideObject true;");
					writer.newLine();
				}
				writer.close();
				fwriter.close();
				return "Successfull";
			}catch(IOException e) {
				e.printStackTrace();
				return "Error while writing the file";
			}			
		
			
		}
}
