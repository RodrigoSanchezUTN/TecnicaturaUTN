print("digite los siguientes datos del libro")
nombre = input("digite el nombre del  libro: ")
id = int(input("digite el id del libro: "))
precio = float(input("digite el precio del libro: "))
envioGratuito = input("Indicar si  el envio del libro es gratuito (True/False): ")
if envioGratuito == "True":
    envioGratuito = True
elif envioGratuito == "False":
    envioGratuito = False
else:
    envioGratuito = "el valor es incorrecto, debe escribir True/False"
print(f'''
    nombre: {nombre}
    id: {id}
    precio: {precio}
    envioGratuito?: {envioGratuito}
''')