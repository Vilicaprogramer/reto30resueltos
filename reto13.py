"""  ¿Alguna vez te has levantado con la necesidad de crear un cronómetro? Tranquilo, no eres el único. Hoy vas a 
poder hacer tu sueño realidad.
Crea un programa que:
Pida al usuario que ingrese el número de segundos que desea contar.
Usa un bucle para contar desde el primer segundo hasta el número total de segundos indicado por el usuario.
Cada vez que el cronómetro llegue a 60 segundos, debe reiniciar los segundos a 0 y sumar 1 minuto.
Cuando los minutos lleguen a 60, debe reiniciar los minutos a 0 y sumar 1 hora.
El cronómetro debe mostrar el tiempo en formato hh:mm:ss, donde hh son las horas, mm los minutos y ss los segundos.

PISTA: Para que el cronómetro se actualice cada segundo, puedes utilizar la función time.sleep(1). Esto hará que el 
programa espere 1 segundo entre cada iteración del bucle, imitando el comportamiento de un cronómetro real.

Ejemplo:
-------------------------------
00:00:01
00:00:02
00:00:03
etc.  """

import time

inp = input("Introduce el número de segundos a contar: ")
sg, mn, hr = 0, 0, 0

for i in range(int(inp)):
    sg += 1
    if sg == 60:
            mn += 1
            sg = 0
            if mn == 60:
                hr += 1
                mn = 0
    if sg < 10 and mn < 10 and hr < 10:
        print(f"0{hr}:0{mn}:0{sg}")
    elif sg < 10 and mn >= 10 and hr < 10:
        print(f"0{hr}:{mn}:0{sg}")
    elif sg >= 10 and mn < 10 and hr < 10:
        print(f"0{hr}:0{mn}:{sg}")
    elif sg >= 10 and mn >= 10 and hr < 10:
        print(f"0{hr}:{mn}:{sg}")
    elif sg < 10 and mn >= 10 and hr < 10:
        print(f"0{hr}:{mn}:0{sg}")
    elif sg < 10 and mn >= 10 and hr >= 10:
        print(f"{hr}:{mn}:0{sg}")
    elif sg < 10 and mn < 10 and hr >= 10:
        print(f"{hr}:0{mn}:0{sg}")
    else:
        print(f"{hr}:{mn}:{sg}")
    time.sleep(1)
