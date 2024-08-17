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
        clientConfig.setClusterName("hazelcast-cluster");
        clientConfig.getNetworkConfig().addAddress("external-ip-or-node-ip:5701");
        return Jet.newJetClient(clientConfig);
    }

    @Bean
    public JobConfig jobConfig() {
        JobConfig jobConfig = new JobConfig();
        // Configure your job if needed
        return jobConfig;
    }
}
