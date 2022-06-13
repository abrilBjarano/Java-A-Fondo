# <center> Let's start coding </center>

## Introduction

* The sentences end with " _;_ ".

    ``` 
    System.out.println("Hola Mundo !!!");
    ```

<br>

* The Scanner class allows to read data through the keyboard.

<br>

* We can define variables anywhere in the code by indicating the data type and its name.



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

* __Cast:__ convert a type of data into another.

    ```
    // (cast data type) variable to be casted
    c = (char) i;
    ````

<br>

* In the example

    ```
    nro=(int)(Math.random()*1000);
    ````
    We can see _Math.random()_ which is a class and .random() its method.
    This class generates a random number between 0 and 1.

<br>

* Java support in-line comments ( _//_ ) and multi-line comments ( _/* */_ ).

    ```
    // esto es una linea de codigo comentada

    /*
    Estas son varias
    lineas de codigo
    comentadas
    */
    ```

<br>

* Java has the _Garbage Collector_. The programmer doesn't have the responsability of free the memory.

<br>

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

<br>

## Data types

* The unsigned modifier doesn't exist in Java.

<br>

* Java doesn't accept " _int_ " as a boolean variable. " _int_ " doesn't have true value.

<br>

## Dimensional arrays

An array is a set of same type variables whose memory directions are contiguous and always start from 0.

    ```
    int arr[] = new int[10];
    ```

* Also we can build an _n_ elements array:

    ```
    int n = 10;
    int arr[] = new int[n];
    ```

<br>

* Correct and equal ways to define arrays:
    
    ```
    String arr[];
    String []arr;
    String[] arr;
    ````
    
    Create an String array:
    
    ```
    String beatles[] = { "John", "Paul", "George", "Ringo" };
    ```
<br>

* __An array is static__. Once the size is definied, you can't add or remove elements in it. To access an array element, we access it trough a subindex
    
    ```
    arr[5] = 123;
    ```

<br>

* Arrays are objects and its _length_ atribute measures its length

    ```
    String beatles[] = { "John", "Paul", "George", "Ringo" };

    // is finna print "4"
    System.out.println(beatles.length);
    ```
<br>

## Bidimensional arrays

Also called matrix, is a two dimensional array.

* How to create a matrix:

    ```
    int mat[][] = { {3, 2, 1 }
                   ,{5, 3, 7 }
                   ,{1, 9, 2 }
                   ,{4, 6, 5 } };
    ```
* How to measure its length:

    ```
    int [][]mat = new int[5][3];
    int filas = mat.length; // cantidad de filas
    int colums = mat[0].length; // cantidad de columnas
    ```
<br>

## Characters

The characters are integer number values, unlike the Strings which are objects.

* Characters are represented by ' ' and strings by " ".

    _'A'_ is actually a numeric value (65, ASCII code). And _"A"_ is a single character string.

<br>

* _char_ can't store negative values or values greater than 2^16-1.