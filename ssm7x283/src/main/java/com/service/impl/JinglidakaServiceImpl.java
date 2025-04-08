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


import com.dao.JinglidakaDao;
import com.entity.JinglidakaEntity;
import com.service.JinglidakaService;
import com.entity.vo.JinglidakaVO;
import com.entity.view.JinglidakaView;

@Service("jinglidakaService")
public class JinglidakaServiceImpl extends ServiceImpl<JinglidakaDao, JinglidakaEntity> implements JinglidakaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JinglidakaEntity> page = this.selectPage(
                new Query<JinglidakaEntity>(params).getPage(),
                new EntityWrapper<JinglidakaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JinglidakaEntity> wrapper) {
		  Page<JinglidakaView> page =new Query<JinglidakaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JinglidakaVO> selectListVO(Wrapper<JinglidakaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JinglidakaVO selectVO(Wrapper<JinglidakaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JinglidakaView> selectListView(Wrapper<JinglidakaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JinglidakaView selectView(Wrapper<JinglidakaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
