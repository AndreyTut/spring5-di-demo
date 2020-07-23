package guru.springframework.config;

import guru.springframework.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropConfig {

    @Value("${db.username}")
    private String username;

    @Value("${password}")
    private String psw;

    @Value("${dburl}")
    private String db_url;

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholder() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public FakeDataSource dataSource() {
        FakeDataSource dataSource = new FakeDataSource();
        dataSource.setUserName(username);
        dataSource.setPsw(psw);
        dataSource.setUrl(db_url);
        return dataSource;
    }
}
