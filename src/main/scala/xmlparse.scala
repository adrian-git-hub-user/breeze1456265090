import scala.io.Source
 
object xmlparse extends App {

val filename = "C:\\Users\\Adrian\\Desktop\\breeze\\file.txt"

val lines : List[String] = Source.fromFile(filename).getLines().toList;

val fil : List[String] = lines.filter(l => l.startsWith("4"))

fil.foreach(println)
}