'''Reto 2 abril - Calendario
Enunciado
Tu misión es simple, soldado: crear un calendario que muestre todos los meses del año y sus semanas de 
forma clara y organizada. Nada de efectos especiales ni complicaciones innecesarias, solo un buen código 
que haga el trabajo. Crea un programa que:

Itere los meses del año
Itere las semanas del mes
PISTA: Bucle for anidad.
Ejemplo
Enero Semana 1 Semana 2 Semana 3 …'''

meses = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"]
num_of_days = 0

for i in meses:
    days = 0
    if i == "Febrero":
        days = 28
    elif i in ["Abril", "Junio", "Septiembre", "Noviembre"]:
        days = 30
    else:
        days = 31
    print(i)
    for d in range(1,days + 1):   
        print(d, end="\t")
        if d % 7 == 0:
            print()
    print('\n')