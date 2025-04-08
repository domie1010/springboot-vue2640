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


import com.dao.JingliDao;
import com.entity.JingliEntity;
import com.service.JingliService;
import com.entity.vo.JingliVO;
import com.entity.view.JingliView;

@Service("jingliService")
public class JingliServiceImpl extends ServiceImpl<JingliDao, JingliEntity> implements JingliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingliEntity> page = this.selectPage(
                new Query<JingliEntity>(params).getPage(),
                new EntityWrapper<JingliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingliEntity> wrapper) {
		  Page<JingliView> page =new Query<JingliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingliVO> selectListVO(Wrapper<JingliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingliVO selectVO(Wrapper<JingliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingliView> selectListView(Wrapper<JingliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingliView selectView(Wrapper<JingliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
