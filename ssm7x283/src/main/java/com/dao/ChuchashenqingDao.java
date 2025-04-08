package com.dao;

import com.entity.ChuchashenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChuchashenqingVO;
import com.entity.view.ChuchashenqingView;


/**
 * 出差申请
 * 
 * @author 
 * @email 
 * @date 2021-06-07 09:33:31
 */
public interface ChuchashenqingDao extends BaseMapper<ChuchashenqingEntity> {
	
	List<ChuchashenqingVO> selectListVO(@Param("ew") Wrapper<ChuchashenqingEntity> wrapper);
	
	ChuchashenqingVO selectVO(@Param("ew") Wrapper<ChuchashenqingEntity> wrapper);
	
	List<ChuchashenqingView> selectListView(@Param("ew") Wrapper<ChuchashenqingEntity> wrapper);

	List<ChuchashenqingView> selectListView(Pagination page,@Param("ew") Wrapper<ChuchashenqingEntity> wrapper);
	
	ChuchashenqingView selectView(@Param("ew") Wrapper<ChuchashenqingEntity> wrapper);
	
}
