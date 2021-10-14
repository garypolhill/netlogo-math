/**
 * 
 */
package uk.ac.hutton.netlogo.math;

import org.nlogo.api.Argument;
import org.nlogo.api.Context;
import org.nlogo.api.ExtensionException;
import org.nlogo.api.Reporter;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

/**
 * @author gary
 *
 */
public class MathLibrary implements Reporter {
	public enum MathCommand {
		ABS, ACOS, ADD_EXACT, ASIN, ATAN, ATAN2, CBRT, CEIL, COPY_SIGN, COS, COSH, DECREMENT_EXACT, E, EXP, EXPM1,
		FLOOR, FLOOR_DIV, FLOOR_MOD, GET_EXPONENT, HYPOT, IEEE_REMAINDER, INCREMENT_EXACT, LOG, LOG10, LOG1P, MAX, MIN,
		MULTIPLY_EXACT, NEGATE_EXACT, NEXT_AFTER, NEXT_DOWN, NEXT_UP, PI, POW, RANDOM, RINT, ROUND, SCALB, SIGNUM, SIN,
		SINH, SQRT, SUBTRACT_EXACT, TAN, TANH, TO_DEGREES, TO_INT_EXACT, TO_RADIANS, ULP
	};

	private MathCommand cmd;

	MathLibrary(MathCommand cmd) {
		this.cmd = cmd;
	}

	@Override
	public Syntax getSyntax() {
		switch (cmd) {
		case E:
		case PI:
		case RANDOM:
			return SyntaxJ.reporterSyntax(Syntax.NumberType());
		case ABS:
		case ACOS:
		case ASIN:
		case ATAN:
		case CBRT:
		case CEIL:
		case COS:
		case COSH:
		case DECREMENT_EXACT:
		case EXP:
		case EXPM1:
		case FLOOR:
		case GET_EXPONENT:
		case INCREMENT_EXACT:
		case LOG:
		case LOG10:
		case LOG1P:
		case NEGATE_EXACT:
		case NEXT_DOWN:
		case NEXT_UP:
		case RINT:
		case ROUND:
		case SIGNUM:
		case SIN:
		case SINH:
		case SQRT:
		case TAN:
		case TANH:
		case TO_DEGREES:
		case TO_INT_EXACT:
		case TO_RADIANS:
		case ULP:
			return SyntaxJ.reporterSyntax(new int[] { Syntax.NumberType() }, Syntax.NumberType());
		case ADD_EXACT:
		case ATAN2:
		case COPY_SIGN:
		case FLOOR_DIV:
		case FLOOR_MOD:
		case HYPOT:
		case IEEE_REMAINDER:
		case MAX:
		case MIN:
		case MULTIPLY_EXACT:
		case NEXT_AFTER:
		case POW:
		case SCALB:
		case SUBTRACT_EXACT:
			return SyntaxJ.reporterSyntax(new int[] { Syntax.NumberType(), Syntax.NumberType() }, Syntax.NumberType());
		default:
			throw new RuntimeException("BUG!");
		}
	}

	@Override
	public Object report(Argument[] args, Context context) throws ExtensionException {
		try {

			switch (cmd) {
			case E:
				return new Double(Math.E);
			case PI:
				return new Double(Math.PI);
			case RANDOM:
				return new Double(Math.random());
			case ABS:
				return new Double(Math.abs(args[0].getDoubleValue()));
			case ACOS:
				return new Double(Math.acos(args[0].getDoubleValue()));
			case ASIN:
				return new Double(Math.asin(args[0].getDoubleValue()));
			case ATAN:
				return new Double(Math.atan(args[0].getDoubleValue()));
			case CBRT:
				return new Double(Math.cbrt(args[0].getDoubleValue()));
			case CEIL:
				return new Double(Math.ceil(args[0].getDoubleValue()));
			case COS:
				return new Double(Math.cos(args[0].getDoubleValue()));
			case COSH:
				return new Double(Math.cos(args[0].getDoubleValue()));
			case DECREMENT_EXACT:
				return new Double((double) Math.decrementExact(args[0].getIntValue()));
			case EXP:
				return new Double(Math.exp(args[0].getDoubleValue()));
			case EXPM1:
				return new Double(Math.expm1(args[0].getDoubleValue()));
			case FLOOR:
				return new Double(Math.floor(args[0].getDoubleValue()));
			case GET_EXPONENT:
				return new Double((double) Math.getExponent(args[0].getDoubleValue()));
			case INCREMENT_EXACT:
				return new Double((double) Math.incrementExact(args[0].getIntValue()));
			case LOG:
				return new Double(Math.log(args[0].getDoubleValue()));
			case LOG10:
				return new Double(Math.log10(args[0].getDoubleValue()));
			case LOG1P:
				return new Double(Math.log1p(args[0].getDoubleValue()));
			case NEGATE_EXACT:
				return new Double((double) Math.negateExact(args[0].getIntValue()));
			case NEXT_DOWN:
				return new Double(Math.nextDown(args[0].getDoubleValue()));
			case NEXT_UP:
				return new Double(Math.nextUp(args[0].getDoubleValue()));
			case RINT:
				return new Double(Math.rint(args[0].getDoubleValue()));
			case ROUND:
				return new Double((double) Math.round((float) args[0].getDoubleValue()));
			case SIGNUM:
				return new Double(Math.signum(args[0].getDoubleValue()));
			case SIN:
				return new Double(Math.sin(args[0].getDoubleValue()));
			case SINH:
				return new Double(Math.sinh(args[0].getDoubleValue()));
			case SQRT:
				return new Double(Math.sqrt(args[0].getDoubleValue()));
			case TAN:
				return new Double(Math.tan(args[0].getDoubleValue()));
			case TANH:
				return new Double(Math.tanh(args[0].getDoubleValue()));
			case TO_DEGREES:
				return new Double(Math.toDegrees(args[0].getDoubleValue()));
			case TO_INT_EXACT:
				return new Double((double) Math.toIntExact(Math.round(args[0].getDoubleValue())));
			case TO_RADIANS:
				return new Double(Math.toRadians(args[0].getDoubleValue()));
			case ULP:
				return new Double(Math.ulp(args[0].getDoubleValue()));
			case ADD_EXACT:
				return new Double((double) Math.addExact(args[0].getIntValue(), args[1].getIntValue()));
			case ATAN2:
				return new Double(Math.atan2(args[0].getDoubleValue(), args[1].getDoubleValue()));
			case COPY_SIGN:
				return new Double(Math.copySign(args[0].getDoubleValue(), args[1].getDoubleValue()));
			case FLOOR_DIV:
				return new Double((double) Math.floorDiv(args[0].getIntValue(), args[1].getIntValue()));
			case FLOOR_MOD:
				return new Double((double) Math.floorMod(args[0].getIntValue(), args[1].getIntValue()));
			case HYPOT:
				return new Double(Math.hypot(args[0].getDoubleValue(), args[1].getDoubleValue()));
			case IEEE_REMAINDER:
				return new Double(Math.IEEEremainder(args[0].getDoubleValue(), args[1].getDoubleValue()));
			case MAX:
				return new Double(Math.max(args[0].getDoubleValue(), args[1].getDoubleValue()));
			case MIN:
				return new Double(Math.min(args[0].getDoubleValue(), args[1].getDoubleValue()));
			case MULTIPLY_EXACT:
				return new Double((double) Math.multiplyExact(args[0].getIntValue(), args[1].getIntValue()));
			case NEXT_AFTER:
				return new Double(Math.nextAfter(args[0].getDoubleValue(), args[1].getDoubleValue()));
			case POW:
				return new Double(Math.pow(args[0].getDoubleValue(), args[1].getDoubleValue()));
			case SCALB:
				return new Double(Math.scalb(args[0].getDoubleValue(), args[1].getIntValue()));
			case SUBTRACT_EXACT:
				return new Double((double) Math.subtractExact(args[0].getIntValue(), args[1].getIntValue()));
			default:
				throw new RuntimeException("BUG! MathLibrary created with unrecognized cmd option");
			}
		} catch (ArithmeticException e) {
			throw new ExtensionException(e.getMessage());
		}

	}

}
