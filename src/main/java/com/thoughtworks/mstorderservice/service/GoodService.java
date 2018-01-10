package com.thoughtworks.mstorderservice.service;

import com.thoughtworks.mstorderservice.dto.GoodDTO;

import java.util.List;

public interface GoodService {
    List<GoodDTO> getGoods();
}
