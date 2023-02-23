package com.service.back_end_service_one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BackEndServiceOneApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	void getAndSetThingID(){
		Product cut = new Product();
		Long myId = 1L;
		cut.setId(myId);
		assertEquals(myId, cut.getId());
	}
	@Test
	void getName(){
		Product cut = new Product();
		String myName = "table";
		cut.setName(myName);
		assertEquals(myName, cut.getName());
	}
	@Test
	void getShortDiscription(){
		Product cut = new Product();
		String shortDiscription= "An impressive pair of slippers featuring thousands of real rubies";
		cut.setShortDiscription(shortDiscription);
		assertEquals(shortDiscription, cut.getShortDiscription());
	}
	@Test
	void getLongDiscription(){
		Product cut = new Product();
		String LongDiscription= "Harry Winston has carefully crafted these fantastic shoes. Each pair boasts a total of 4,600 gemstones including 1,350 carats of premium rubies and 50 carats of diamonds. You’ll be the talk of the town when you wear these slippers (not to mention the target of shoe thieves everywhere). Harry makes no promise about how comfortable these slippers are though";
		cut.setLongDiscription(LongDiscription);
		assertEquals(LongDiscription, cut.getLongDiscription());
	}
	@Test
	void getImage(){
		Product cut = new Product();
		String image = "url.com";
		cut.setImage(image);
		assertEquals(image, cut.getImage());
	}
	@Test
	void getPrice(){
		Product cut = new Product();
		Long price = 2L;
		cut.setPrice(price);
		assertEquals(price, cut.getPrice());
	}
	

}
