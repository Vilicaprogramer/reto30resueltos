'''Reto 7 abril - Carrera de caracoles cibernéticos
Enunciado
Imagina una emocionante carrera entre caracoles cibernéticos. Cada caracol tiene una velocidad 
aleatoria entre 1 y 5 (¡qué emoción!).

Escribe un programa que simule una carrera de 20 "pasos" entre dos caracoles.
En cada paso, la posición de cada caracol aumenta según su velocidad.
Al final, ¡declara al caracol ganador (o si hay un emocionante empate)!'''

import random
import time
import os

puntos_caracol1, puntos_caracol2 = 0, 0
bl = True     
print('COMIENZA LA CARRERA!!')
for i in range(3, 0, -1):
    print(i)
    time.sleep(1)
os.system('cls' if os.name == 'nt' else 'clear')
print(f'El caracol 1')
print('C1')
print(f'El caracol 2')
print('C2')
time.sleep(2)

while bl == True:
    if puntos_caracol1 < 20 and puntos_caracol2 < 20:
        os.system('cls' if os.name == 'nt' else 'clear')
        caracol1 = random.randint(1, 5)
        caracol2 = random.randint(1, 5)
        puntos_caracol1 = puntos_caracol1 + caracol1
        puntos_caracol2 = puntos_caracol2 + caracol2
        print(f'El caracol 1 suma {caracol1} y lleva {puntos_caracol1} puntos')
        print(f'{"=="*puntos_caracol1}C1')
        print(f'El caracol 2 suma {caracol2} y lleva {puntos_caracol2} puntos')
        print(f'{"=="*puntos_caracol2}C2')
        time.sleep(2)
    else:
        bl = False

if puntos_caracol1 == puntos_caracol2:
    print('Los caracoles han quedado empate!!!')
elif puntos_caracol1 > puntos_caracol2:
    print('El Caracol 1 es el Vencedor!!!')
else:
    print('El Caracol 2 es el Vencedor!!!')
    