// half-pyramid-pattern
public static void main(){
    int n = 4;
    for(int line = 1 ; line<=n ; line++){
        for(int p = 1 ; p<=line;p++){
            System.out.print(p+" ");
        }
        System.out.println();
    }
}