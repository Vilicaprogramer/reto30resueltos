""" Resulta que nos piden que programemos un validador de contraseñas. Algo fácil para los alumnos de Prometeo. 
Solo tenemos que decir si, una contraseña introducida por terminal es válida o no. 
Para que una contraseña sea válida debe:
Tener al menos 8 caracteres.
Tener al menos una letra minúscula.
Tener al menos una letra mayúscula.
Tener al menos un número.
Tener al menos un símbolo especial  de entre los siguientes *, ?, !, ^, “, $.
No contener la palabra GIT, en ningún formato (ni GIT, ni git, ni gIt, ni giT, ni Git, ni GIt, ni gIT, ni GiT). 
Odiamos Git. """

while True:
    minusculas = False
    mayusculas = False
    numero = False
    simbolo = False
    simbolo_especial = ["*", "?", "!", "^", '“', "$"]
    password = input("Introduce tu contraseña: ")
    if len(password) < 8:
        print("La contraseña debe tener al menos 8 caracteres")
    else:
        for i in password:
            if i.islower():
                minusculas = True
            elif i.isupper():
                mayusculas = True
            elif i.isnumeric():
                numero = True
            elif i in simbolo_especial:
                simbolo = True
        
        if minusculas == False:
            print("La contraseña debe tener al menos una letra minuscula")
        elif mayusculas == False:
            print("La contraseña debe tener al menos una letra mayuscula")
        elif numero == False:
            print("La contraseña debe tener al menos un número")
        elif simbolo == False:
            print("La contraseña debe tener al menos uno de estos simbolos especiales *, ?, !, ^, “, $.")
        elif "git" in password.lower():
            print("La contraseña no puede contener la git en ninguno de sus formatos")
        else:
            break