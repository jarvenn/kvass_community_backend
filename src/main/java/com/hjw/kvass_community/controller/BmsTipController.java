package com.hjw.kvass_community.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.hjw.kvass_community.common.api.ApiResult;
import com.hjw.kvass_community.model.entity.BmsBillboard;
import com.hjw.kvass_community.model.entity.BmsTip;
import com.hjw.kvass_community.service.IBmsBillboardService;
import com.hjw.kvass_community.service.IBmsTipService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/tip")
public class BmsTipController extends BaseController {
    @Resource
    private IBmsTipService bmsTipService;

    @GetMapping("/today")
    public ApiResult<BmsTip> getRandomTip() {
        BmsTip tip = bmsTipService.getRandomTip();
        return ApiResult.success(tip);
    }
}
