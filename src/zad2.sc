def divisible(divider:Int, list:List[Int]):List[Int] = {
  def divisible_rec(div:Int, remaining:List[Int], newList:List[Int]):List[Int] = {
    if remaining.isEmpty then newList
    else divisible_rec(div, remaining.tail, {
      if math.floorMod(remaining.head, div)==0 then newList:::List(remaining.head)
      else newList
    })
  }
  divisible_rec(divider, list, List())
}

divisible(3, List(1, 3, 4, 6, 7, 9, 11, 12, 13, 15))