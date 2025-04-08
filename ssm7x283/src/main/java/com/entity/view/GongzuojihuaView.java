package com.entity.view;

import com.entity.GongzuojihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 工作计划
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-06-07 09:33:31
 */
@TableName("gongzuojihua")
public class GongzuojihuaView  extends GongzuojihuaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GongzuojihuaView(){
	}
 
 	public GongzuojihuaView(GongzuojihuaEntity gongzuojihuaEntity){
 	try {
			BeanUtils.copyProperties(this, gongzuojihuaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
