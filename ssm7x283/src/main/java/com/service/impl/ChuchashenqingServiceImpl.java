package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChuchashenqingDao;
import com.entity.ChuchashenqingEntity;
import com.service.ChuchashenqingService;
import com.entity.vo.ChuchashenqingVO;
import com.entity.view.ChuchashenqingView;

@Service("chuchashenqingService")
public class ChuchashenqingServiceImpl extends ServiceImpl<ChuchashenqingDao, ChuchashenqingEntity> implements ChuchashenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChuchashenqingEntity> page = this.selectPage(
                new Query<ChuchashenqingEntity>(params).getPage(),
                new EntityWrapper<ChuchashenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChuchashenqingEntity> wrapper) {
		  Page<ChuchashenqingView> page =new Query<ChuchashenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChuchashenqingVO> selectListVO(Wrapper<ChuchashenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChuchashenqingVO selectVO(Wrapper<ChuchashenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChuchashenqingView> selectListView(Wrapper<ChuchashenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChuchashenqingView selectView(Wrapper<ChuchashenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
