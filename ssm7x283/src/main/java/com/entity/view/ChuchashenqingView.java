package com.entity.view;

import com.entity.ChuchashenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 出差申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-06-07 09:33:31
 */
@TableName("chuchashenqing")
public class ChuchashenqingView  extends ChuchashenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChuchashenqingView(){
	}
 
 	public ChuchashenqingView(ChuchashenqingEntity chuchashenqingEntity){
 	try {
			BeanUtils.copyProperties(this, chuchashenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
