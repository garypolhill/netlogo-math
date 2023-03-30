# Note Bene

This version of the code has been updated to 6.3, but since the old version of the extension still works, then there is currently no need to release it to Netlogo. We want to keep the workload on the maintainers of NetLogo to a minimum.

# netlogo-math
Implement access to the Math library from inside Java. Many of these commands, such as `expm1`, `log1p` and `hypot` will produce better numerical accuracy than calculating them using expressions in code. The following summarizes the commands available.

## Zero argument commands
  + `e` -- return the nearest double-precision floating-point number to the base of natural logarithms
  + `pi` -- return the nearest double-precision floating-point number to _pi_
  + `random` -- return a random number in the range [0, 1[
  
## One argument commands
  + `abs` -- return the absolute value of the argument
  + `acos` -- return the arc cosine of the argument in the range [0, _pi_]
  + `asin` -- return the arc sine of the argument in the range [- _pi_ / 2, _pi_ / 2]
  + `atan` -- return the arc tangent of the argument in the range [- _pi_ / 2, _pi_ / 2]
  + `cbrt` -- return the cube root of the argument
  + `ceil` -- return the smallest integer (as a double) greater than or equal to the argument
  + `cos` -- return the cosine of the argument (in radians)
  + `cosh` -- return the hyperbolic cosine of the argument
  + `decrement-exact` -- decrement the integer argument (by one), throwing an exception on integer underflow
  + `exp` -- return the base of natural logarithm raised to the power of the argument
  + `expm1` -- return one less than the base of the natural argument raised to the power of the argument
  + `floor` -- return the largest integer (as a double) less than or equal to the argument
  + `get-exponent` -- return the exponent of the (double) argument (an integer)
  + `increment-exact` -- increment the integer argument (by one), throwing an exception on integer overflow
  + `log` -- return the logarithm (base _e_) of the argument
  + `log10` -- return the logarithm (base 10) of the argument
  + `log1p` -- return the logarithm (base _e_) of the argument + 1
  + `negate-exact` -- return the (integer) negation of the (integer) argument, throwing an exception on overflow
  + `next-down` -- return the next double-precision floating-point number after the argument in the direction of negative infinity
  + `next-up` -- return the next double-precision floating-point number after the argument in the direction of positive infinity
  + `rint` -- return the (double) integer closest to the argument
  + `round` -- return the closest `int` to the argument (which is cast to a `float` first)
  + `signum` -- return the sign of the argument in {0, -1, 1} (as doubles), for {zero, negative, positive} numbers respectively
  + `sin` -- return the sine of the argument (in radians)
  + `sinh` -- return the hyperbolic sine of the argument
  + `sqrt` -- return the square root of the argument
  + `tan` -- return the tangent of the argument (in radians)
  + `tanh` -- return the hyperbolic tangent of the argument
  + `to-degrees` -- convert the argument (in radians) to degrees
  + `to-int-exact` -- convert the argument to an integer, throwing an exection on overflow (calls `round` without casting to `float`, returning a `long`, which is then converted to an integer)
  + `to-radians` -- convert the argument (in degrees) to radians
  + `ulp` -- returns the size of the 'units in the last place' of the argument
  
## Two argument commands
  + `add-exact` -- returns the integer sum of the two integer arguments, throwing an exception on overflow
  + `atan2` -- returns the angle between the co-ordinate arguments (like NetLogo's `atan`) -- y-axis then x-axis
  + `copy-sign` -- returns the first argument with the sign of the second argument
  + `floor-div` -- returns the largest integer less than or equal to the quotient of the (integer) arguments
  + `floor-mod` -- returns the floor modulus of the integer arguments
  + `hypot` -- returns the length of the hypotenuse formed from a right-angled triangle with two other sides of length the two arguments
  + `ieee-remainder` -- returns the remainder after dividing the first argument by the second, as specified by the IEEE 754 standard
  + `max` -- returns the larger of the two arguments
  + `min` -- returns the smaller of the two arguments
  + `multiply-exact` -- returns the product of the two (integer) arguments, with exception on overflow
  + `next-after` -- returns next double-precision floating-point number after the first argument in the direction of the second
  + `pow` -- returns the first argument raised to the power of the second
  + `scalb` -- returns the first argument multiplied by 2 raised to the power of the (integer) second
  + `subtract-exact` -- returns the first argument minus the second, with exception on integer overflow

# Notes

In this latest version I (DS) have included scripts for compilation, build and
execution of the extension. The scripts to achieve this are in the `script`
directory. There are in this directory as the compiled Java classes end up in
the bin directory. This is because the original author (GP) would have used an
IDE and IDE tend to wipe everything out in the bin directory (assumption of
authority). I have included scripts, because all this predicates is the
presence of `javac` and `bash` or `zsh`.

In addition I have added a few more documentation files, or howtos.

# Manifest

+ `BUILD.md` - instructions on how to build the extension using javac and bash/zsh.
+ `LICENSE` - the licence under which this code is released - GPLv3
+ `PUBLISHING.md` - how to get all this merged into the Netlogo extensions tab
+ `README.md` - this file
+ `bin` - the directory where the compiled class files are kept.
+ `lib` - the libraries needed to build the jar
+ `manifest.txt` - the manifest for the contents of the jar.
+ `math.jardesc` - ??? - presumably something to do with the IDE that was being used.
+ `netlogo` - a reference program demonstrating use of the extension.
+ `scripts` - compile, build and run scripts.
+ `src` - the source files for the extension.
+ `zip` - where the files are placed for use in publishing.
