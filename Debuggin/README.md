- Nos presentan un código escrito en Java, que, aparentemente funciona, y así es, porque el IDE a primera vista no muestra de que haya algún error de sintaxis como se puede apreciar en la captura 01.

- El programa no hace la función que se le pide, que es: pedir al usuario un número, para crear un array de dicho tamaño,
que posteriormente se rellena con números aleatorios comprendidos entre 0 y 100 para luego mostrar dichos números. Presenta un error en el que se crea el array, pero solo muestra tantos 0 como tamaño del array (número introducido por el usuario) como se puede ver en la captura 02.

- Para buscar el error, utilizamos la función Debuggin, creando puntos de ruptura (breakpoints) en las líneas que queramos, para ir viendo qué ocurre y poder detectar
el fallo. En este caso, los breakpoints en las líneas que creemos que está fallando el código (normalmente suelen ser en bucles). Como se puede ver en la captura 03, los breakpoints están en las líneas 10, 11, 13 y 14.

- Para empezar el proceso, hacemos click en el botón que tiene forma de "bicho" (captura 04) y se ejecutará el programa hasta pararse en el primer breakpoint (línea 10) captura 05.

- En la captura 06, podemos ver que se ejecuta hasta crear un array de tamaño 5, introducido por el usuario (elementos = 5). Pulsando F6 vamos avanzando en el código paso a paso, mientras vemos en la parte de la derecha de nuestro IDE (en este caso Eclipse) captura 07, como el valor de "i" equivale 0 (posición inicial del array).

- Captura 08 verificamos de que se crea el número aleatorio, pero es decimal (entre 0 y 1) de manera correcta.

- Así hasta que en la captura 11 podemos ver que el primer número aleatorio (elem) vale 0 y en la captura 12 se muestra en consola un 0.

- Captura 13 se arregla el código y se escriben los comentarios explicando el fallo del mismo.

- En las capturas 14, 15 y 16 podemos aprecias como finalmente se vuelve a ejecutar el código y esta vez si se muestran los números aleatorios entre 0 y 100.

El código correcto es: num_aleat[i]=(int)(Math.random()*100);
