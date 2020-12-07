package com.cg.dealsdateonlinegiftshopping;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.dealsdateonlinegiftshopping.entity.User;
import com.cg.dealsdateonlinegiftshopping.exception.UserException;
import com.cg.dealsdateonlinegiftshopping.service.UserServiceInterface;

@SpringBootTest
class DealsDateOnlineGiftShoppingApplicationTests {


	@Autowired
	UserServiceInterface userServiceInterface;
	
	
	
	
//	@Test
//	public void addCustomerFail()
//	{
//		User user=new User("krajout97@gmail.com", "Kiran", "Rajput", "Kiran@123", "Kiran@123",	"8922564378");
//		assertThrows(UserException.class, () -> {
//			userServiceInterface.signUp(user);
//		});
//	}



//	@Test
//	public void updateCustomerPass() throws UserException
//	{
//		User user=new User(	6,"shruti@gmail.com", "shruti", "diwedi", "Shruti@123","Shruti@123", "8547896587");
//		assertThat(userServiceInterface.updateUser( user,6)).isNotNull();
//
//	}
	
//	@Test
//	public void updateCustomerFail()
//	{
//		User user=new User(	"10009", "Simran", "Sector 14", "Chandigarh", "simran1@gmail.com",	"8923564378");
//		
//		assertThrows(UserException.class, () -> {
//			userServiceInterface.updateUser( user, 10009); });
//	}
	

}
