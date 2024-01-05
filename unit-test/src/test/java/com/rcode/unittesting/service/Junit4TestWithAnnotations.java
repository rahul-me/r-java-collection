package com.rcode.unittesting.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.rcode.unittesting.data.SomeDataService;

@RunWith(MockitoJUnitRunner.class)
public class Junit4TestWithAnnotations {

	@InjectMocks
	SomeBusinessService service = new SomeBusinessService();
	
	@Mock
	SomeDataService dataService;
	
	
	@Test
	public void testCalculateSum() {
		
		
		when(dataService.retriveAllData()).thenReturn(new int[] {1,2,3});
		assertEquals(6, service.calculateSumUsingDataService());
	}
	
}

