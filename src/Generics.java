import java.util.Arrays;
public class Generics<T> {
    private T arr[];
    private T temp;
    private T inverseArr[];
    public Generics(T arr[]) {
        this.arr = arr;
        this.inverseArr = Arrays.copyOf(arr, arr.length);
    }
    public String toString(T arr[],int number) {
        return "" + arr[number];
    }


    public void keyValue(){
        for(int i = 0; i < arr.length; i++){
            System.out.println(i + " = " + toString(arr,i));
        }
    }

    public void swap(){
        temp = arr[arr.length-1];
        arr[arr.length-1] = arr[0];
        arr[0] = temp;
        for(int i = 0; i < arr.length; i++){
            System.out.print(toString(arr,i));
        }
        System.out.println();
        temp = arr[arr.length-1];
        arr[arr.length-1] = arr[0];
        arr[0] = temp;
    }

    public void inverse(){
        int c = 0;
        for(int i = arr.length-1; i >= 0; i--){
            inverseArr[c] = arr[i];
            c++;
        }
        for(int i = 0; i < inverseArr.length; i++){
            System.out.print(toString(inverseArr,i));
        }
        System.out.println();
    }

    public static void main(String[] args){
        String[] mas = {"1","2","3","4","5"};
        for(int i = 0; i < mas.length; i++){
            System.out.print(mas[i]);
        }
        System.out.println();
        Generics<String> gen = new Generics<>(mas);
        gen.keyValue();
        gen.swap();
        gen.inverse();
    }
}
