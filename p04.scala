object P04 {
    def length(ls: List[_]): Int = ls match {
        case Nil => 0
        case _ :: tail => 1 + length(tail)  
    }
}
