package practice;

public class factorial {
    public static void main(String[] args){
        factorial t = new factorial();
        System.out.println(t.dfs(5));
    }
    public int dfs(int n){
        if(n == 1){
            return 1;
        }else{
            return n * dfs(n - 1);
        }
        
    }
}
