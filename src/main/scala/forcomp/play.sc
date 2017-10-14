package forcomp

object play {
  val m = "hello"                                 //> m  : String = hello
  val res0 = m.map(c => (c,1))                    //> res0  : scala.collection.immutable.IndexedSeq[(Char, Int)] = Vector((h,1), (e
                                                  //| ,1), (l,1), (l,1), (o,1))
  m.groupBy( x => x).toList.map( x => (x._1,x._2.length))
                                                  //> res0: List[(Char, Int)] = List((e,1), (h,1), (l,2), (o,1))
}