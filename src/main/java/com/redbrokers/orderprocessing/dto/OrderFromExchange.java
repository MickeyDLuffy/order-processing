package com.redbrokers.orderprocessing.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.redbrokers.orderprocessing.enums.Exchange;
import lombok.Builder;
import lombok.Value;

import java.io.Serializable;

@Value
@Builder(toBuilder = true)
@JsonDeserialize(builder = OrderFromExchange.OrderFromExchangeBuilder.class)
public class OrderFromExchange implements Serializable {
     Exchange exchange;
     OrderProcessObject orders;

    @JsonPOJOBuilder(withPrefix = "")
    public static class OrderFromExchangeBuilder {}
}
