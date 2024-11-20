package stack;
public class celebrityProblem {
    public static void main(String[] args) {
        
    
    // int[][] mat = {{0, 1, 0}, {0, 0, 0}, {0, 1 ,0}};
    // int mat[][] = {{0,1},{1,0}};
    int mat[][] = {{0}};
    System.out.println(func(mat));
    
}

public static int func(int mat[][]){
    int n = mat.length;
    int top = 0;
    int down = n-1;
    while(top < down){
        if(mat[top][down] == 1){
            top = top +1;
        }
        else if(mat[down][top] == 1){
            down = down -1;
        }
        else{
            top ++;
            down--;
        }
    }
    if(top > down){
        return -1;
    }
    for(int i = 0; i< n-1; i++){
        if(i == top){
            continue;
        }
        if(mat[top][i]== 0 && mat[i][top] == 1){
            
        }
        else{
            return -1;
        }
    }
    return top;


}
}
