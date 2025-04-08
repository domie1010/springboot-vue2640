package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongzuojihuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongzuojihuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongzuojihuaView;


/**
 * 工作计划
 *
 * @author 
 * @email 
 * @date 2021-06-07 09:33:31
 */
public interface GongzuojihuaService extends IService<GongzuojihuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongzuojihuaVO> selectListVO(Wrapper<GongzuojihuaEntity> wrapper);
   	
   	GongzuojihuaVO selectVO(@Param("ew") Wrapper<GongzuojihuaEntity> wrapper);
   	
   	List<GongzuojihuaView> selectListView(Wrapper<GongzuojihuaEntity> wrapper);
   	
   	GongzuojihuaView selectView(@Param("ew") Wrapper<GongzuojihuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongzuojihuaEntity> wrapper);
   	
}

