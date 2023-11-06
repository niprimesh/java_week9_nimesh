import java.util.ArrayList;
import java.util.Scanner;

/**
 * write the programme that tell you which line pass through particular station.
 * just use Zone 1 stations name.
 */
public class Programme10TubeStation {
    public static void main(String[] args) {
        Programme10TubeStation obj = new Programme10TubeStation();
        obj.tubestation();
    }
    public void tubestation() {
        ArrayList<String> station = new ArrayList<>();
        station.add("LondonBridge");
        station.add("Bank");
        station.add("BakerStreet");
        station.add("bondstreet");
        station.add("oxfordcircus");
        station.add("Paddington");
        station.add("Westminister");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zone 1 stations names are :" + station);
        System.out.println("_________________________________________");
        System.out.println("Enter any station name:");
        String station1 = scanner.next();
        switch (station1) {
            case "LondonBridge":
                System.out.println("lines pass through LondonBridge : northern line and jubilee");
                break;
            case "bank":
                System.out.println("Lines pass through bank: northernline, District line and central line");
                break;
            case "baker steet":
                System.out.println("Lines pass through BakerStreet : metropiliton, Central line, hemmersmith and city");
                break;
            case "bondStreet":
                System.out.println("Lines pass through bond Street : jubilee line, central line, elizabeth line");
                break;
            case "oxford circus":
                System.out.println("Lines pass through oxford circus: central line, northern line, elizabeth line");
                break;
            case "paddington":
                System.out.println("lines pass through paddington : circle line, district line, elizabeth line, hemmersmith and city");
                break;
            case "Westminister":
                System.out.println("lines pass through Westminister: jubilee line, northernline, bakerloo line");
                break;
            default:
                System.out.println("Invalid station name");
        }

    }


}
