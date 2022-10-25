let divisible list divider  = 
  let rec divisible_rec div remaining newList = 
    if remaining=[] then newList
    else if (List.hd remaining) mod div = 0 then divisible_rec div (List.tl remaining) (newList@[(List.hd remaining)])
    else divisible_rec div (List.tl remaining) newList
  in divisible_rec divider list [];;
divisible [1;3;4;6;7;9;11;12;13;15] 3;;
