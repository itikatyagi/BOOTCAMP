package com.ttnd.reap.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.ttnd.reap.model.User;
import com.ttnd.reap.model.Karma;

import com.ttnd.reap.model.*;

@Configuration
@EnableWebMvc
@ComponentScan({ "com.ttnd.reap.controller", "com.ttnd.reap.dao.Impl", "com.ttnd.reap.service.impl" })
public class ApplicationContextConfig extends WebMvcConfigurerAdapter {

	private static final long serialVersionUID = 3679106749593888260L;
	public static JdbcTemplate myJdbcTemplate = null;

	private static BasicDataSource dataSource;

	@Bean(name = "viewResolver")
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

	@Override
	public void addResourceHandlers(final ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");

	}

	@Bean(name = "dataSource")
	public DataSource getDataSource() {
		dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/reapp");
		dataSource.setUsername("root");
		dataSource.setPassword("root");

		return dataSource;
	}

	public static Session getSession(SessionFactory sessionFactory) {
		Session session = sessionFactory.getCurrentSession();
		if (session == null)
			session = sessionFactory.openSession();

		return session;
	}

	public static JdbcTemplate getJdbcTemplate() {
		if (myJdbcTemplate != null)
			return myJdbcTemplate;
		myJdbcTemplate = new JdbcTemplate(dataSource);

		return myJdbcTemplate;
	}

	public Properties getHibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		properties.put("hibernate.current_session_context_class", "thread");
		return properties;
	}

	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
		sessionBuilder.addProperties(getHibernateProperties());
		sessionBuilder.addAnnotatedClasses(Badge.class);
		sessionBuilder.addAnnotatedClasses(EarnedKitty.class);
		sessionBuilder.addAnnotatedClasses(GivingKitty.class);
		sessionBuilder.addAnnotatedClasses(InitialKitty.class);
		sessionBuilder.addAnnotatedClasses(Karma.class);
		sessionBuilder.addAnnotatedClasses(Practice.class);
		sessionBuilder.addAnnotatedClasses(Recognize.class);
		sessionBuilder.addAnnotatedClasses(Role.class);
		sessionBuilder.addAnnotatedClasses(Service.class);
		sessionBuilder.addAnnotatedClasses(User.class);

		SessionFactory sessionFactory = sessionBuilder.buildSessionFactory();
		return sessionFactory;
	}

	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;
	}

}