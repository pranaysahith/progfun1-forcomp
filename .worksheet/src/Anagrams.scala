import forcomp.loadDictionary
object Anagrams {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(63); 
	val s = "abcd";System.out.println("""s  : String = """ + $show(s ));$skip(30); val res$0 = 
	
	for(e <- s ) yield List(e);System.out.println("""res0: scala.collection.immutable.IndexedSeq[List[Char]] = """ + $show(res$0));$skip(206); 
	
	def combinations(s:String,inter:List[String]):List[String] = {
		if(s.isEmpty()) inter
		else
{		val r:List[String] = s.head.toString :: inter.map( s.head + _  ) ++ inter
		combinations(s.tail,r)
		}
	};System.out.println("""combinations: (s: String, inter: List[String])List[String]""");$skip(24); val res$1 = 
	combinations(s,List())
	
	type Occurrences = List[(Char,Int)];System.out.println("""res1: List[String] = """ + $show(res$1));$skip(172); 
	def get_few(o: (Char,Int)): List[Occurrences] = {
      val res = for (i <- 1 to o._2) yield List((o._1, i))
      res.toList
    };System.out.println("""get_few: (o: (Char, Int))List[Anagrams.Occurrences]""");$skip(22); val res$2 = 
    get_few(('a', 3));System.out.println("""res2: List[Anagrams.Occurrences] = """ + $show(res$2))}
    
}
