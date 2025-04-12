"""Reto 8 abril - El Robot de Saludos Personalizados
Enunciado
Escribe un programa que le pregunte al usuario su nombre. Si el nombre comienza con la letra "A" 
(mayúscula o minúscula), el robot responderá con un saludo entusiasta como: ¡Hola, Asombroso/a 
"Nombre"!. Si el nombre tiene más de 7 letras, el robot dirá: ¡Vaya, "Nombre", ¡qué nombre tan 
largo y sofisticado!. Para cualquier otro nombre, el robot simplemente dirá: Saludos, "Nombre".

¡Prepara al robot para todo tipo de nombres! Como un saludo especial a un nombre que empiece por 
A y tenga 7 letras, o que cuente un chiste si saluda a Jaimito..."""

nm = input('Introduce tu nombre: ')

if (nm[0].lower() == 'a') and (len(nm) > 7):
    print(f'¡Vaya, Asombroso/a {nm}! ¡qué nombre tan largo y sofisticado!')
elif len(nm) > 7:
    print(f'¡Vaya, {nm}, ¡qué nombre tan largo y sofisticado!')
elif nm[0].lower() == 'a':
    print(f'¡Hola, Asombroso/a {nm}!')
elif nm == 'Jaimito':
    print('Si un carnívoro muere, entonces se reencarna. \n ' \
    'Si un vegetariano muere, ¿Entonces se reenverdura?')
else:
    print(f'Saludos, {nm}')