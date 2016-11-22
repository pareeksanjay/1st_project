package Source;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

import Interfaces.Calculator_RPMN;

public class Calculate implements Calculator_RPMN {

	public int Operations(String expression) {	
		
		Stack<String> tks = new Stack<String>();
	    tks.addAll(Arrays.asList(expression.trim().split(",")));
	    /*if (tks.peek().equals("")) continue;
	      try {
	        double r = evalrpn(tks);
	        if (!tks.empty()) throw new Exception();
	        System.out.println(r);
	      }
	      catch (Exception e) {System.out.println("error");}
	    }*/
	    
		HashMap<String,Object> Hm =new HashMap<String,Object>();	
		Hm.put("+",new Addition());
		Hm.put("-",new Subtraction());
		Hm.put("/",new Division());
		Hm.put("*", new Multiplication());
		Hm.put("%",new ModeOperator());
		return 0;	     
	}
	
	 private static double evalrpn(Stack<String> tks) throws Exception {
		    String tk = tks.pop();
		    double x,y;
		    try {x = Double.parseDouble(tk);}
		    catch (Exception e) {
		      y = evalrpn(tks);  x = evalrpn(tks);
		      if      (tk.equals("+"))  x += y;
		      else if (tk.equals("-"))  x -= y;
		      else if (tk.equals("*"))  x *= y;
		      else if (tk.equals("/"))  x /= y;
		      else throw new Exception();
		    }
		    return x;
		  }
	
	

}
