package NPE;

import java.io.File;
import java.lang.reflect.Array;
import java.util.Set;

import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.code.CtCodeSnippetStatement;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtType;
/**
 * Hello world!
 *
 */
public class Tri2 implements TestDiscard
{ 
	String name="";
	public Tri2 () {
		
	}	public Tri2 (String s) {
		this.name=s;
	}
	int calltri(int i){
		while (i<3)
		{System.out.println("ok");
			i++;
		}

 if (i <4) {
			return 3;
		}else		
		return 1;
		return static_compute(4);
	}
	
 
	@Override
	public void compute() {
		// TODO Auto-generated method stub
		
	}
	static int  static_compute(int x) {
		return 0;
		
	}
}
