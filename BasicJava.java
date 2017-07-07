import java.util.ArrayList;


class BasicJava{
    public static void main(String[] args){
        for(int i = 1; i < 256; i++){
            System.out.println(i);
        }
    }
}


class BasicJava{
    public static void main(String[] args){
        for(int i = 1; i < 256; i++){
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}

class BasicJava{
    public static void main(String[] args){
        int sum = 0;
        for(int i = 0; i < 256; i++){
            sum = sum + i;
            System.out.println("New number:" + i + " Sum:" + sum);
        }
    }
}

class BasicJava{
    public static void main(String[] args){
        int[] newArray;
        newArray = new int[6];
        newArray[0] = 1;
        newArray[1] = 3;
        newArray[2] = 5;
        newArray[3] = 7;
        newArray[4] = 9;
        newArray[5] = 13;

        for(int i = 0; i < newArray.length; i++){
            System.out.println(newArray[i]);
        }

    }
}

class BasicJava{
    public static void main(String[] args){
        int[] newArray;
        newArray = new int[3];
        newArray[0] = -2;
        newArray[1] = -10;
        newArray[2] = -3;

        int max = newArray[0];

        for(int i = 0; i < newArray.length; i++){
            if( max < newArray[i]){
                max = newArray[i];
            }
        }
        System.out.println(max);
    }
}

class BasicJava{
    public static void main(String[] args){
        int[] newArray;
        newArray = new int[3];
        newArray[0] = 2;
        newArray[1] = 10;
        newArray[2] = 3;

        int sum = 0;
        for(int i = 0; i < newArray.length; i++){
            sum = sum + newArray[i];
        }
        double avg = sum / newArray.length;
        System.out.println(avg);
    }
}

class BasicJava{
    public static void main(String[] args){
        ArrayList <Integer> arrayY = new ArrayList<>();
        for(int i = 1; i <256; i++){
            if(i % 2 == 1){
                arrayY.add(i);
            }
        }
        System.out.println(arrayY);
    }
}

class BasicJava{
    public static void main(String[] args){
        int[]  myArray;
        myArray = new int[4];
        myArray[0] = 1;
        myArray[1] = 3;
        myArray[2] = 5;
        myArray[3] = 7;

        int y = 3;
        int counter = 0;

        for(int i = 0; i <myArray.length; i++){
            if(myArray[i] > y){
                counter = counter + 1;
            }
        }
        System.out.println(counter);
    }
}

class BasicJava{
    public static void main(String[] args){
    int[] arrayX = {1,5,10,-2};

    for(int i = 0; i < arrayX.length; i++){
        arrayX[i] = (int)Math.pow(arrayX[i],2);
    }
    for(int i = 0; i < arrayX.length; i++){
        System.out.println(arrayX[i]);
    }
    }
}

class BasicJava{
    public static void main(String[] args){
        int[] arrayX = {1,5,10,-2};

        for(int i = 0; i < arrayX.length; i++){
            if(arrayX[i] < 0){
                arrayX[i] = 0;
            }
        }
        for(int i = 0; i < arrayX.length; i++){
            System.out.println(arrayX[i]);   
        }
    }
}


class BasicJava{
    public static void main(String[] args){
        int[] arrayX = {1,5,10,7,-2};

        for(int i = 0; i < arrayX.length-1; i++){
            arrayX[i] = arrayX[i + 1];
        }
        arrayX[arrayX.length-1] = 0;
        for(int i = 0; i<arrayX.length; i++){
            System.out.println(arrayX[i]);
        }
    }
}





