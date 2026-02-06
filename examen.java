public static void multiplos(int numerosMax){

    for (int i=0;i<=numerosMax;i++){
        if(i%7==0){
            System.out.println("Múltiplo de 7:" +i);
        }
        if(i%49==0){
            System.out.println("Múltiplo de 49:" +i);
        }
        else if(i%100==0){
            System.out.println("Múltiplo de 100:" +i);
        }
    }
}
System.out.println("Hola mundo");