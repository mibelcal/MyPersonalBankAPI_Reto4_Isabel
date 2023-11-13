package es.netmind.mypersonalbankapi.persistencia;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DBConnectorTest {
    @Test
    void connect_isOK() {
        DBConnector dbc = new DBConnector();
        try {
            dbc.connect();
            assertTrue(true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}


