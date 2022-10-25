def segregate(list:List[Double]):List[List[Double]] =
  def segregate_rec(list:List[Double],positive:List[Double],negative:List[Double]):List[List[Double]] =
    if list.isEmpty
    then List(positive, negative)
    else if list.head >= 0
          then segregate_rec (list.tail, positive++List(list.head) , negative)
          else segregate_rec (list.tail, positive, negative++List(list.head))
  segregate_rec (list, List(), List());

segregate (List(1, (-4.5), 0, (-2), 8))
