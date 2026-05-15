import math

# ingresamos el radio
radio = float(input("Ingrese el radio del círculo: "))

# calculamos área y longitud
area = math.pi * radio ** 2
longitud = 2 * math.pi * radio

# mostramos los resultados
print("Área del círculo:", area)
print("Longitud de la circunferencia:", longitud)