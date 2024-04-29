package edu.redwoods.cis18.teamrocket.horoscopejfx;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javafx.scene.web.WebView;

public class BasicGUIController {
    @FXML
    TextField textFIELD;
    @FXML
    WebView wvHoroscope;

    public static int getMonthFromDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.MONTH) + 1; // Adding 1 because Calendar.MONTH starts from 0
    }

    public static int getDayFromDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    public static String getHoroscopeSign(int month, int day) {
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return "aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            return "taurus";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            return "gemini";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            return "cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            return "leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            return "virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            return "libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            return "scorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            return "sagittarius";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            return "capricorn";
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            return "aquarius";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            return "pisces";
        } else {
            return "Invalid date";
        }
    }

    public void edbuttonPress(ActionEvent ae) {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Date date = null;
        try {
            date = formatter.parse(textFIELD.getText());
            System.out.println("Your date of birth is " + formatter.format(date));
            //linkHoroscope.setText("https://www.astrology.com/horoscope/daily/capricorn.html");
            String uri = String.format("https://www.astrology.com/horoscope/daily/%s.html",
                    getHoroscopeSign(getMonthFromDate(date), getDayFromDate(date)));
            System.out.println(uri);
            wvHoroscope.getEngine().load(uri);
        } catch (ParseException e) {
            new Alert(Alert.AlertType.ERROR, "Not a valid date").show();
        }
    }
}




