package com.currcon.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;


import com.currcon.CurrencyConversionBean;


@FeignClient(name="currency-exchange-service")
@RibbonClient(name="currency-exchange-service")
//@FeignClient(name="currency-exchange-service", url="localhost:8881")
public interface CurrencyExchangeServiceProxy 
{
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);
}
