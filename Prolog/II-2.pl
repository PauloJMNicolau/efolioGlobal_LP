teste_covid("Paulo", "15-02-2021", "Negativo", "PCR").
teste_covid("Rui", "15-02-2021", "Positivo", "PCR").
teste_covid("Antonio", "15-02-2021", "Positivo", "PCR").
teste_covid("Raquel", "15-02-2021", "Positivo","Sorologico").

testes_positivos(Data, TipoTeste, Lista):-
    findall(X, teste_covid(X, Data, "Positivo", TipoTeste), Lista).