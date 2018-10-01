class CubeCalculatorTest extends org.scalatest.FunSuite {
  test("CubeCalculator.cube") {
    assert(CubeCalculator.cube(3) === 27)
    assert(CubeCalculator.cube(9) === 729)
  }
  test("CubeCalculator.square") {
    assert(CubeCalculator.square(3) === 9)
    assert(CubeCalculator.square(9) === 81)
  }
}
