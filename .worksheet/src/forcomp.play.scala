package forcomp

object play {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(48); 
  val m = "hello";System.out.println("""m  : String = """ + $show(m ));$skip(31); 
  val res0 = m.map(c => (c,1));System.out.println("""res0  : scala.collection.immutable.IndexedSeq[(Char, Int)] = """ + $show(res0 ));$skip(58); val res$0 = 
  m.groupBy( x => x).toList.map( x => (x._1,x._2.length));System.out.println("""res0: List[(Char, Int)] = """ + $show(res$0))}
}
