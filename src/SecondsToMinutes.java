public class SecondsToMinutes {

    public int getDurationString(int minutes, int seconds){
        if (minutes < 0 || seconds < 0 && seconds > 59){
            System.out.println("Invalid Value");
            return -1;
        }

        seconds = (minutes * 60) + (seconds);
        minutes = seconds / 60;
        int hours = minutes / 60;
        minutes = minutes - hours*60;
        seconds = seconds%60;

        System.out.println(hours + "h " + minutes + "m " + seconds + "s");
        return 1;
    }
}

