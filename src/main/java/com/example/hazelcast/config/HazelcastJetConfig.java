package com.example.hazelcast.config;

import com.hazelcast.jet.Jet;
import com.hazelcast.jet.JetInstance;
import com.hazelcast.jet.config.JetClientConfig;
import com.hazelcast.jet.config.JobConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HazelcastJetConfig {

    @Bean
    public JetInstance jetInstance() {
        JetClientConfig clientConfig = new JetClientConfig();
        clientConfig.setClusterName("jet");
        clientConfig.getNetworkConfig().addAddress("localhost:5701");
        return Jet.newJetClient(clientConfig);
    }
}
