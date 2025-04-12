'''Reto 5 abril - ¡Exclamaciones
Enunciado
Jordi nunca se acuerda de abrir las exclamaciones. Él dice que es porque en catalán no se abren las 
exclamaciones, pero yo creo que simplemente no sabe escribir. Vamos a crear un programa que asegure que 
hay tantos abrir exclamación (¡) como cerrar exclamación (!) para flamearlo.

Ejemplo
Entrada

¡¡¡Caramba!!! Hola!

Salida

Si No'''
frase= input('Introduce la frase: ')

for i in frase.split():
    if (i[-1] == '!') & (i[0] == '¡'):
        print('Si', end= ' ')
    elif (i[-1] == '!') & (i[0] != '¡'):
        print('No', end= ' ')
    else:
        print('No necesario', end= ' ')