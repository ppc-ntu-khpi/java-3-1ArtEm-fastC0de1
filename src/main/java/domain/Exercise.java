package domain;

public class Exercise {
    public String Calculate(int[] arr, int size){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < size; ++i){
            if (isPrime(arr[i])){
                result.append(arr[i]).append(" | ");
            }
        }
        return result.toString();
    }
    public boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
    return true;
    }
}
