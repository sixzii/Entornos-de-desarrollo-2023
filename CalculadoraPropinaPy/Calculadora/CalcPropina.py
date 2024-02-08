'''
Created on 31 ene 2024

@author: Guillermo Díaz Pérez
'''
# Calculadora de propina

# Pedir al usuario el total de la cuenta
total_cuenta = float(input("Ingrese el total de la cuenta: "))

# Pedir al usuario el porcentaje de propina
porcentaje_propina = float(input("Ingrese el porcentaje de propina que desea dejar: "))

# Calcular la cantidad de la propina
propina = total_cuenta * (porcentaje_propina / 100)

# Calcular el total a pagar
total_pagar = total_cuenta + propina

# Mostrar el resultado al usuario
print("-------------------------------------")
print("Total de la cuenta:", total_cuenta, "€")
print("Propina:", propina, "€")
print("Total a pagar:", total_pagar, "€")
print("-------------------------------------")