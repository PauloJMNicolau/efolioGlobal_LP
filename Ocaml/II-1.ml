type tree = 
  Leaf                                 
  | Node of int * tree * tree 
;;

let arvore =
  Node(5,
    Node(3,
      Node(2,Leaf,Leaf),
      Node(4,Leaf,Leaf)
    ),
    Node(8,
      Node(7,Leaf,Leaf),
      Node(9,Leaf,Leaf)
    )
  );;

let calcAmplitude min max =(
  max - min
);;

let rec getMin tree = (
  match tree with
  | Leaf -> 0
  | Node (v, l, r) -> (
    if(l == Leaf) then
      v
    else
      getMin l
  )
);;


let rec getMax tree = (
  match tree with
  | Leaf -> 0
  | Node (v, l, r) -> (
   if(r == Leaf) then
      v
   else
      getMax r
  )
);;


print_int (calcAmplitude (getMin arvore) (getMax arvore));;