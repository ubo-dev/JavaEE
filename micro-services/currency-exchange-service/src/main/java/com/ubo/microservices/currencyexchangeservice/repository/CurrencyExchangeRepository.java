package com.ubo.microservices.currencyexchangeservice.repository;

import com.ubo.microservices.currencyexchangeservice.bean.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long>
{
    CurrencyExchange findByFromAndTo(String from, String to);
}
