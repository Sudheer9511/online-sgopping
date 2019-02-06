package com.sudheer.shoppingBackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.sudheer.shoppingBackend.dao.CategoryDAO;
import com.sudheer.shoppingBackend.daoimpl.CategoryDAOImpl;

@Configuration
@ComponentScan(basePackages = { "com.sudheer.shoppingBackend.dto" })
@EnableTransactionManagement
public class HibernateConfig {

	// Change the below based on the DBMS you choose
	private final static String DATABASE_URL = "jdbc:h2:tcp://localhost/~/online_shopping";
	private final static String DATABASE_DRIVER = "org.h2.Driver";
	private final static String DATABASE_DIALECT = "org.hibernate.dialect.H2Dialect";
	private final static String DATABASE_USERNAME = "Sudheer";
	private final static String DATABASE_PASSWORD = "Sudheer@1992";

	// dataSource bean will be available

	@Bean
	public DataSource getDataSource() {
          DriverManagerDataSource dataSource = new DriverManagerDataSource();
		// providing Database Connection Information
		dataSource.setDriverClassName(DATABASE_DRIVER);
		dataSource.setUrl(DATABASE_URL);
		dataSource.setUsername(DATABASE_USERNAME);
		dataSource.setPassword(DATABASE_PASSWORD);

		return dataSource;

	}

	// SessionFactory bean will be available

	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		 LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	        sessionFactory.setDataSource(getDataSource());
	        sessionFactory.setPackagesToScan(new String[] { "com.sudheer.shoppingBackend.dto" });
	        sessionFactory.setHibernateProperties(getHibernateProperties());
	        return sessionFactory;
	        

	}

	//All the hibernate properties will be returned in this method
	private Properties getHibernateProperties() {
		
		Properties properties = new Properties();
		properties.put("hibernate.dialect", DATABASE_DIALECT);
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.format_sql", "true");
		return properties;
	}
	
	@Bean
	public HibernateTransactionManager geTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;
	}
       
	
}
