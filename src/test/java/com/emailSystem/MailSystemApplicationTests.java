package api.email_system;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(classes = EmailSystemApplication.class)
class MailSystemApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void databaseConnectionTest(){
        DataSource dataSource = new
                DriverManagerDataSource("jdbc:postgresql://localhost:5432/emailApplication");
        try{
            Connection connection = dataSource.getConnection("postgres","momentum");
            System.out.println(connection);
            assertThat(connection).isNotNull();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
