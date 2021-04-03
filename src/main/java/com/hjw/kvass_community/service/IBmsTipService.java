package com.hjw.kvass_community.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hjw.kvass_community.model.entity.BmsTip;

public interface IBmsTipService extends IService<BmsTip> {
    BmsTip getRandomTip();
}
