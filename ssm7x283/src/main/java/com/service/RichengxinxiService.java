package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RichengxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RichengxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RichengxinxiView;


/**
 * 日程信息
 *
 * @author 
 * @email 
 * @date 2021-06-07 09:33:31
 */
public interface RichengxinxiService extends IService<RichengxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RichengxinxiVO> selectListVO(Wrapper<RichengxinxiEntity> wrapper);
   	
   	RichengxinxiVO selectVO(@Param("ew") Wrapper<RichengxinxiEntity> wrapper);
   	
   	List<RichengxinxiView> selectListView(Wrapper<RichengxinxiEntity> wrapper);
   	
   	RichengxinxiView selectView(@Param("ew") Wrapper<RichengxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RichengxinxiEntity> wrapper);
   	
}

