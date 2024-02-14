import java.util.Scanner;

public class AstrologySignFinder {

    public static String getAstrologySign(int month, int day) {
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return "Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            return "Taurus";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            return "Gemini";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            return "Cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            return "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            return "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            return "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            return "Scorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            return "Sagittarius";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            return "Capricorn";
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            return "Aquarius";
        } else {
            return "Pisces";
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month of your birthday (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the day of your birthday: ");
        int day = scanner.nextInt();

        // You can add additional input for the year if needed.

        String astroSign = getAstrologySign(month, day);

        System.out.println("Your Birthday: " + month + "/" + day);
        System.out.println("Your Astrology Sign: " + astroSign);

        // Generate link based on astrological sign
       // String link = "https://www.astrology.com/zodiac-signs#" + astroSign.toLowerCase();
        //^^^Just in-case we want general zodiac
        String link = "https://www.astrology.com/horoscope/daily/" + astroSign.toLowerCase() + ".html";
        System.out.println("Link to Website: " + link);

        // Don't forget to close the scanner
        scanner.close();
    }
}

