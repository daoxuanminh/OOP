/**
 * 
 */
/**
 * @author DaoMinh
 *
 */
module GUIProject {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;
	requires java.desktop;
    opens hust.soict.dsai.javafx to javafx.graphics,javafx.fxml;
}