package com.dao;

import com.entity.RichengxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RichengxinxiVO;
import com.entity.view.RichengxinxiView;


/**
 * 日程信息
 * 
 * @author 
 * @email 
 * @date 2021-06-07 09:33:31
 */
public interface RichengxinxiDao extends BaseMapper<RichengxinxiEntity> {
	
	List<RichengxinxiVO> selectListVO(@Param("ew") Wrapper<RichengxinxiEntity> wrapper);
	
	RichengxinxiVO selectVO(@Param("ew") Wrapper<RichengxinxiEntity> wrapper);
	
	List<RichengxinxiView> selectListView(@Param("ew") Wrapper<RichengxinxiEntity> wrapper);

	List<RichengxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<RichengxinxiEntity> wrapper);
	
	RichengxinxiView selectView(@Param("ew") Wrapper<RichengxinxiEntity> wrapper);
	
}
