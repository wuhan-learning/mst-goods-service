package com.thoughtworks.mstorderservice.service;

import com.thoughtworks.mstorderservice.dto.GoodsDTO;

import java.util.List;

public interface GoodsService {
    List<GoodsDTO> getGoods();
}
