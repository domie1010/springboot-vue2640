package com.dao;

import com.entity.GongzuojihuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongzuojihuaVO;
import com.entity.view.GongzuojihuaView;


/**
 * 工作计划
 * 
 * @author 
 * @email 
 * @date 2021-06-07 09:33:31
 */
public interface GongzuojihuaDao extends BaseMapper<GongzuojihuaEntity> {
	
	List<GongzuojihuaVO> selectListVO(@Param("ew") Wrapper<GongzuojihuaEntity> wrapper);
	
	GongzuojihuaVO selectVO(@Param("ew") Wrapper<GongzuojihuaEntity> wrapper);
	
	List<GongzuojihuaView> selectListView(@Param("ew") Wrapper<GongzuojihuaEntity> wrapper);

	List<GongzuojihuaView> selectListView(Pagination page,@Param("ew") Wrapper<GongzuojihuaEntity> wrapper);
	
	GongzuojihuaView selectView(@Param("ew") Wrapper<GongzuojihuaEntity> wrapper);
	
}
