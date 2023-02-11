package com.example.business;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequestDto {
    private Long customerId;
    private List<OrderRequestLineItemsDto> orderLineItemsDtoList;
}
