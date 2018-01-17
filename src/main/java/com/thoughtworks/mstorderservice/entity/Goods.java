package com.thoughtworks.mstorderservice.entity;

import lombok.*;

import javax.persistence.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "t_goods")
public class Goods {
    @Id
    @GeneratedValue
    private long id;

    private String name;

    private String description;

    private double price;

    private long stockAmount;
}
