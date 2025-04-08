package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JinglidakaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JinglidakaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JinglidakaView;


/**
 * 经理打卡
 *
 * @author 
 * @email 
 * @date 2021-06-07 09:33:31
 */
public interface JinglidakaService extends IService<JinglidakaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JinglidakaVO> selectListVO(Wrapper<JinglidakaEntity> wrapper);
   	
   	JinglidakaVO selectVO(@Param("ew") Wrapper<JinglidakaEntity> wrapper);
   	
   	List<JinglidakaView> selectListView(Wrapper<JinglidakaEntity> wrapper);
   	
   	JinglidakaView selectView(@Param("ew") Wrapper<JinglidakaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JinglidakaEntity> wrapper);
   	
}

