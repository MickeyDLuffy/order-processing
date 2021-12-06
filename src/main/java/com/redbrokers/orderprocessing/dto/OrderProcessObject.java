package com.redbrokers.orderprocessing.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
@JsonDeserialize(builder = OrderProcessObject.OrderProcessObjectBuilder.class)
public class OrderProcessObject {
    private Side side;
    private TickerWithOrders tickerWithOrders;


    @JsonPOJOBuilder(withPrefix = "")
    public static class OrderProcessObjectBuilder {}
}
