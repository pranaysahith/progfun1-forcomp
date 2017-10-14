import forcomp.loadDictionary
object Anagrams {
	val s = "abcd"                            //> s  : String = abcd
	
	for(e <- s ) yield List(e)                //> res0: scala.collection.immutable.IndexedSeq[List[Char]] = Vector(List(a), Lis
                                                  //| t(b), List(c), List(d))
	
	def combinations(s:String,inter:List[String]):List[String] = {
		if(s.isEmpty()) inter
		else
{		val r:List[String] = s.head.toString :: inter.map( s.head + _  ) ++ inter
		combinations(s.tail,r)
		}
	}                                         //> combinations: (s: String, inter: List[String])List[String]
	combinations(s,List())                    //> res1: List[String] = List(d, dc, dcb, dcba, dca, db, dba, da, c, cb, cba, ca
                                                  //| , b, ba, a)
	
	type Occurrences = List[(Char,Int)]
	def get_few(o: (Char,Int)): List[Occurrences] = {
      val res = for (i <- 1 to o._2) yield List((o._1, i))
      res.toList
    }                                             //> get_few: (o: (Char, Int))List[Anagrams.Occurrences]
    get_few(('a', 3))                             //> res2: List[Anagrams.Occurrences] = List(List((a,1)), List((a,2)), List((a,3)
                                                  //| ))
    
}