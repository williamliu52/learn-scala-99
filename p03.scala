object P03 {
    def nth[A](n: Int, ls: List[A]): A = (n, ls) match {
        case (0, h :: _) => h
        case (n, _ :: tail) => nth(n-1, tail)
        case (_, Nil) => throw new NoSuchElementException
    }
}
