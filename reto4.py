'''Reto 4 abril - Boom
Enunciado
Como dice la señora del famoso meme (link), un día estalló la guerra. Haz un programa que, dado un número 
que se pasa por entrada, haga una cuenta atrás y acabe con un ¡BOOM!.

Ejemplo
Entrada

5

Salida

5 4 3 2 1 ¡BOOM!'''

import time

nm = int(input("Introduce un número para iniciar la cuenta atrás: "))
for i in range(nm,0,-1):
    print(nm)
    nm -= 1
    time.sleep(1)

print('BOOM!!!') 