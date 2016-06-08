package com.ivar.test.configuration;

import java.sql.SQLException;

import javax.sql.DataSource;
import javax.validation.constraints.NotNull;

import oracle.jdbc.pool.OracleDataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("ewsdb")
public class JpaConfiguration {

	@NotNull
	private String username = "ewsrapp";
	
	@NotNull
	private String password = "ewsrapp1";
	
	@NotNull
	private String url = "jdbc:oracle:thin:@//RKVRHLD177.devlab.dev:1521/EWSRD";

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Bean
	public DataSource dataSource() throws SQLException {

		final OracleDataSource dataSource = new OracleDataSource();
		dataSource
				.setURL(url);
		dataSource.setUser(username);
		dataSource.setPassword(password);

		return dataSource;
	}

}
