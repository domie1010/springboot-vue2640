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


import com.dao.GongzuojihuaDao;
import com.entity.GongzuojihuaEntity;
import com.service.GongzuojihuaService;
import com.entity.vo.GongzuojihuaVO;
import com.entity.view.GongzuojihuaView;

@Service("gongzuojihuaService")
public class GongzuojihuaServiceImpl extends ServiceImpl<GongzuojihuaDao, GongzuojihuaEntity> implements GongzuojihuaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongzuojihuaEntity> page = this.selectPage(
                new Query<GongzuojihuaEntity>(params).getPage(),
                new EntityWrapper<GongzuojihuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongzuojihuaEntity> wrapper) {
		  Page<GongzuojihuaView> page =new Query<GongzuojihuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongzuojihuaVO> selectListVO(Wrapper<GongzuojihuaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongzuojihuaVO selectVO(Wrapper<GongzuojihuaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongzuojihuaView> selectListView(Wrapper<GongzuojihuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongzuojihuaView selectView(Wrapper<GongzuojihuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
