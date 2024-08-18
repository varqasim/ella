package varqasim.finopsspring.database;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.duckdb.DuckDBConnection;

public class DuckDB {
    private DuckDBConnection connection;

    public DuckDB() throws SQLException {
        connection = (DuckDBConnection) DriverManager.getConnection("jdbc:duckdb:/tmp/my_database");
    }

    public DuckDBConnection getConnection() {
        return connection;
    }
}
