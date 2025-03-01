public class Lab1 {
    public static void main(String args[]) {
        Lab1 lab1 = new Lab1();
        lab1.compulsory();

        if(args.length != 2) {
            System.out.println("trebuie 2 argumente");
        }
        else {
            int n = Integer.parseInt(args[0]);
            int k = Integer.parseInt(args[1]);
            lab1.homework(n, k);
        }
    }

    void compulsory() {
        System.out.println("Hello World!");
        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        int n = (int) (Math.random() * 1_000_000);

        int res = n*3;
        res += 0b10101;
        res += 0xFF;
        res = res*6;

        int sum = 0;
        while (res > 0) {
            sum += res%10;
            res = res/10;
        }
        n = sum;

        while (n > 10) {
            sum = 0;
            while (n > 0) {
                sum += n%10;
                n = n/10;
            }
            n = sum;
        }
        System.out.println(n);
        System.out.println("Willy-nilly, this semester I will learn " + languages[n]);

    }

    void homework(int n, int k) {
        if ( n<k*2-1) {
            System.out.println("nu-mi place inputul");
        }
        else {
        long start = System.nanoTime();
        int[][] adiacenta = new int[n+1][n+1];

        for (int i=1; i <= k; i++) {
            for (int j=1; j<=k; j++) {
                adiacenta[i][j] = adiacenta[j][i] = 1; //subgraf complet de cardinal k 
            }
        }

        String reprezentare = genereazaString(adiacenta, n);
        if (n<50) {
            System.out.println(reprezentare);
        }
        else {
            System.out.println("n este cam prea mare pentru a il afisa");
        }

        System.out.println("numarul de muchii este: " + k*(k-1)/2); //avem muchii doar in subgraful complet

        System.out.println("Δ(G) = " + (k-1));
        System.out.println("δ(G) = " + 0);

        int suma = 0;
        for (int i=1; i <= k; i++) {
            int grad = 0;
            for (int j=1; j<=k; j++) {
                if (i!=j) {
                    grad += adiacenta[i][j];
                }
            }
            suma += grad;
        }

        if (suma == k*(k-1)) {
            System.out.println("suma gradelor este egala cu 2*m");
        }
        else {
            System.out.println("suma gradelor NU este egala cu 2*m");
        }

        long finish = System.nanoTime(); 
        long timp = (finish - start) / 1_000_000; //milisecunde
        if (n>=50) {
            System.out.println(timp);
        }
        }

    }

    public String genereazaString(int[][] adiacenta, int n){
        String nou = "";
        for (int i=1; i <= n; i++) {
            for (int j=1; j<=n; j++) {
                if (adiacenta[i][j] == 1) {
                    nou += "1 ";
                }
                else {
                    nou += "0 ";
                }
            }
            nou += "\n";
        }
        return nou;
    }

    void bonus() {
   
    }

}