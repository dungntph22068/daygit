import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void giaiPTBac2() {
        double a, b, c;
        double delta, x1, x2;
        Scanner scanner = new Scanner(System.in);
        //nhap
        System.out.println("Nhap a,b,c");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        //tinh delta
        delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("pt vo nghiem");
        }


        x1 = (-b + Math.sqrt(delta)) / 2 * a;
        x2 = (-b - Math.sqrt(delta)) / 2 * a;

//        System.out.println("a=%f ;b=%f ;c=%f \n delta=%f ;x1=%f;x2=%f",a,b,c,delta,x1,x2);
        System.out.printf("a= %f; b= %f; c= %f \n delta= %f; x1= %f; x2= %f",
                a, b, c, delta, x1, x2);
    }

    static void pintMyName() {
        System.out.println("Tien " + "Dung" + 2003);
    }

    static void inthongCCCD() {
        String so, ten, diaChi;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so");
        so = scanner.nextLine();
        System.out.println("Nhap ten");
        ten = scanner.nextLine();
        System.out.println("Nhap dia chi");
        diaChi = scanner.nextLine();


        System.out.printf("so=%s;ten=%s;diaChi=%s", so, ten, diaChi);
    }

    static void stringCompareDemo() {
        String s1 = "123";
        String s2 = new String("123");

//        c1
        System.out.println(s1 == s2);
//        c2 equals
        System.out.println(s1.equals(s2));
//        c3 ss:compareTo()
        System.out.println(s1.compareTo(s2));
    }


    static void soSanh() {
        String a = "con me may";
        String b = "CON ME MAY";
        System.out.println(a.equalsIgnoreCase(b));
    }

    //bai 1
    static void DemKyTu(String str) {
        int counter[] = new int[256];
        int len = str.length();
        for (int i = 0; i < len; i++)
            counter[str.charAt(i)]++;
        char array[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            array[i] = str.charAt(i);
            int flag = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == array[j])
                    flag++;
            }
            if (flag == 1)
                System.out.println("S??? l???n xu???t hi???n c???a " + str.charAt(i)
                        + " trong chu???i:" + counter[str.charAt(i)]);
        }
    }


    static void chuThuongInHoa() {
        Scanner sc = new Scanner(System.in);
        String message;
        System.out.println("\n\nNh???p v??o chu???i c???n in hoa: ");
        message = sc.nextLine();
        //khai b??o m???t m???ng, sau ???? s??? d???ng ph????ng th???c toCharArray()
        //????? chuy???n ?????i message th??nh m???t m???ng ki???u char
        char[] charArray = message.toCharArray();
        //s??? d???ng v??ng l???p for ????? duy???t c??c ph???n t??? trong charArray
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 97 && charArray[i] <= 122) {
                charArray[i] -= 32;
            }
        }
        message = String.valueOf(charArray);
        System.out.println("Chu???i sau khi ?????i: \n" + message);
    }

    static void ktDemSoLan() {
        String chuoi;
        char kyTu = 'n';
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nh???p v??o chu???i b???t k???: ");
        chuoi = scanner.nextLine();

        // duy???t t??? ?????u ?????n cu???i chu???i
        for (int i = 0; i < chuoi.length(); i++) {
            // N???u k?? t??? t???i v??? tr?? th??? i b???ng 'a' th?? t??ng count l??n 1
            if (chuoi.charAt(i) == kyTu) {
                count++;
            }
        }

        System.out.println("S??? l???n xu???t hi???n c???a k?? t??? " + kyTu +
                " trong chu???i " + chuoi + " = " + count);
    }

    static void form() {
        LocalDate date = LocalDate.of(2001, 2, 2);
        System.out.println(date.format(DateTimeFormatter.ofPattern("MM/dd/yyy")));

    }

    static void bai11() {
        String input = "ddaaaa";
        int counting = 0;
        for (int index = 0; index < input.length(); index++) {
            if (input.charAt(index) == 'd') {
                counting++;
            }
        }
        System.out.println("So lan li tu d:" + counting);
    }
//        String str = "??dasdccsc";
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == 'c') {
//                count++;
//            }
//        }
//        System.out.println("S??? l???n xu???t hi???n c???a k?? t??? 'c' l??: " + count);
//    }

    static void demoStringBulder(){
        StringBuilder builder=new StringBuilder();
        System.out.println("Suc chua buider :" + builder.capacity());
        StringBuilder builder2 =new StringBuilder("daadash");
        System.out.println("Suc chua buider 2:" + builder2.capacity());
        System.out.println("Suc chua buider 2:" + builder2.length());

        StringBuilder builder3 =new StringBuilder(   500);
        System.out.println("suc chua 3:" + builder3.capacity());

        StringBuilder builder4 =new StringBuilder(new StringBuilder("hello world"));

    }
    static void StringBuiderBT(){
        char[] array = {'H','e','l','l','o'};
        StringBuilder sb = new StringBuilder();

        for (char c : array) {
            sb.append(c);
        }

        String result = sb.toString();
        System.out.println(result);
    }
    public static void main(String[] args) {
//        giaiPTBac2();
//        pintMyName();

//        inthongCCCD();
//        stringCompareDemo();
//        soSanh();
//        String str = "??dasdccsc";
//        System.out.println("Chu???i l??: "+ str);
//        DemKyTu(str);
        // chuy???n ?????i m???ng char th??nh string
//        chuThuongInHoa();
//        ktDemSoLan();
//    form();
        //        bai11();
//        demoStringBulder();
        StringBuiderBT();
    }
}