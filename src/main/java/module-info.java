module com.cs.vsu.pereslavtsev_oleg.graphics.elipse_filler.elipsefiller {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cs.vsu.pereslavtsev_oleg.graphics.elipse_filler.elipsefiller to javafx.fxml;
    exports com.cs.vsu.pereslavtsev_oleg.graphics.elipse_filler.elipsefiller;
}