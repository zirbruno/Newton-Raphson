//se utiliza la libreria symja-lib-2015-08-09.jar
import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.eval.ExprEvaluator;
import org.matheclipse.core.interfaces.IExpr;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc1
 */
public class Calcular {
    public static String derivar(String exp){
        ExprEvaluator util1 = new ExprEvaluator( );
        EvalEngine engine = util1.getEvalEngine();
           
        String uno="D(";
        String dos=",x)";
        IExpr result = util1.evaluate(uno+exp+dos);
        
        //System.out.println(result.toString());
   
        return result.toString();
    }
    public static Double calnr(String fun,String deriv, double x0){
        ExprEvaluator util = new ExprEvaluator();
        EvalEngine engine = util.getEvalEngine();
        String uno="x=";
        String dos= Double.toString(x0);
        String tres="-(";
        String cuatro=")/(";
        String cinco=")";
        IExpr result = util.evaluate(uno+dos);
        result = util.evaluate(dos+tres+fun+cuatro+deriv+cinco);
        util.evaluate("clear(x)");
        Double res=Double.parseDouble(result.toString());
       
        return res;

    }


}
