package com.hjw.kvass_community.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.hjw.kvass_community.common.api.ApiResult;
import com.hjw.kvass_community.model.entity.BmsBillboard;
import com.hjw.kvass_community.service.IBmsBillboardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by hjw on 2021/4/3 14:55
 */

@RestController
@RequestMapping("/billboard")
public class BmsBillboardController extends  BaseController {

    @Resource
    private IBmsBillboardService bmsBillboardService;

    @GetMapping("/show")
    public ApiResult<BmsBillboard> getNotices(){
        List<BmsBillboard> list = bmsBillboardService.list(new
                LambdaQueryWrapper<BmsBillboard>().eq(BmsBillboard::isShow,true));

        return ApiResult.success(list.get(list.size()-1));
    }

}
