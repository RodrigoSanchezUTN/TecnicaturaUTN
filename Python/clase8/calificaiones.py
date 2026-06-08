suma = 0
calificacion_baja = 99999

for i in range(10):
    print(i + 1, ". Digite una calificación:")
    calificacion = float(input())

    suma += calificacion

    if calificacion < calificacion_baja:
        calificacion_baja = calificacion

calificacion_promedio = suma / 10

print("La calificación promedio es:", calificacion_promedio)
print("La calificación más baja es:", calificacion_baja)