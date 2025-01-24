class RangeExample {

  def simpleRange(): Unit = {
    // Create range from 10 to 13 inclusive.
    val range = 10.to(13)
    println(range)

    // Print some properties of the range.
    println("IsInclusive = " + range.isInclusive)
    println("IsEmpty = " + range.isEmpty)
    println("Start = " + range.start)
    println("End = " + range.end)
    println("Step = " + range.step)

    // Sum all elements in the range.
    val total = range.sum
    println("Sum = " + total)
  }

  /*
    Steps. Let us continue with ranges. This program uses to() and until to build ranges.
    But then it adds another feature, the by() function, to specify a step on these ranges.
   */
  def stepsExample(): Unit = {
    // Create a range of even numbers.
    // ... Use a step of 2 with the by function.
    val evens = 10.to(20).by(2)
    println(evens)

    // Use until to create a range that omits the final number (exclusive end).
    // ... Use by to specify a negative step.
    // ... The range is descending from high to low.
    val descending = 20.until(0).by(-5)
    println(descending)
  }

  /*
    A range can be created directly with the Range type. This is sometimes a clearer way to create a range.
    With this syntax, the "end" is exclusive (it is not part of the range).
   */
  def createRange(): Unit = {
    // Create a range of 10 until 13 (end is exclusive).
    val range1 = Range(10, 13)
    println(range1)

    // Create a range of 10 until 20 with step of 3.
    val range2 = Range(10, 20, 3)
    println(range2)
  }

  /*
    Contains. Is a value present in a range? With the contains() function,
    we determine if the argument exists in a range. It returns true or false (a Boolean).
   */
  def containsExample(): Unit = {
    val testRange = 10.to(12)

    // This value is contained in the range.
    if (testRange.contains(10)) println(true)

    // This value is not present.
    if (!testRange.contains(14)) println(false)
  }


}
