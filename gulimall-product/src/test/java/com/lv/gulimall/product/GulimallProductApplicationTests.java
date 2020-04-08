package com.lv.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lv.gulimall.product.entity.BrandEntity;
import com.lv.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("Apple brand");
//        brandEntity.setName("Apple");
//        brandService.save(brandEntity);
//        System.out.println("save successfully");
//        brandService.updateById(brandEntity);

        List<BrandEntity> brandEntities = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        brandEntities.forEach((item) ->{
            System.out.println(item);
        });
    }


}
