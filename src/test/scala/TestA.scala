import org.nd4j.linalg.factory.Nd4j
import org.nd4j.linalg.indexing.{NDArrayIndex, BooleanIndexing}

/**
 * import DSL for scala api
 */
import org.nd4j.api.linalg.DSL._

class TestA extends org.scalatest.FunSuite {

  test("ND4JOps2dTest") {
    (1 to 100).foreach{p =>
      val m1 = Nd4j.create(p*1000 * p *1000).reshape(p * 1000,p * 1000)
      val m2 = Nd4j.create(p*1000 * p *1000).reshape(p * 1000,p * 1000)
      /**
       * Vector subtraction
       */
      val start = System.nanoTime()
      val m3 = m1 ** m2
      val stop = System.nanoTime()
      println(stop - start)
    }
    assert(true)
  }
}
