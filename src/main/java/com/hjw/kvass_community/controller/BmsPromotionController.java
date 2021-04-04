package com.hjw.kvass_community.controller;

import com.hjw.kvass_community.common.api.ApiResult;
import com.hjw.kvass_community.model.entity.BmsPromotion;
import com.hjw.kvass_community.service.IBmsPromotionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/promotion")
public class BmsPromotionController extends BaseController {

    @Resource
    private IBmsPromotionService bmsPromotionService;

    @GetMapping("/all")
    public ApiResult<List<BmsPromotion>> list() {
        List<BmsPromotion> list = bmsPromotionService.list();
        return ApiResult.success(list);
    }

}
