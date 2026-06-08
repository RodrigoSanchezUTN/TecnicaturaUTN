var nombre = 'Jose';
var apellido = ' Montes';
var nombreCompleto = nombre + apellido; // Primera Concatenación
console.log(nombreCompleto);
var nombreCompleto2 = 'Ariel' + ' ' + 'Betancud'; //Segunda Concatenación
console.log(nombreCompleto2);
var juntos = nombre + 219; //Lee de izq a der siguiendo la cadena lee el
console.log(juntos);
juntos = nombre + 78 + 17; //Aquí se puede diferenciar a través  de los
console.log(juntos);
juntos = 78 + 17 + nombre;
console.log(juntos);

nombre += apellido; //Tercera Concatenación usando el operador simplific
console.log(nombre);

// Hoy ya no se usa var, se utiliza let y const
let nombre2 = "Pedro";
console.log(nombre2);

const apellido2 = "Lepes";
//apellido2 = "Peres"; una constante no puede ser modificada
console.log(apellido2)