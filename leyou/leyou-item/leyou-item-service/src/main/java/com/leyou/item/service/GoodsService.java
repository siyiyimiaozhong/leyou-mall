package com.leyou.item.service;

import com.leyou.common.pojo.PageResult;
import com.leyou.item.bo.SpuBO;
import com.leyou.item.pojo.Sku;
import com.leyou.item.pojo.Spu;
import com.leyou.item.pojo.SpuDetail;

import java.util.List;

public interface GoodsService {
    PageResult<SpuBO> querySpuByPage(String key, Boolean saleable, Integer page, Integer rows);

    void saveGoods(SpuBO spuBO);

    SpuDetail querySpuDetailBySpuId(Long spuId);

    List<Sku> querySkusBySpuId(Long spuId);

    void updateGoods(SpuBO spuBO);

    Spu querySpuById(Long id);

    Sku querySkuBySkuId(Long skuId);
}
