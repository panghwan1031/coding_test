package practice;

public class binary {
    public static void main(String[] args){
        binary t  = new binary();
        t.dfs(13);

    }

    public void dfs(int n){
        if(n == 0){
            return;
        }
        else{
            dfs(n/2);
            System.out.println(n % 2 + " ");
        }
    }
}
