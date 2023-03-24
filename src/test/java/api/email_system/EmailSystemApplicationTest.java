package api.email_system;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


import java.sql.Connection;
import java.sql.SQLException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class EmailSystemApplicationTest {

    @BeforeEach
    void contextLoads(){

    }

    @Test
    void databaseConnectionTest()  {
        DriverManagerDataSource dataSource = new
                DriverManagerDataSource("jdbc:postgresql://localhost:5432/emailapp");
        try {
            Connection connection = dataSource.getConnection("postgres", "momentum");
            System.out.println(connection);
            assertThat(connection).isNotNull();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

}