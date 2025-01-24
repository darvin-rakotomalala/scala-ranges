class RangeDemo {

  def rangeExample(): Unit = {
    val x = Range(3, 10, 1)

    // Displays given range
    println(x)

    // Displays starting value
    // of the given range
    println(x(0))

    // Displays last value
    // of the given range
    println(x.last)
  }

  // Here, by method performs the work of increment.
  def untilAndRange(): Unit = {
    // applying range method
    val x = Range(0, 10, 2)

    // applying until method
    val y = 0 until 10 by 2

    // Displays true if both the
    // methods are equivalent
    println(x == y)
  }

  def includingUpperBound(): Unit = {
    // applying range method
    val x = Range(1, 8)

    // Including upper bound
    val y = x.inclusive

    // Displays all the elements
    // of the range
    println(y)
  }

  def inclusiveAndTo(): Unit = {
    // applying range method
    val x = Range(1, 8)

    // Including upper bound
    val y = x.inclusive

    // applying 'to' method
    val z = 1 to 8

    // Displays true if both the
    // methods are equal
    println(y == z)
  }

}
