""" 📌 10. RETO 30 DÍAS ABRIL: DIA 10 | COOKIES SUPER RICAS S.A-----------------------------------------
Una tienda de galletas artesanales vende al por mayor en su página web. Cada caja de galletas cuesta 6€. Solicita 
la cantidad de cajas de galletas en cada venta y dependiendo de la cantidad introducida se realizan los siguientes 
pasos:
Si la cantidad de cajas de galletas vendidas es menor a 5: no se permiten compras inferiores a 5 cajas de galletas.
Si la cantidad de cajas de galletas es mayor o igual a 5, pero menor a 15: los gastos de envío son de 10€.
Si la cantidad de cajas de galletas es mayor a 15: El envío es gratuito.

Promociones:
Si el precio total es inferior a 120€ no hay promociones.
Si el precio total supera los 120€ pero es menor a 250€: Tiene un descuento del 5%.
Si el precio total supera los 250€: Tiene un descuento del 10%.

Muestra al cliente un mensaje por pantalla según la cantidad de cajas de galletas que quiera comprar:
Número total de cajas a comprar.
Total € de la compra.
Gastos de envío (si los tiene o si es gratuito)
Descuento por compra (Indicar al cliente cuántos € falta para entrar en una promoción si la compra es <100€ o el 
importe de descuento generado si es superior) """

nm_cajas = input("Introduce el número de cajas que quieres comprar: ")
envio = 0

def promociones (nm_cajas, envio):
    precio_total = int(nm_cajas) * 6
    if precio_total >= 120 and precio_total < 250:
        precio_total = (precio_total * 0.95) + envio
        return precio_total
    elif precio_total >= 250:
        precio_total = (precio_total * 0.90) + envio
        return precio_total
    else:
        return precio_total
    

def proxima_promocion(total):
    if total < 120:
        promo = 120 - total
        return f"Te faltan {promo:.2f}€ para llegar a una promoción del 5% de descuento"
    elif total < 250:
        promo = 250 - total
        return f"Te faltan {promo:.2f}€ para llegar a una promoción del 10% de descuento"
    else:
        return "Tienes el máximo de promociones"
    

while True:
    if not nm_cajas.isnumeric():
        nm_cajas = input("Tipo de dato incorrecto, intentalo de nuevo: ")
    elif int(nm_cajas) < 5:
        nm_cajas = input("No se permiten compras inferiores a 5 cajas de galletas, pide más o pon Exit para salir: ")
        if nm_cajas == "Exit":
            break
    elif int(nm_cajas) >= 5 and int(nm_cajas) < 15:
        envio = 10
        print(f"Número total de cajas a comprar: {nm_cajas}\n"
              f"Gastos de envío: {envio}€\n"
              f"Total de la compra: {(promociones(int(nm_cajas), envio)):.2f}€\n"
              f"{proxima_promocion(promociones(int(nm_cajas), envio))}")
        break
    else:
        print(f"Número total de cajas a comprar: {nm_cajas}\n"
              f"Gastos de envío: {envio}€\n"
              f"Total de la compra: {promociones(int(nm_cajas), envio):.2f}€\n"
              f"{proxima_promocion(promociones(int(nm_cajas), envio))}")
        break