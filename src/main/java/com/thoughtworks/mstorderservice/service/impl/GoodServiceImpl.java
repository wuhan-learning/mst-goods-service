package com.thoughtworks.mstorderservice.service.impl;

import com.thoughtworks.mstorderservice.Repository.GoodRepository;
import com.thoughtworks.mstorderservice.dto.GoodsDTO;
import com.thoughtworks.mstorderservice.entity.Goods;
import com.thoughtworks.mstorderservice.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GoodServiceImpl implements GoodService {
    @Autowired
    private GoodRepository goodRepository;

    @Override
    public List<GoodsDTO> getGoods() {
        List<Goods> goods = goodRepository.findAll();
        return goods.stream()
                .map(good -> GoodsDTO.builder()
                        .name(good.getName())
                        .amount(good.getAmount())
                        .description(good.getDescription())
                        .price(good.getPrice())
                        .build())
                .collect(Collectors.toList());
    }
}
