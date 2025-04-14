""" Pide al usuario que introduzca varios números enteros (uno por uno, y que indique "fin" para terminar). 
El programa debe verificar si cada número introducido es un "número de la suerte". 
Se considera un número de la suerte si es múltiplo de 7 (el resto de la división entre 7 es 0).
Por cada número de la suerte encontrado, el programa imprimirá "¡[número] es un número de la suerte!".
Al final, mostrará cuántos números de la suerte se encontraron en total.

Pista: No olvides usar el try/catch 🙂 """
nm = input("Introduce un número: ")
while nm.lower() != "fin":
    try:     
        if int(nm)%7 == 0:
            print(f"¡{nm} es un número de la suerte!")
        else:
            print(f"¡{nm} NO es un número de la suerte!")
        nm = input("Introduce un número: ")
    except:
        print("Vaya lo que has introducido no es un número")
        nm = input("Introduce un número: ")
