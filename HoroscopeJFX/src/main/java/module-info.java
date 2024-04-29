module edu.redwoods.cis18.teamrocket.horoscopejfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens edu.redwoods.cis18.teamrocket.horoscopejfx to javafx.fxml;
    exports edu.redwoods.cis18.teamrocket.horoscopejfx;
}