val l = List("AA", "BBCD", "CC")

for (
  s <- l
) print(s)

for (
  s <- l
  if (s.length > 3)
) print(s)

val result_for = for {
  s <- l
  s1 = s.toUpperCase()
  if (s1 != "")
} yield (s1)

val resultTry = try {
  Integer.parseInt("Dog")
} catch {
  case _ => 0
} finally {
  println("finally")
}

val code = 1;
val matchResult = code match {
  case 1 => "one"
  case 2 => "two"
  case _ => "others"
}

def test1(x: Int, y: Int): Int = x * x
def test2(x: => Int, y: => scala.Int): Int = x * x

test1(3 + 4, 3)
test2(3 + 4, 3)

test1(7, 2 + 4)
test2(7, 2 + 4)

def bar(x: Int, y: => Int): Int = 1
// def loop(): Int = loop

// bar(1, loop)
// bar(loop, 1)

def operate(f: (Int, Int) => Int) = {
  f(4, 4)
}

def greeting() = (name: String) => {
  "Hello " + name
}

(x: Int) => {
  x * x
}

(x: Int, y: Int) => {
  x + y
}

val add = (x: Int, y: Int) => {
  x + y
}

add(1, 3)

def test(x: Int)(y: Int) = {
  x + y
}

test(2)(3)
val testOne = test(2)_
testOne(1)



