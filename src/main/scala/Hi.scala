/*https://github.com/scalanlp/breeze/wiki/Quickstart
*/

import breeze.linalg._
import breeze.optimize._

object Hi extends App{

def p(a : Any) = {
	println("value is "+a)
}

val x = DenseVector.zeros[Double](2)
p(x)

def g(x: DenseVector[Double]) = (x - 3.0):^ 2.0 sum

//println(g(DenseVector(0.0,0.0,0.0)))

val diffg = new ApproximateGradientFunction(g)
val grad = diffg.gradientAt(DenseVector(3,0,1))

p(grad)

}