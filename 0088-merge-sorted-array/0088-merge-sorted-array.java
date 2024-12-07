class Solution {
  public static void merge(int[] n1, int m, int[] n2, int n) {
    for(int ai : n2 ){
           chenphantuvomang(ai,n1,m);
           m++;
    }
    }

    private static void chenphantuvomang(int x, int[] a, int m) {
        boolean timDuocK = false;
        for (int k = 0; k < m; k++) {
             if(a[k] > x ){
                 timDuocK = true;
                 for (int i = m-1; i >=k; i--) {
                     a[i+1] = a[i];

                 }
                 a[k] = x;
             break;
             }

        }
        if(timDuocK ==false){
            a[m] = x ;
        }
    }
}