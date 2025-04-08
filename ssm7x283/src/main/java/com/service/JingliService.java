package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingliView;


/**
 * 经理
 *
 * @author 
 * @email 
 * @date 2021-06-07 09:33:31
 */
public interface JingliService extends IService<JingliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingliVO> selectListVO(Wrapper<JingliEntity> wrapper);
   	
   	JingliVO selectVO(@Param("ew") Wrapper<JingliEntity> wrapper);
   	
   	List<JingliView> selectListView(Wrapper<JingliEntity> wrapper);
   	
   	JingliView selectView(@Param("ew") Wrapper<JingliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingliEntity> wrapper);
   	
}

