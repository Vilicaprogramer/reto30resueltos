''' Reto 6 abril - Cajero del Mercadona
Enunciado
Juan está trabajando en un mercadona en el que no hay cajero automático, él siempre calcula el cambio de los 
clientes de cabeza. ¿Se te ocurre alguna forma de hacerle la vida más sencilla al pobre chaval?

Crea un programa que: Reciba la cantidad de dinero (double) que el usuario ha entregado para pagar.

Compare la cantidad entregada con el precio del producto y calcule la diferencia.

Súmale el IVA porque esto es españa, redondeado a dos décimas (+21%)

Devuelva el valor utilizando la menor cantidad de billetes y monedas posibles siendo estos billete de 500 €,
billete de 200 €, billete de 100 €, billete de 50 €, billete de 20 €, billete de 10 €, billete de 5 €, 
moneda de 2 €, moneda de 1 €, moneda de 50 cnts, moneda de 20 cnts, moneda de 10 cnts, moneda de 2 cnts y 
moneda de 1 cnt.

Pero cuidado, si un cliente intenta pagar con menos dinero del necesario… ¡tendrás que avisarle antes de 
que se lleve el producto gratis! '''

pago = int(input("Cuanto me vas a pagar? "))
precio_producto = float(input("Que precio tiene el producto? "))

def hay_que_dar_cambio (pago, precio_producto):
    precio_producto = precio_producto * 1.21
    vueltas = pago - precio_producto
    if vueltas < 0:
        return "Falta dinero"
    elif vueltas == 0:
        return "Ahi tiene su pedido grácias y vuelva pronto"
    else:
        return round(vueltas, 2)

def caja(cambio):
    billetes_monedas_a_dar = "Tienes que darle al cliente "
    moneda=[500,200,100,50,20,10,5,2,1,0.5,0.2,0.1,0.02,0.01]
    for i in moneda:
        if (cambio >= i) & (i >= 5):
            billete = f"un billete de {i}, "
            billetes_monedas_a_dar= billetes_monedas_a_dar + billete
            cambio = cambio - i
        elif (cambio >= i) & (i < 5):
            moneda = f"una moneda de {i}, "
            billetes_monedas_a_dar= billetes_monedas_a_dar + moneda
            cambio = cambio - i
        else:
            continue
        
    return billetes_monedas_a_dar

cambio = hay_que_dar_cambio(pago, precio_producto)   
print(f"El cambio es {cambio}€")
if isinstance(cambio, float):
    print(caja(cambio)) 


