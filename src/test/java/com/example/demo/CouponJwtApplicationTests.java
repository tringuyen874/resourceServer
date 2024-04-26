package com.example.demo;

import com.example.config.ResourceServerConfig;
import com.example.controllers.CouponRestController;
import com.example.entities.Coupon;
import com.example.repos.CouponRepo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.oauth2.server.resource.authentication.JwtGrantedAuthoritiesConverter;
import org.springframework.test.context.ActiveProfiles;

//import static jdk.internal.org.objectweb.asm.util.CheckClassAdapter.verify;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.springframework.test.web.client.ExpectedCount.times;

@SpringBootTest
//@ActiveProfiles("test")
class CouponJwtApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void test_valid_coupon_object() {
		// Arrange
		CouponRestController controller = new CouponRestController();
		CouponRepo repo = mock(CouponRepo.class);
		controller.setRepo(repo);
		Coupon coupon = new Coupon();

		// Act
		Coupon result = controller.create(coupon);

		// Assert
		assertNotNull(result);
//		verify(repo, times(1)).save(coupon);
	}



}
