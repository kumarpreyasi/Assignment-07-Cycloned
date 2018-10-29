import java.lang.Math;

public class Main {

    public static double R = 6371;

    public static void main(String[] args) {

        double dp_s, d1_2, d2_3, d3_4, d4_5, d5_6, d6_7, d7_8, d8_9, d9_10, d10_11, d11_12, d12_13, D;

//        System.out.println("R = " + R + " km");

        dp_s = calcDist("Day X",48.8567, 2.3508, 37.783333, -122.41667);
        System.out.printf("Distance from Paris to SF = %.1f km\n", dp_s);
        System.out.println("=========================================================================================");

        d1_2 = calcDist("Day 1",25, 15, 23, 20);
        d2_3 = calcDist("Day 2",23, 20, 21, 24);
        d3_4 = calcDist("Day 3",21, 24, 20, 27);
        d4_5 = calcDist("Day 4",20, 27, 19, 35);
        d5_6 = calcDist("Day 5",19, 35, 21, 46);
        d6_7 = calcDist("Day 6",21, 46, 23, 56);
        d7_8 = calcDist("Day 7",23, 56, 25, 65);
        d8_9 = calcDist("Day 8",25, 65, 28, 70);
        d9_10 = calcDist("Day 9",28, 70, 32, 73);
        d10_11 = calcDist("Day 10",32, 73, 34, 74);
        d11_12 = calcDist("Day 11",34, 74, 36, 74);
        d12_13 = calcDist("Day 12",36, 74, 39, 74);

        D = d1_2 + d2_3 + d3_4 + d4_5 + d5_6 + d6_7 + d7_8 + d8_9 + d9_10 + d10_11 + d11_12 + d12_13;

        System.out.printf("\nTotal distance traveled by Hurricane Gloria = %.1f km\n", D);
        System.out.println("=========================================================================================");

    }

    public static double calcDist(String dayNum, double dlat1, double dlong1, double dlat2, double dlong2){

        double rlat1, rlat2, rlong1, rlong2, a, c, d;

//        System.out.println("Point 1 coordinate in degrees: (" +dlat1 + ", " + dlong1 + ")");
//        System.out.println("Point 2 coordinate in degrees: (" +dlat2 + ", " + dlong2 + ")");

        rlat1 = Math.toRadians(dlat1);
        rlong1 = Math.toRadians(dlong1);
//        System.out.println("Point 1 coordinate in radians: (" +rlat1 + ", " + rlong1 + ")");

        rlat2 = Math.toRadians(dlat2);
        rlong2 = Math.toRadians(dlong2);
//        System.out.println("Point 2 coordinate in radians: (" +rlat2 + ", " + rlong2 + ")");

        a = Math.pow(Math.sin((rlat1-rlat2)/2),2) + Math.cos(rlat1)*Math.cos(rlat2)*Math.pow(Math.sin((rlong1-rlong2)/2),2);
//        System.out.println("a = "+a);

        c = 2*Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
//        System.out.println("c = " +c);

        d = R*c;
        System.out.println("Distance traveled on " +dayNum+" = " +d+ " km");
//        System.out.println("=========================================================================================");

        return d;
    }
}
