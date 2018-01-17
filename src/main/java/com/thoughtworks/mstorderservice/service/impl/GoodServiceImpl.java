package com.thoughtworks.mstorderservice.service.impl;

import com.thoughtworks.mstorderservice.Repository.GoodsRepository;
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
    private GoodsRepository goodsRepository;

    @Override
    public List<GoodsDTO> getGoods() {
        List<Goods> goods = goodsRepository.findAll();
        return goods.stream()
                .map(good -> GoodsDTO.builder()
                        .name(good.getName())
                        .stockAmount(good.getStockAmount())
                        .description(good.getDescription())
                        .price(good.getPrice())
                        .build())
                .collect(Collectors.toList());
    }
}
