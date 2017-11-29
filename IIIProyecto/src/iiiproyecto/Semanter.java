package iiiproyecto;

import iiiproyecto.Registros_Semanticos.RS_DO;
import iiiproyecto.Registros_Semanticos.RS_Funcion;
import iiiproyecto.Registros_Semanticos.RS_IF;
import iiiproyecto.Registros_Semanticos.RS_Operador;
import iiiproyecto.Registros_Semanticos.RS_Parametro;
import iiiproyecto.Registros_Semanticos.RS_Variable;
import iiiproyecto.Registros_Semanticos.RS_While;
import java.util.ArrayList;

/**
 *
 * @author MaríaLaura
 */
public class Semanter {
    
    // TS= Tabla de Simbolos
    private final ArrayList<Object> TS;
    private final ArrayList<Object> PILA;
    
    public Semanter() {
        TS = new ArrayList();
        PILA = new ArrayList();
    }
    
    private void print(String msg){
        System.out.println("Semantic: " + msg);
    }
    
    //busca si existe la variable en la tabla de simbolos
    public boolean buscar_Var_TS(String token){
        //se busca el token en la tabla de simbolos
        
        for(int i = 0;i<TS.size();i++){
            //se verifica que sea de tipo variable
            if(TS.get(i) instanceof RS_Variable){
                RS_Variable aux =(RS_Variable)TS.get(i);
                //se evalua se se llaman igual
                if (aux.getNombre().equals(token)){
                    //se busca en la pila si se esta dentro de una funcion
                    for(int j = (PILA.size()-1);j>=0;j--){
                        
                        //Se verifica que sea de tipo RS_Funcion 
                        if(PILA.get(j) instanceof RS_Funcion ){
                            
                            RS_Funcion fun = (RS_Funcion)PILA.get(j);
                            
                            //se verifica que la variable sea de esa funcion o sea global
                            if(fun.getNombre().equals(aux.getAmbito())|| aux.getAmbito().equals("global")){
                                return true;
                            }
                            break;
                        }
                        else if(aux.getAmbito().equals("global")){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    //busca si existe la funcion en la tabla de simbolos
    public boolean buscar_Fun_TS(String token){
        for(int i = 0;i<TS.size();i++){
            //se verifica que sea de tipo funcion
            if(TS.get(i) instanceof RS_Funcion){
                RS_Funcion aux =(RS_Funcion)TS.get(i);
                //se evalua se se llaman igual
                if (aux.getNombre().equals(token)){
                    return true;
                }
            }
        }
        return false;
    }
    //se ejecuta cuando se lee una variable
    public void guardar_id(String token, boolean declaracion){
        print("guardar_id: " + token);
        /* 
            Guarda las variables en la pila
            token= nombre de la variable
            declaracion= se esta declarando? true=si / false=no
        */
        RS_DO id = new RS_DO();
        id.setTipo("direccion");
        id.setValor(token);
        //si no es una declaracion entra si no se ha definido la variable
        
        if(!declaracion && !buscar_Var_TS(id.getValor()))
            System.out.println("error, variable no definida"); // mensaje de error provisional
       
        PILA.add(id);
    }
    //se ejecuta cuando se lee un tipo ya sea de una declaracion/parametro/funcion
    public void guardar_tipo(String token){
        print("guardar_tipo: " + token);
        
        RS_DO tipo = new RS_DO();
        tipo.setTipo("tipo");
        tipo.setValor(token);
        
        PILA.add(tipo);
    }
  
    //se ejecuta cuando se lee un literal
    public void guardar_literal(String token){
        RS_DO literal = new RS_DO();
        literal.setTipo("literal");
        literal.setValor(token);
        
        PILA.add(literal);
    }
    
    //se ejecuta cuando se lee un operador
        public void guardar_operador(String token){
        RS_Operador operador = new RS_Operador();
        operador.setValor(token);
        PILA.add(operador);
    }
    
    //se ejecuta antes de llegar al "("  
    public void guardar_funcion(String token, boolean declaracion){
        print("guardar_funcion: " + token);
        RS_DO funcion = new RS_DO();
        funcion.setTipo("funcion");
        funcion.setValor(token);
       
        //se verifica que la funcion llamada exista
        if(!buscar_Fun_TS(token) && !declaracion)
            System.out.println("Error, funcion no definida");
        
        PILA.add(funcion);
    }
    
    //se ejecuta despues del ")" del llamado de una funcion
    public void evaluar_funcion(){
    //evalua si el llamado de la funcion es correcto
        String funcion_nombre ="";
        ArrayList <RS_DO> params = new ArrayList();
        RS_Funcion funcion = new RS_Funcion();
        
        for(int i = PILA.size()-1;i>=0;i--){
            if(PILA.get(i) instanceof RS_DO && ((RS_DO)PILA.get(i)).getTipo().equals("funcion")){
                funcion_nombre=((RS_DO)PILA.get(i)).getValor();
                PILA.remove(i);
                break;
            }
            else if(PILA.get(i) instanceof RS_DO){
                params.add((RS_DO)PILA.get(i));
                PILA.remove(i);
            }
        }
        for (int i =0; i<TS.size();i++){
            if(TS.get(i) instanceof RS_Funcion && ((RS_Funcion)TS.get(i)).getNombre().equals(funcion_nombre)){
                funcion=(RS_Funcion)TS.get(i);
                break;
            }
        }
        if(funcion.getParametros().size()!=params.size())
            System.out.println("Error, numero incorrecto de parametros");
        else
            for(int i = 0;i<params.size();i++){
                if(params.get(i).getTipo().equals("literal")){
                    if(isChar(params.get(i).getValor())){
                       if (!funcion.getParametros().get(i).getTipo().equals("char"))
                           System.out.println("Error, parametro"+ (params.size()-i) +"de tipo incorrecto");
                   }
                   else if(isInteger(params.get(i).getValor()) ){
                       if (!funcion.getParametros().get(i).getTipo().equals("int"))
                           System.out.println("Error, parametro"+ (params.size()-i) +"de tipo incorrecto");
                   }
                }
                else{//variable
                    if(buscar_Var_TS(params.get(i).getValor())){
                        for(int j = 0; j<TS.size();j++){
                            if(TS.get(j) instanceof RS_Variable && ((RS_Variable)TS.get(j)).){
                                
                            }
                        }
                    }
                }
                    }

    }
    
    
    /*
    Falta:
    -tipo de parametos -> a medias
    -llamado de una funcion
    -while
    -if
    -imprimir TS
    -toda la traduccion
    */
    
    //se ejecuta antes de la "," o el ")"
    public void guardar_parametros_id(String token){
        //agarra el ultimo elemento de la lista -> el tipo del parametro
        String tipo=((RS_DO)PILA.get(PILA.size()-1)).getValor();
        RS_Parametro param = new RS_Parametro(); //variable que se va a guardar en la pila
        
        //se hace POP del tipo del parametro
        PILA.remove(PILA.size()-1);
        
        param.setTipo(tipo);
        param.setNombre(token);
        
      
        PILA.add(param);
    }
    
    //se ejecuta antes de la "," o el ")" cuando se llama a una funcion
    public void guardar_parametros_literal(String token){ //**ME FALTA VERIFICAR EL TIPO DE LOS PARAMETROS
        RS_DO param = new RS_DO(); //variable que se va a guardar en la pila

        if(isChar(token)){
            param.setTipo("char");
        }
        else if(isInteger(token) ){
            param.setTipo("int");
        }
        else{//variable
            param.setTipo("direccion");
        }
        
      
        PILA.add(param);
    }
    
    //se ejecuta cuando se llega al ")" de una funcion
    public void declarar_funcion(){
        ArrayList<RS_Parametro> parametros = new ArrayList();
        String tipo="";
        String nombre="";
        RS_Funcion funcion = new RS_Funcion();
        RS_Variable param_aux = new RS_Variable();
        
        for(int i = PILA.size()-1; i>=0; i--){
             //se saca el nombre de la funcion de la pila
            if(PILA.get(i) instanceof RS_DO && ((RS_DO)PILA.get(i)).getTipo().equals("funcion")){
                RS_DO Funcion = (RS_DO)PILA.get(i);
                nombre=Funcion.getValor();
                PILA.remove(i);
                break;
            }
        }
        
        for(int i = PILA.size()-1; i>=0; i--){
            //se sacan los parametros de la pila y se agregan a la lista -> atributo de RS_Funcion
            if(PILA.get(i) instanceof RS_Parametro){
                //RS_Parametro param = new RS_Parametro();
                RS_Parametro param;
                param = (RS_Parametro)PILA.get(i);
                //se verifica que los parametros se llamen diferente
                for(int j = 0; parametros.get(i)!=null;i++){
                    if(parametros.get(i).getNombre().equals(param.getNombre())){
                        System.out.println("Error, parametro previamente definido");
                        break;
                    }
                    else if(j==0){
                        //se crea objeto variable para guardar en la tabla de simbolos
                        param_aux.setNombre(param.getNombre());
                        param_aux.setTipo(param.getTipo());
                        param_aux.setAmbito(nombre);
                        TS.add(param_aux);
                    }
                }
                parametros.add(param);
            }
            
            //se saca el tipo de la funcion de la pila
            else if(PILA.get(i) instanceof RS_DO){
                RS_DO Tipo = new RS_DO();
                tipo=Tipo.getValor();
                PILA.remove(i);  
                break;
            }
            PILA.remove(i);    
        }
        //Se crea objeto funcion con los datos sacados de la pila
        funcion.setNombre(nombre);
        funcion.setParametros(parametros);
        funcion.setTipo(tipo);
         
        //verifica que la funcion a declarar no exista
        if(buscar_Fun_TS(nombre))
            System.out.println("Error, funcion definida anteriormente");
        else
            TS.add(funcion);
        PILA.add(funcion);
        
    }
    //se ejecuta cuando se llega a "}"
    public void fin_funcion(){
        print("fin_funcion");
        PILA.remove(PILA.size()-1);
    }
    
    //se ejecuta cuanto se llega al ";" de una declaracion
    public void declarar_variables(){
        print("declarar_variables");
        
        String ambito = "global";
        String tipo="";
        
        for(int i=PILA.size()-1;i>=0;i--){
            //se verifica si se esta dentro de una funcion
            if(PILA.get(i) instanceof RS_Funcion){
                //se cambia el ambito por el nombre de la funcion
                ambito = ((RS_Funcion)PILA.get(i)).getNombre();
                break;
            }
        }
        
        //se recorre la pila para buscar el tipo
        for(int i=PILA.size()-1;i>=0;i--){
            //se busca el tipo int/char/float
            if(PILA.get(i) instanceof RS_DO && ((RS_DO)PILA.get(i)).getTipo().equals("tipo")){
                //se guarda el tipo de la declaracion
                tipo=((RS_DO)PILA.get(i)).getTipo();
                //se hace POP del tipo
                PILA.remove(i);
                break;
            }
        }
        
        for(int i=(PILA.size()-1);i>=0;i--){
            
            //se busca el nombre de la variable a definir
            if(PILA.get(i) instanceof RS_DO && ((RS_DO)PILA.get(i)).getTipo().equals("direccion")){
                
                //se verifica que la variable no exista en la tabla de simbolos
                if(!buscar_Var_TS(((RS_DO)PILA.get(i)).getValor())){
                    
                    RS_Variable var = new RS_Variable();
                    //se le asignan los valores a la variable para ser ingresada en la tabla de simbolos
                    var.setAmbito(ambito);
                    var.setNombre(((RS_DO)PILA.get(i)).getValor());
                    var.setTipo(tipo);
                    //se agrega la variable a la tabla de simbolos
                    TS.add(var);
                }
                else{
                    System.out.println("Error, variable "+((RS_DO)PILA.get(i)).getValor()+ " definida anteriormente");
                }
                //se hace POP de la variable
                PILA.remove(i);
            }
        }
        
        
    }
    //se llama luego del ";" del break
    public void guardar_break(String token){
        RS_DO Break = new RS_DO();
        Break.setTipo("break");
        Break.setValor(token);
        for(int i = PILA.size()-1;i>=0;i--){
            if(PILA.get(i) instanceof RS_While){
                break;
            }
            else if(PILA.get(i) instanceof RS_Funcion || i==0){
                System.out.println("Error, el break debe de ir dentro de un while");
            }
        }
        PILA.add(Break);
    }
    
    //se llama luego del ";" del continue
    public void guardar_continue(String token){
        RS_DO Continue = new RS_DO();
        Continue.setTipo("continue");
        Continue.setValor(token);
        for(int i = PILA.size()-1;i>=0;i--){
            if(PILA.get(i) instanceof RS_While){
                break;
            }
            else if(PILA.get(i) instanceof RS_Funcion || i==0){
                System.out.println("Error, el continue debe de ir dentro de un while");
            }
        }
        PILA.add(Continue);
    }
    
    
    //se llama luego de leer el "if"
    public void inicioIF(){
        RS_IF If = new RS_IF();
        PILA.add(If);
    }
    //se llama luego de leer el ")"
    public void evaluarIF(){}
    //se llama luego de leer el "else"
    public void inicioElse(){}
    //se llama luego de leer el "}"
    public void finIF(){
        PILA.remove(PILA.size()-1);
    }
    
    
    //se llama luego de leer el "while"
    public void inicioWhile(){
        RS_While While = new RS_While();
        PILA.add(While);
    }
    //se llama luego de leer el ")"
    public void evaluarWhile(){}
    //se llama luego de leer el "}"
    public void finWhile(){
        PILA.remove(PILA.size()-1);
    }
    
    //METODOS PARA EVALUAR EL TIPO DE LOS PARAMETROS
    public boolean isInteger(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
    }
    
    public boolean isChar(String cadena){
        if (String.valueOf(cadena.charAt(0)).equals("'") )
                return true;    
        return false;
    }    
}
