package com.thoughtworks.mstorderservice.api;

import com.thoughtworks.mstorderservice.Repository.GoodRepository;
import com.thoughtworks.mstorderservice.entity.Goods;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Transactional
class GoodsControllerTest {

    @Autowired
    private WebApplicationContext wac;

    @Autowired
    private GoodRepository goodRepository;

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
        List<Goods> goods = Arrays.asList(
                Goods.builder().name("good1").description("good1").build(),
                Goods.builder().name("good2").description("good2").build(),
                Goods.builder().name("good3").description("good3").build()
        );
        goodRepository.deleteAll();
        goodRepository.save(goods);
    }

    @Test
    void should_return_all_goods() throws Exception {
        mockMvc.perform(get("/api/goods")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(3)));
    }
}