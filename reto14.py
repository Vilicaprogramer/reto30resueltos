""" Hoy en clase, a Federico le han dicho que las flashcards son un buen método de estudio. Pero Federico no tiene 
nada para escribir en su casa. ¿Se te ocurre alguna forma para que pueda estudiar con el método mencionado?

Pues claro que sí, vas a crear un programa que:
Almacene las flashcards en una lista (pregunta, respuesta).
Permita al usuario añadir nuevas flashcards.
Muestra una pregunta aleatoria de la lista.
Solicite una respuesta del usuario.
Compare la respuesta del usuario con la correcta.
Indique si la respuesta es correcta o incorrecta.
Permita continuar practicando o salir.

Ejemplo:
------------------------
Anverso: La programación es…
Reverso: Darle una serie de instrucciones a una máquina para que ejecute una acción específica. """
from random import randint

flashcards_list = []

def menu():
    option = input("¿QUE QUIERES HACER? \n" \
                    "1 - Añadir una nueva flashcard \n" \
                    "2 - Mostrar una pregunta aleatoria de la lista \n" \
                    "3 - Salir \n"\
                    "Introduce el número de la opción del menú que quieres realizar: ")
    return option

while True:
    option = menu()
        
    if option == "1":
        nw_flascard = {}
        anverso = input("Escribe la pregunta: ")

        reverso = input("Escribe la respuesta: ")
        nw_flascard["anverso"] = anverso
        nw_flascard["reverso"] = reverso
        flashcards_list.append(nw_flascard)
    elif option == "2":
        alt = randint(0, len(flashcards_list) - 1)
        print(flashcards_list[alt]["anverso"])
        answer = input("¿Cual es la respuesta? => ")
        if answer == flashcards_list[alt]["reverso"]:
            print("La respuesta es correcta!!!")
        else:
            print("Lo siento sigue estudiando")
    elif option == "3":
        break
    else:
        print("Por favor introduce un número válido")