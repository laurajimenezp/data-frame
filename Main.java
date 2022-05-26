import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola Bienvenid@s al programa /n /ln Las funciones son: /n 1: Acceder a los datos. /n 2. Filtrar datos. /n 3. Usar funciones estadísticas. /n 4. Editar datos.  " +
                "");

        int numero = scanner.nextInt();

        switch (numero){

            case 1:
                System.out.println();
                ;break;

            case 2:
                System.out.println("Elija la columna a la que desea filtrar /n 1: PRCP /n 2: TAVG /n 3: TMAX /n 4: TMIN" );
                int columna = scanner.nextInt();

                System.out.println("Elija entre las funciones /n < : Menor que /n >: Mayor que" );
                String operator = scanner.next();

                if(operator.equals("<")) {
                    System.out.println("Datos menor que: " ); double value= scanner.nextDouble();}

                else{System.out.println("Datos mayor que: " ); double value = scanner.nextDouble();}

                filtrar( String operator, int columna);


                break;

            case 3:
                System.out.println("Elija entre las funciones estadisticas de: /n 1: Promedio /n 2: Desviacion estandar" );
                System.out.println("Elija la columna a la que desea filtrar /n 1: PRCP /n 2: TAVG /n 3: TMAX /n 4: TMIN" );
                int esta = scanner.nextInt();
                int column = scanner.nextInt();


                ;break;
            case 4:


                ;break;


        }



    }

    public static void filtrar(String operator , int columna){
        if(operator.equals("<")){
            switch(columna){
                case 1: ;break;
                case 2: ;break;
                case 3: ;break;
                case 4: ;break;
            }
        }

    }
    public static void estadistica (int esta, int columna ){

    }



}
