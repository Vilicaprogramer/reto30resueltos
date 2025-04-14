""" El programa elige una palabra secreta (por ejemplo, "programar"). El usuario tiene 5 intentos para adivinar la 
palabra. En cada intento, el programa compara la palabra introducida por el usuario con la palabra secreta. 
Si son iguales, muestra un mensaje de felicitación y termina.
Si no son iguales, indica cuántos intentos le quedan.
Si se agotan los intentos sin adivinar, muestra la palabra secreta y un mensaje de "¡Game Over!". """

import random

palabras = ["Algoritmo","Variable","Función","Condicional","Bucle","Clase","Objeto","Compilador","Sintaxis","Depuración",
  "Código","Script","Parámetro","Retorno","Array","Iteración","Herencia","Interfaz","Framework","Repositorio"]
rdm = random.randint(0,19)
palabra_oculta = palabras[rdm]
palabra_usuario = input("Introduce tu predicción: ")
count = 1

while count < 5:
    if palabra_oculta != palabra_usuario:
        palabra_usuario = input(f"Vuelvelo a intentar te quedan {5 - count} intentos: ")
        count += 1
    else:
        break

if count == 5:
    print("GAME OVER")
else:
    print("¡¡¡FELICIDADES LO CONSEGUISTE!!!")
    print(count)