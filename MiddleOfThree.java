//problem link::https://practice.geeksforgeeks.org/problems/middle-of-three2926/1
class Solution{
    int middle(int A, int B, int C){
        int res=0;
        if(A<Math.min(B,C)){
            res= (int)Math.min(B,C);
        }
        else if(B<Math.min(A,C)){
            res= (int)Math.min(A,C);
        }
        else if(C<Math.min(A,B)){
            res= (int)Math.min(A,B);
        }
        //code here
        return res;
    
}
}
