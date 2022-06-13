# <center> Let's start coding </center>
---


## Introduction <br>

* The sentences end with ";".

    ``` System.out.println("Hola Mundo !!!");```

<br>

* The Scanner class allows to read data throught the keyboard.

<br>

* We can define variables anywhere in the code by indicating the data type y its name.

    - Valid names:

    ``` 
    fecha
    iFecha
    fechaNacimiento
    fecha_nacimiento
    fecha3
    _fecha 
    ```
    - Invalid names:

    ```
    3fecha
    fecha-nacimiento
    fecha+nacimiento
    -fecha
    ```

<br>

* Java support in-line comments (//) and multi-line comments (/* */).

    ```
    // esto es una linea de codigo comentada

    /*
    Estas son varias
    lineas de codigo
    comentadas
    */
    ```

<br>

* Java has the Garbage Collector. The programmer doesn't have the responsability of free the memory.


## Loop statements <br>

Java has three loop statements.

1. while:
    While is only executed if the condition is met.
    ```
    while( condicion ) {
        accion1;
        accion2;
        :
    }
    ```

2. do-while:
    The actions within do-while are executed at least once, even if the conditions isn't met.
    ```
    do {
        accion1;
        accion2;
        :
    } while( condicion );
    ```

3. for:
    ```
    for( inicializacion; condicion; incremento ) {
        accion1;
        accion2;
        :
    }
    ```


## Data types

* The unsigned modifier doesn't exist in Java.

<br>

* Java doesn't accept "int" as a boolean variable. "int" doesn't have true value.


## Arrays

* An array is a set of same type variables whose memory directions are contiguous and always start from 0.

