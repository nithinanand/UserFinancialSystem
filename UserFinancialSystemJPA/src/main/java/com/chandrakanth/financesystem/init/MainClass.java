package com.chandrakanth.financesystem.init;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.chandrakanth.financesystem.dao.DAOImpl;
import com.chandrakanth.financesystem.entity.UserCredentials;

@Repository
public class MainClass {

	private static ApplicationContext appContext = null;
	private static final Logger LOGGER = Logger.getLogger(MainClass.class);
	private static ConfigurationClass configClass = null;

	
	private static MainClass mainClass = new MainClass();
	
	static {
		if (appContext == null) {
			appContext = new ClassPathXmlApplicationContext(AppConstants.BEAN_PROPERTIES);
		}

		PropertyConfigurator.configure(AppConstants.LOGGER_PROPERTIES);
	}

	public static void main(String[] argz) {

		LOGGER.info(configClass);

		UserCredentials uC = new UserCredentials();
		uC.setUserName("Chunkey P");
		uC.setPassWord("CP");

		DAOImpl daoImpl = appContext.getBean(DAOImpl.class);
		daoImpl.persistValues(uC);
		

	}

}
