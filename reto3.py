'''Reto 3 abril - El tiempo
Enunciado
Crear dos variables utilizando los objetos fecha.

En la primera se representa la fecha (día, mes, año) actual.
En la segunda se representa la fecha de nacimiento.
Calcular cuántos años han transcurrido entre ambas fechas y muestra su resultado de maneras diferentes Día, mes y año. Hora, minuto y segundo. Día de año. Día de la semana. Nombre del mes.

Pistas: buscar sobre el paquete java.time para para fechas y horas.'''

from datetime import datetime, date, time

fecha_hoy = date.today()
fecha = input("Introduce una fecha en formato AAAA-MM-DD:")
fecha = date(int(fecha.split('-')[0]), int(fecha.split('-')[1]), int(fecha.split('-')[2]))
tiempo_transcurrido = fecha_hoy - fecha

year = tiempo_transcurrido.days/365
if (tiempo_transcurrido.days%365) >= 30:
    month = (tiempo_transcurrido.days%365)/30
    days = (tiempo_transcurrido.days%365)%30
elif (tiempo_transcurrido.days%365 <= 30) & (tiempo_transcurrido.days%365 > 0):
    days = tiempo_transcurrido.days%365
else:
    days = 0

print(f'Han pasado {round(year)} años, {round(month)} meses y {days} días')
print(format(fecha, '%d de %B de %Y'))
print(f'Son las {datetime.now().hour}:{datetime.now().minute}')
print(f'Han pasado {fecha_hoy-date(2025,1,1)}')
print(f'Hoy es {fecha_hoy.strftime('%A')}')
print(f'El mes es {fecha_hoy.strftime('%B')}') 