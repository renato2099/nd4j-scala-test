package org.nd4j

import org.nd4j.api.linalg.DSL._
import org.nd4j.linalg.api.ndarray.INDArray
import org.nd4j.linalg.factory.Nd4j
import org.nd4j.linalg.indexing.{NDArrayIndex, BooleanIndexing}
import org.nd4j.linalg.indexing.conditions.Conditions
import org.nd4j.linalg.indexing.functions.Value

/**
 */
class Nd4jPerf {
  (1 to 10).foreach{p =>
    val m1 = Nd4j.create(p*1000 * p *1000).reshape(p * 1000,p * 1000)
    val m2 = Nd4j.create(p*1000 * p *1000).reshape(p * 1000,p * 1000)
    /**
     * Vector subtraction
     */
    val start = System.nanoTime()
    //      val m3 = m1 ** m2
    val m3 = m1 - m2

    val stop = System.nanoTime()
    println(stop - start)
  }
}
