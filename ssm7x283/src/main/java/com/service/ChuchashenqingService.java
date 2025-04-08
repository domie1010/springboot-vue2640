package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChuchashenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChuchashenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChuchashenqingView;


/**
 * 出差申请
 *
 * @author 
 * @email 
 * @date 2021-06-07 09:33:31
 */
public interface ChuchashenqingService extends IService<ChuchashenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChuchashenqingVO> selectListVO(Wrapper<ChuchashenqingEntity> wrapper);
   	
   	ChuchashenqingVO selectVO(@Param("ew") Wrapper<ChuchashenqingEntity> wrapper);
   	
   	List<ChuchashenqingView> selectListView(Wrapper<ChuchashenqingEntity> wrapper);
   	
   	ChuchashenqingView selectView(@Param("ew") Wrapper<ChuchashenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChuchashenqingEntity> wrapper);
   	
}

