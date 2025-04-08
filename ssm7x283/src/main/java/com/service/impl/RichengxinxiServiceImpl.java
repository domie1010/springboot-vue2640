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


import com.dao.RichengxinxiDao;
import com.entity.RichengxinxiEntity;
import com.service.RichengxinxiService;
import com.entity.vo.RichengxinxiVO;
import com.entity.view.RichengxinxiView;

@Service("richengxinxiService")
public class RichengxinxiServiceImpl extends ServiceImpl<RichengxinxiDao, RichengxinxiEntity> implements RichengxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RichengxinxiEntity> page = this.selectPage(
                new Query<RichengxinxiEntity>(params).getPage(),
                new EntityWrapper<RichengxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RichengxinxiEntity> wrapper) {
		  Page<RichengxinxiView> page =new Query<RichengxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RichengxinxiVO> selectListVO(Wrapper<RichengxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RichengxinxiVO selectVO(Wrapper<RichengxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RichengxinxiView> selectListView(Wrapper<RichengxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RichengxinxiView selectView(Wrapper<RichengxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
