package com.thoughtworks.mstorderservice.api;

import com.thoughtworks.mstorderservice.dto.GoodsDTO;
import com.thoughtworks.mstorderservice.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<GoodsDTO> getGoods() {
        return goodService.getGoods();
    }
}
