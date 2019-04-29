package greedy;

//https://dev.mysql.com/doc/workbench/en/wb-installing-windows.html
import java.util.Arrays;

public class ActivitySelection {
//10, 12, 20
//20, 25, 30
    void maximumActivities(int[] start, int[] finish, int n) {
        Arrays.sort(finish);
        int i = 0;
        System.out.println(i+" ");
        for (int j = 1; j < n; j++) {
            if (start[j] >= finish[i]){
                System.out.println(j+" ");
                i=j;
            }
        }
    }
}
