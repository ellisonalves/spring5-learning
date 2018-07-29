package com.ellisonalves.didemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.ellisonalves.didemo.examplebeans.FakeDataSource;

@Configuration
@PropertySource(value = { "classpath:datasource.properties", "classpath:jms.properties" })
public class PropertyConfig {

	@Value("${guru.user}")
	String user;

	@Value("${guru.password}")
	String password;

	@Value("${guru.dburl}")
	String url;

	@Value("${guru.jms.password}")
	String jmsPassword;

	@Value("${guru.jms.url}")
	String jmsUrl;

	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUser(user);
		fakeDataSource.setPassword(password);
		fakeDataSource.setDbUrl(url);
		return fakeDataSource;
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
		return configurer;
	}

}
