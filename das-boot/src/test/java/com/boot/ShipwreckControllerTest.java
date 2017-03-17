package com.boot;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.boot.controller.ShipwreckController;
import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;

public class ShipwreckControllerTest {

	@InjectMocks
	private ShipwreckController sc;
	
	@Mock
	private ShipwreckRepository shipwreckRepository;
	
	@Before
	public void before(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testShipwreckController(){
		Shipwreck sr = new Shipwreck();
		sr.setId(1l);
		when(shipwreckRepository.findOne(1l)).thenReturn(sr);
		
		Shipwreck shipwreck = sc.get(1l);
		

		assertEquals(1l,shipwreck.getId().longValue());
		
		verify(shipwreckRepository).findOne(1l);

	}
}
