package com.suhas.hib.Configure;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		Class arr[]= {HibernateConfig.class};
		return arr;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		Class arr[]= {AppContext.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String arr[]= {"/"};
		return arr;
	}

}
