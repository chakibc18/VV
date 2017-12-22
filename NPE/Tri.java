package NPE;

import java.io.File;
import java.lang.reflect.Array;
import java.util.Set;
 
/**
 * Hello world!
 *xxx
 */
public class Tri 
{	int t=null; 
	int kris= 0;
	String name="TriCLass"+"cool";

	public Tri (String tri, int [] t) {
this.name=tri;
	}
	int calltri(int i){
		int j;
		j=10;
//		while(i<3) {
//		  i++;
//		  this.name="";
//		  }
		return j++;
	}
	 public static void main( String[] args ){
		 Tri2 tri=new Tri2( "");
		 tri.name="kristof";
			int j=2+1;
			 int  i = tri.calltri(j);
			if (j==2)
			  i = tri.calltri(2+10);
			else
				i=tri.calltri(3);
	 }
}
