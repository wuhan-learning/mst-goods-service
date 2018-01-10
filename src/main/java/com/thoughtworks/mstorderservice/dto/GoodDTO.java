package com.thoughtworks.mstorderservice.dto;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GoodDTO {

    private String name;

    private String description;

    private Double price;

    private Integer amount;
}
