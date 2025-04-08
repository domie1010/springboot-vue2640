package com.entity.view;

import com.entity.JingliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 经理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-06-07 09:33:31
 */
@TableName("jingli")
public class JingliView  extends JingliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JingliView(){
	}
 
 	public JingliView(JingliEntity jingliEntity){
 	try {
			BeanUtils.copyProperties(this, jingliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
