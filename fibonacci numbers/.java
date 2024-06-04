class Solution {
    public int fib(int n) {
      
        if(n== 0 ){//0.elemanı soruyorsa direkt 0 döndür
            return 0;
        }
        if(n==1){//1.elemanı soruyorsa direkt 1 döndür.
            return 1;
        }

          int [] fibo =new int[n+1];
        fibo[0]=0;
        fibo[1]=1;
        

        for(int i=2; i<=n; i++){//n.fibonacci elemanına kadar bir önceki ve iki önceki elemmanla toplayarak yeni elemanı elde ettim.
            fibo[i]=fibo[i-1]+fibo[i-2];

        }

        return fibo[n];
    }
}
