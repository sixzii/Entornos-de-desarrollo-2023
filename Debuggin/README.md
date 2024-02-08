Nos presentan un código, que, aparentemente funciona, y así es, porque el IDE no muestra de que haya algún error de sintaxis.

El programa no hace la función que se le pide, que es: pedir al usuario un número, para crear un array de dicho tamaño,
que posteriormente se rellena con números aleatorios y luego se muestran dichos números. Presenta un error en el que se crea el array,
pero solo muestra tantos 0 como tamaño del array (número introducido por el usuario).

Para solucionarlo, utilizamos la función Debuggin, creando puntos de ruptura (breakpoints) en las líneas que queramos, para ir viendo qué ocurre y poder detectar
el fallo.

El fallo está en la función "Math.random()" genera un número de punto flotante entre 0.0 y 1.0 (exclusive). Al convertirlo a un entero usando (int), 
se pierde la parte decimal, lo que significa que siempre se generará el mismo número aleatorio (0) para cada elemento de la matriz.ç

El código correcto es: num_aleat[i]=(int)(Math.random()*100);
