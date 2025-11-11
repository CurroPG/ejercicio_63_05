public class App {
    public static void main(String[] args) throws Exception {
        int altura1 = Integer.parseInt(System.console().readLine("Introduzca la altura de la primera pirámide: "));
        int altura2 = Integer.parseInt(System.console().readLine("Introduzca la altura de la segunda pirámide: "));
        int base = 0;
        int espacios1 = altura1 - 1;
        int espacios2 = altura2 - 1;
        int linea1 = 1;
        int linea2 = 1;
        int alturaMayor = Math.max(altura1, altura2);
        int alturaDif = 0;

        while(base < alturaMayor){
            if(altura1 > altura2){
                alturaDif = altura1 - altura2;
                for(int i = 0; i < espacios1; i++){
                    System.out.print(" ");
                }
                for(int i = 0; i < linea1; i++){
                    System.out.print("*");
                }
                if(alturaDif <= base){
                    for(int i = 0; i <= espacios1; i++){
                        System.out.print(" ");
                    }
                    for(int i = 0; i < espacios2; i++){
                        System.out.print(" ");
                    }
                    for(int i = 0; i < linea2; i++){
                        System.out.print("*");
                    }
                    linea2 += 2;
                    espacios2--;
                }
                System.out.println();
                base++;
                espacios1--;
                linea1 += 2;
            }
            if(altura1 < altura2){
                alturaDif = altura2 - altura1;
                if(alturaDif <= base){
                    for(int i = 0; i < espacios2; i++){
                        System.out.print(" ");
                    }
                    for(int i = 0; i < linea2; i++){
                        System.out.print("*");
                    }
                    linea2 += 2;
                    espacios2--;
                }
                if(alturaDif > base){
                    for(int i = 0; i <= (espacios1+(altura2 * 2 - 1)) ; i++){
                        System.out.print(" ");
                    }
                    for(int i = 0; i < linea1; i++){
                        System.out.print("*");
                    }
                }else{
                    for(int i = 0; i <= ((espacios1+(altura2 * 2)) - espacios2 - linea2) ; i++){
                        System.out.print(" ");
                    }
                    for(int i = 0; i < linea1; i++){
                        System.out.print("*");
                    }
                }
                System.out.println();
                base++;
                espacios1--;
                linea1 += 2;
            }
        }
    }
}
