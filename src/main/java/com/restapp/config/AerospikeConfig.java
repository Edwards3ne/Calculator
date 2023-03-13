package com.restapp.config;

import com.aerospike.client.Host;
import com.restapp.repository.AerospikeCalculationRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.aerospike.config.AbstractAerospikeDataConfiguration;
import org.springframework.data.aerospike.config.AerospikeDataSettings;
import org.springframework.data.aerospike.repository.config.EnableAerospikeRepositories;

import java.util.Collection;
import java.util.Collections;

@Configuration
@EnableAerospikeRepositories(basePackageClasses = AerospikeCalculationRepository.class)
public class AerospikeConfig extends AbstractAerospikeDataConfiguration {
//TODO vyměnit jméno tabulky atd. za proměné
    @Override
    protected Collection<Host> getHosts() {
        return Collections.singleton(new Host(Properties.DB_SERVER_NAME, Properties.DB_SERVER_PORT));
    }

    @Override
    protected String nameSpace() {
        return Properties.DB_SERVER_NAMESPACE;
    }
    @Bean
    public AerospikeDataSettings aerospikeDataSettings() {
        return AerospikeDataSettings.builder().scansEnabled(true).build();
    }

}
