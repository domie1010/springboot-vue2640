package com.dao;

import com.entity.JinglidakaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JinglidakaVO;
import com.entity.view.JinglidakaView;


/**
 * 经理打卡
 * 
 * @author 
 * @email 
 * @date 2021-06-07 09:33:31
 */
public interface JinglidakaDao extends BaseMapper<JinglidakaEntity> {
	
	List<JinglidakaVO> selectListVO(@Param("ew") Wrapper<JinglidakaEntity> wrapper);
	
	JinglidakaVO selectVO(@Param("ew") Wrapper<JinglidakaEntity> wrapper);
	
	List<JinglidakaView> selectListView(@Param("ew") Wrapper<JinglidakaEntity> wrapper);

	List<JinglidakaView> selectListView(Pagination page,@Param("ew") Wrapper<JinglidakaEntity> wrapper);
	
	JinglidakaView selectView(@Param("ew") Wrapper<JinglidakaEntity> wrapper);
	
}
