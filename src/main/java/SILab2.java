import java.util.ArrayList;
import java.util.List;

class Angle {
    int degrees;
    int minutes;
    int seconds;

    public Angle(int degrees, int minutes, int seconds) {
        this.degrees = degrees;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getDegrees() {
        return degrees;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
};

public class SILab2 {
    public static List<Integer> function(List<Angle> angleList) {//1
        List<Integer> result = new ArrayList<>();//1

        for (int i = 0; i < angleList.size(); i++) {//2
            int deg = angleList.get(i).getDegrees();//3
            int min = angleList.get(i).getMinutes();//3
            int sec = angleList.get(i).getSeconds();//3
            if (deg >= 0 && deg < 360) {//4
                if (min < 0 || min > 59)//5
                    throw new RuntimeException("The minutes of the angle are not valid!");//6
                else {
                    if (sec < 0 || sec > 59)//7
                        throw new RuntimeException("The seconds of the angle are not valid");//8
                    else
                        result.add(deg * 3600 + min * 60 + sec);//9
                }
            } else if (deg == 360) {//10
                if (min == 0 && sec == 0)//11
                    result.add(deg * 3600 + min * 60 + sec);//12
                else
                    throw new RuntimeException("The angle is greater then the maximum");//13
            } else {
                throw new RuntimeException("The angle is smaller or greater then the minimum");//14
            }
        }//15
        return result;//16

    }//17
}
