@main
def main(): Unit =
  println("------------------------------------------------------------")
  println("Hello world! This is a Scala program to illustrate the Ranges")

  println("Ranges simple example:")
  val rangeEx = new RangeDemo()
  rangeEx.rangeExample()

  println("Until and Range methods example:")
  rangeEx.untilAndRange()

  println("Including upper bound example:")
  rangeEx.includingUpperBound()

  println("Inclusive and To example:")
  rangeEx.inclusiveAndTo()

  println("-------------------------------------------------------------")

  println("Range from 10 to 13 inclusive example:")
  val rangeTest = new RangeExample()
  rangeTest.simpleRange()

  println("Steps. Uses to() and until to build ranges example:")
  rangeTest.stepsExample()

  println("Create range example:")
  rangeTest.createRange()

  println("Contains in range example:")
  rangeTest.containsExample()


