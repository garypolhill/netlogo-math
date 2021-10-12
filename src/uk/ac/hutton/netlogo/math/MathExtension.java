/**
 * 
 */
package uk.ac.hutton.netlogo.math;

import org.nlogo.api.DefaultClassManager;
import org.nlogo.api.ExtensionException;
import org.nlogo.api.PrimitiveManager;

/**
 * @author gary
 *
 */
public class MathExtension extends DefaultClassManager {

	@Override
	public void load(PrimitiveManager primManager) throws ExtensionException {
		primManager.addPrimitive("e", new MathLibrary(MathLibrary.MathCommand.E));
		primManager.addPrimitive("pi", new MathLibrary(MathLibrary.MathCommand.PI));
		primManager.addPrimitive("random", new MathLibrary(MathLibrary.MathCommand.RANDOM));
		primManager.addPrimitive("abs", new MathLibrary(MathLibrary.MathCommand.ABS));
		primManager.addPrimitive("acos", new MathLibrary(MathLibrary.MathCommand.ACOS));
		primManager.addPrimitive("asin", new MathLibrary(MathLibrary.MathCommand.ASIN));
		primManager.addPrimitive("atan", new MathLibrary(MathLibrary.MathCommand.ATAN));
		primManager.addPrimitive("cbrt", new MathLibrary(MathLibrary.MathCommand.CBRT));
		primManager.addPrimitive("ceil", new MathLibrary(MathLibrary.MathCommand.CEIL));
		primManager.addPrimitive("cos", new MathLibrary(MathLibrary.MathCommand.COS));
		primManager.addPrimitive("cosh", new MathLibrary(MathLibrary.MathCommand.COSH));
		primManager.addPrimitive("decrement-exact", new MathLibrary(MathLibrary.MathCommand.DECREMENT_EXACT));
		primManager.addPrimitive("exp", new MathLibrary(MathLibrary.MathCommand.EXP));
		primManager.addPrimitive("expm1", new MathLibrary(MathLibrary.MathCommand.EXPM1));
		primManager.addPrimitive("floor", new MathLibrary(MathLibrary.MathCommand.FLOOR));
		primManager.addPrimitive("get-exponent", new MathLibrary(MathLibrary.MathCommand.GET_EXPONENT));
		primManager.addPrimitive("increment-exact", new MathLibrary(MathLibrary.MathCommand.INCREMENT_EXACT));
		primManager.addPrimitive("log", new MathLibrary(MathLibrary.MathCommand.LOG));
		primManager.addPrimitive("log10", new MathLibrary(MathLibrary.MathCommand.LOG10));
		primManager.addPrimitive("log1p", new MathLibrary(MathLibrary.MathCommand.LOG1P));
		primManager.addPrimitive("negate-exact", new MathLibrary(MathLibrary.MathCommand.NEGATE_EXACT));
		primManager.addPrimitive("next-down", new MathLibrary(MathLibrary.MathCommand.NEXT_DOWN));
		primManager.addPrimitive("next-up", new MathLibrary(MathLibrary.MathCommand.NEXT_UP));
		primManager.addPrimitive("rint", new MathLibrary(MathLibrary.MathCommand.RINT));
		primManager.addPrimitive("round", new MathLibrary(MathLibrary.MathCommand.ROUND));
		primManager.addPrimitive("signum", new MathLibrary(MathLibrary.MathCommand.SIGNUM));
		primManager.addPrimitive("sin", new MathLibrary(MathLibrary.MathCommand.SIN));
		primManager.addPrimitive("sinh", new MathLibrary(MathLibrary.MathCommand.SINH));
		primManager.addPrimitive("sqrt", new MathLibrary(MathLibrary.MathCommand.SQRT));
		primManager.addPrimitive("tan", new MathLibrary(MathLibrary.MathCommand.TAN));
		primManager.addPrimitive("tanh", new MathLibrary(MathLibrary.MathCommand.TANH));
		primManager.addPrimitive("to-degrees", new MathLibrary(MathLibrary.MathCommand.TO_DEGREES));
		primManager.addPrimitive("to-int-exact", new MathLibrary(MathLibrary.MathCommand.TO_INT_EXACT));
		primManager.addPrimitive("to-radians", new MathLibrary(MathLibrary.MathCommand.TO_RADIANS));
		primManager.addPrimitive("ulp", new MathLibrary(MathLibrary.MathCommand.ULP));
		primManager.addPrimitive("add-exact", new MathLibrary(MathLibrary.MathCommand.ADD_EXACT));
		primManager.addPrimitive("atan2", new MathLibrary(MathLibrary.MathCommand.ATAN2));
		primManager.addPrimitive("copy-sign", new MathLibrary(MathLibrary.MathCommand.COPY_SIGN));
		primManager.addPrimitive("floor-div", new MathLibrary(MathLibrary.MathCommand.FLOOR_DIV));
		primManager.addPrimitive("floor-mod", new MathLibrary(MathLibrary.MathCommand.FLOOR_MOD));
		primManager.addPrimitive("hypot", new MathLibrary(MathLibrary.MathCommand.HYPOT));
		primManager.addPrimitive("ieee-remainder", new MathLibrary(MathLibrary.MathCommand.IEEE_REMAINDER));
		primManager.addPrimitive("max", new MathLibrary(MathLibrary.MathCommand.MAX));
		primManager.addPrimitive("min", new MathLibrary(MathLibrary.MathCommand.MIN));
		primManager.addPrimitive("multiply-exact", new MathLibrary(MathLibrary.MathCommand.MULTIPLY_EXACT));
		primManager.addPrimitive("next-after", new MathLibrary(MathLibrary.MathCommand.NEXT_AFTER));
		primManager.addPrimitive("pow", new MathLibrary(MathLibrary.MathCommand.POW));
		primManager.addPrimitive("scalb", new MathLibrary(MathLibrary.MathCommand.SCALB));
		primManager.addPrimitive("subtract-exact", new MathLibrary(MathLibrary.MathCommand.SUBTRACT_EXACT));

	}

}
