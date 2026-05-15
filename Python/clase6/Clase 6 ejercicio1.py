# primero hacemos ingresar los valores al usuario
a = float(input("Ingrese el valor de a: "))
b = float(input("Ingrese el valor de b: "))
c = float(input("Ingrese el valor de c: "))

# ahora los juntamos para obtener el resultado
resultado = (a**3 * (b**2 - 2*a*c)) / (2*b)

# imprimos en pantalla el resultado que obtenemos
print("El resultado es:", resultado)