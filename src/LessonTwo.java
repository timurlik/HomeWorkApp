public class LessonTwo {
    public static void main(String[] args) {
    fieldFour();

    }
    public static void fieldOne() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j < 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void fieldTwo() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0 || i == 2 || j == 0 || j == 2 ) {
                    System.out.print("0 ");
                } else {
                    System.out.print("* ");
                }
            }  System.out.println();
        }
    }
    public static void fieldThree() {
       for (int i = 0; i < 6; i++) {
           for (int j = 0; j < 6; j++) {
               if ((i + j) % 2 == 0) {
                   System.out.print("* ");
               }    else {
                   System.out.print("0 ");
               }
           }    System.out.println();
       }
    }
    public static void fieldFour() {
        for (int i = 0; i < 6; i ++) {
            for (int j = 0; j < 6; j++) {
                if (j > i) {
                    System.out.print("* ");
                }   else if (i > j) {
                    System.out.print("0 ");
                }   else {
                    System.out.print(" ");
                }
            }   System.out.println();
        }
    }
}