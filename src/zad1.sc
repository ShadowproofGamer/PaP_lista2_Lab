def fa (x:Int) =
  def faa (y:Int) =
    def faaa (z:Int) = List((z, (z-1)));
    faaa (y+1)
  faa (x);;
fa (10);;

def fb (list:List[List[Float]]) =
  if (list.head.isEmpty) then throw Exception (s"pusta lista")
  def fbb (value:Float) = List(value, (value+1))
  fbb (list.head.head);;
fb (List(List(2, 5), List()));

def fc (x:Int) =
  def fcc (krotka:(List[Int], List[Int])) =
    (krotka._1,(((krotka._1).head),(krotka._2.head )) , ((krotka)._2.head))
  fcc (List(x, (x+2)), List((x+3), (x+4)));;
fc(10);;