package practice;

public class recursive {
    public static void main(String[] args){
        recursive t = new recursive();
        t.dfs(3);
    }
    public void dfs(int n){
        if(n == 0){
            return;
        }else{
            //System.out.println(n + " "); // 3 2 1
            dfs(n - 1);
            System.out.println(n + " "); // 1 2 3
        }
    }
}
//new