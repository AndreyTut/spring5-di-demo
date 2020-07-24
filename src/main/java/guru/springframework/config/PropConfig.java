package guru.springframework.config;

import guru.springframework.examplebeans.FakeDataSource;
import guru.springframework.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropConfig {

    @Value("${db.username}")
    private String username;

    @Value("${password}")
    private String psw;

    @Value("${dburl}")
    private String db_url;

    @Value("${jms.username}")
    private String jmsUser;

    @Value("${jms.password}")
    private String jmsPswrd;

    @Value("${jms.url}")
    private String jmsUrl;

    @Bean
    public FakeDataSource dataSource() {
        FakeDataSource dataSource = new FakeDataSource();
        dataSource.setUserName(username);
        dataSource.setPsw(psw);
        dataSource.setUrl(db_url);
        return dataSource;
    }

    @Bean
    public FakeJmsBroker jmsBroker() {
        FakeJmsBroker jmsBroker = new FakeJmsBroker();
        jmsBroker.setUserName(jmsUser);
        jmsBroker.setPsw(jmsPswrd);
        jmsBroker.setUrl(jmsUrl);
        return jmsBroker;
    }
}
