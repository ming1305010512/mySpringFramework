package org.alsa.springcore;

import com.hand.hap.account.dto.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/5/29
 * @Time: 11:13
 * @Description:
 */
public class BeanTest {
	@Test
	public void getBean(){
		ApplicationContext context = new ClassPathXmlApplicationContext("org/alsa/springcore/service.xml");
		User user = context.getBean("user",User.class);

	}
}
