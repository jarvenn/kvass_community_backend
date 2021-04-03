package com.hjw.kvass_community.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hjw.kvass_community.mapper.BmsBillboardMapper;
import com.hjw.kvass_community.model.entity.BmsBillboard;
import com.hjw.kvass_community.service.IBmsBillboardService;
import org.springframework.stereotype.Service;

/**
 * Created by hjw on 2021/4/3 14:47
 */

@Service
public class IBmsBillboardServiceImpl
        extends ServiceImpl<BmsBillboardMapper, BmsBillboard>
        implements IBmsBillboardService {

}
