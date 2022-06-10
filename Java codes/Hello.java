
public class Hello {
    public static void main(String[] args) {
        int marker = 512;
        double percentage = marker * 0.46f;
        System.out.println("Percentage:" + percentage);

    }

}

public class Hello {
public static void main(String[] args) {
int x = 5;
if (x != 5) {
System.out.println("Value of x is not 5");

} else {
System.out.println("value of x is 5");

}

}
}

public class Hello {
public static void main(String[] args) {
int ageOfBoy = 36;
int ageOfGirl = 25;
if ((ageOfBoy >= 21) && (ageOfGirl >= 18)) {
System.out.println("Ready to get married");

} else {
System.out.println("Wait for it kiddo");
}

}
}

public class Hello {
    public static void main(String[] args) {
        String name = "TE";
        switch (name.toLowerCase()) {
            case "author":
                System.out.println("Vikas");
                break;
            case "team":
                System.out.println("Team Java Full Stack");
                break;
            case "editor":
                System.out.println("Prasad & Kunapareddy");
                break;
            default:
                System.out.println("Invalid entry");
                break;

        }
    }
}

public class Hello {
public static void main(String[] args) {
int number = 39;
boolean isPrime = true;
for (int i = 2; i < number / 2; i++) {
if (number % i == 0) {
isPrime = false;
}
}
if (isPrime == true) {
System.out.println("The number is a prime number");

} else {
System.out.println("The number is not a prime number");
}
}
}

public class Hello {
    public static void main(String[] args) {

        int i = 10;
        int j = 20;
        if (i == j) {
            System.out.println("These values are equal");

        } else {
            System.out.println("These valuse are not equal");
        }
    }
}

public class Hello {
    public static void main(String[] args) {
        int num = 70_00_00_000;
        num = 3;
        System.out.println(num);
        float percent1 = 5.5f;
        double percent = 5.5;

    }
}

public class Hello {
    public static void main(String[] args) {
        int m = 5, n = 3;
        int r1 = m + n;
        int r2 = m - n;
        int r3 = m * n;
        int r4 = m / n;
        int r5 = m % n;

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
    }
}

public class Hello {
    public static void main(String[] args) {
        int m = 5;
        int n = 6;

        n--;
        --m;
        System.out.println(n);
        System.out.println(m);

    }
}

public class Hello {
    public static void main(String[] args) {
        int n = 67345;

        if (n % 2 == 0)
            System.out.println("Even");
        if (n % 2 != 0)
            System.out.println("Odd");
    }
}
