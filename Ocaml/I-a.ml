let list1 = [1;2;4;6;9;-2;-5];;
let list2 = [-2;5;3;4;5;-4;-3];;

let soma num1 num2 = (
  num1 + num2
);;


let media num1 num2 = (
  (soma num1 num2)/2
);;

let calcular num1 num2 = (
  if(num1 > 0 && num2 > 0) then
    media num1 num2
  else
    soma num1 num2
);;

let obterLista  list1  list2 = (
  let list =[] in 
  let rec preencher list1 list2 = (
    match list1 with
    | [] -> []
    | hl1::tl1 ->
      match list2 with
      | [] -> []
      | hl2::tl2 -> (
        (calcular hl1 hl2)::(preencher tl1 tl2)
      )
  ) in list@(preencher list1 list2)
);;

let list = obterLista list1 list2;;

let rec resultados list = (
  match list with
  | [] -> []                                                            
  | h::t -> print_int h; print_char ' ';
  resultados t                              
);;

(resultados list);;