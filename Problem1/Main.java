package Problem1;

public class Main {

    public static void main(String[] args) {
        int s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1, s7 = 1, cpt = 0;

        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 2; j++) {
                for (int k = 1; k <= 2; k++) {
                    for (int l = 1; l <= 2; l++) {
                        for (int m = 1; m <= 2; m++) {
                            for (int n = 1; n <= 2; n++) {
                                for (int o = 1; o <= 2; o++) {

                                    int res = s1 + s2 * 2 + s3 * 3 + s4 * 4 + s5 * 5 + s6 * 6 + s7 * 7;
                                    if (res < 0) {
                                        cpt++;
                                    }
                                    s7 = -1;
                                }
                                s7 = 1;
                                s6 = -1;
                            }
                            s6 = 1;
                            s5 = -1;
                        }
                        s5 = 1;
                        s4 = -1;
                    }
                    s4 = 1;
                    s3 = -1;
                }
                s3 = 1;
                s2 = -1;
            }
            s2 = 1;
            s1 = -1;
        }
        System.out.println("Number of possibility is : "+cpt);
    }

}
