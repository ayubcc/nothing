import java.util.*;


public class Apriori {
    public static void main(String ar[]) throws Exception {
        String ip[] = { "i1i2i5", "i2i4", "i2i3", "i1i2i4", "i1i3", "i2i3", "i1i3", "i1i2i3i5", "i1i2i3" };
        int minSupp = 2;
        int i1 = 0, i2 = 0, i3 = 0, i4 = 0, i5 = 0;
        for (int i = 0; i < ip.length; i++) {
            if (ip[i].contains("i1"))
                i1++;
            if (ip[i].contains("i2"))
                i2++;
            if (ip[i].contains("i3"))
                i3++;
            if (ip[i].contains("i4"))
                i4++;
            if (ip[i].contains("i5"))
                i5++;
        }
        System.out.println("Items \t\t Count");
        System.out.println("I1 \t\t\t\t " + i1);
        System.out.println("I2 \t\t\t\t " + i2);
        System.out.println("I3 \t\t\t\t " + i3);
        System.out.println("I4 \t\t\t\t " + i4);
        System.out.println("I5 \t\t\t\t " + i5);
        int i1i2 = 0, i1i3 = 0, i1i4 = 0, i1i5 = 0, i2i3 = 0, i2i4 = 0, i2i5 = 0, i3i4 = 0, i3i5 = 0, i4i5 = 0;
        for (int i = 0; i < ip.length; i++) {
            if (ip[i].contains("i1") && ip[i].contains("i2"))
                i1i2++;
            if (ip[i].contains("i1") && ip[i].contains("i3"))
                i1i3++;
            if (ip[i].contains("i1") && ip[i].contains("i4"))
                i1i4++;
            if (ip[i].contains("i1") && ip[i].contains("i5"))
                i1i5++;
            if (ip[i].contains("i2") && ip[i].contains("i3"))
                i2i3++;
            if (ip[i].contains("i2") && ip[i].contains("i4"))
                i2i4++;
            if (ip[i].contains("i2") && ip[i].contains("i5"))
                i2i5++;
            if (ip[i].contains("i3") && ip[i].contains("i4"))
                i3i4++;
            if (ip[i].contains("i3") && ip[i].contains("i5"))
                i3i5++;
            if (ip[i].contains("i4") && ip[i].contains("i5"))
                i4i5++;
        }
        System.out.println("\nItems \t\t Count");
        if (i1i2 >= 2)
            System.out.println("I1I2 \t\t\t " + i1i2);
        if (i1i3 >= 2)
            System.out.println("I1I3 \t\t\t " + i1i3);
        if (i1i4 >= 2)
            System.out.println("11I4 \t\t\t " + i1i4);
        if (i1i5 >= 2)
            System.out.println("I1I5 \t\t\t " + i1i5);
        if (i2i3 >= 2)
            System.out.println("I2I3 \t\t\t " + i2i3);
        if (i2i4 >= 2)
            System.out.println("I2I4 \t\t\t " + i2i4);
        if (i2i5 >= 2)
            System.out.println("I2I5 \t\t\t " + i2i5);
        if (i3i4 >= 2)
            System.out.println("I3I4 \t\t\t " + i3i4);
        if (i3i5 >= 2)
            System.out.println("I3I5 \t\t\t " + i3i5);
        if (i4i5 >= 2)
            System.out.println("I4I5 \t\t\t " + i4i5);
        int i1i2i3 = 0, i1i2i5 = 0, i1i2i4 = 0, i1i3i5 = 0, i2i3i4 = 0, i2i3i5 = 0, i2i4i5 = 0;
        for (int i = 0; i < ip.length; i++) {
            if (ip[i].contains("i1") && ip[i].contains("i2") && ip[i].contains("i3"))
                i1i2i3++;
            if (ip[i].contains("i1") && ip[i].contains("i2") && ip[i].contains("i5"))
                i1i2i5++;
            if (ip[i].contains("i1") && ip[i].contains("i2") && ip[i].contains("i4"))
                i1i2i4++;
            if (ip[i].contains("i1") && ip[i].contains("i3") && ip[i].contains("i5"))
                i1i3i5++;
            if (ip[i].contains("i3") && ip[i].contains("i2") && ip[i].contains("i4"))
                i2i3i4++;
            if (ip[i].contains("i3") && ip[i].contains("i2") && ip[i].contains("i5"))
                i2i3i5++;
            if (ip[i].contains("i4") && ip[i].contains("i2") && ip[i].contains("i5"))
                i2i4i5++;
        }
        System.out.println("\nItems \t\t Count");
        if (i1i2i3 >= 2)
            System.out.println("I1I2I3 \t\t\t " + i1i2i3);
        if (i1i2i5 >= 2)
            System.out.println("I1I2I5 \t\t\t " + i1i2i5);
        if (i1i2i4 >= 2)
            System.out.println("11I2I4 \t\t\t " + i1i2i4);
        if (i1i3i5 >= 2)
            System.out.println("11I3I5 \t\t\t " + i1i3i5);
        if (i2i3i4 >= 2)
            System.out.println("I2I3I4 \t\t\t " + i2i3i4);
        if (i2i3i5 >= 2)
            System.out.println("I2I3I4 \t\t\t " + i2i3i5);
        if (i2i4i5 >= 2)
            System.out.println("I2I4I5 \t\t\t " + i2i4i5);
    }
}
