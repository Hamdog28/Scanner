//Esta es una prueba para verificar las estructuras de control

//if-else, while, for




int x;                         




int funcion1(){

        

if () {} else {}  //deberia dar error, pues debe haber una expresion
        

if (x==2) {x= a+b;} else {x--;}  //deberia aceptarlo sin error
        

if if (X< 3) {;} else {;} //deberia dar error por doble if
        

if (y>=0) {x= a+b; }else {x--; }else {x;} //deberia dar error por doble uso de else
        

if x==3 {x= a+b;} else {x--;} //deberia dar error por expresion fuera de parentesis
       

if (x==4){                  //deberia aceptar if anidados y cualquier tipo de expresion dentro de ( )
                
	if (x<= 7){
					
		x= a+b;
				
	}
                
	else {
					
		x--;
				
	}
		
}else
 { 
			
	x;
		
}

        


for ( ) {}  //deberia dar error pues no hay expresiones en parentesis

       

for (x=0; ) {} //error pues hay solamente una expresion
        

for (x,y,z)  {}  //error pues estan separados solamente por comas

        

for  {
}   //deberia dar error
        

for (x=1;x<2;x++){
		

	x= a+b; 
	break;

}

        



while {}  //debe dar error
        

while ( ){}  //debe dar error
        

while (;){}  //debe dar error
        

while (x != 1) {x= a+b;}  // aceptarlo correctamente
        

while ((!f)||(x<2)) { 

	x= a+b; 
	x--; 
	continue; 
	break;}  //aceptarlo correctamente, el continue y el break
        


}
 // el del fin de la funcion
