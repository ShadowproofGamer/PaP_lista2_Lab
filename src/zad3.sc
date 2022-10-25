def relisting(list:List[Int]):List[List[Int]] =
  if (list.isEmpty) then throw Exception (s"lista pusta")
  def relisting_rec(remainingList:List[Int], newList:List[List[Int]]):List[List[Int]] ={
    if (remainingList.isEmpty) then newList
    else {relisting_rec(remainingList.reverse.tail.reverse, newList++List(remainingList.reverse.tail).reverse)};
  }
  relisting_rec(list, List());;

  relisting(List(1, 5, 3, 11));
