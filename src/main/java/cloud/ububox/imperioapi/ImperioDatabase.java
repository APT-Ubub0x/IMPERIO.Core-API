package cloud.ububox.imperioapi;

import java.sql.Connection;
import java.sql.SQLException;

public interface ImperioDatabase {
    Connection getConnection() throws SQLException;
}