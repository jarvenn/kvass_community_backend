package com.hjw.kvass_community.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hjw.kvass_community.model.entity.BmsTip;
import org.springframework.stereotype.Repository;

@Repository
public interface BmsTipMapper extends BaseMapper<BmsTip> {
    BmsTip getRandomTip();
}
