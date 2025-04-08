package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 经理打卡
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-06-07 09:33:31
 */
@TableName("jinglidaka")
public class JinglidakaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JinglidakaEntity() {
		
	}
	
	public JinglidakaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 经理工号
	 */
					
	private String jingligonghao;
	
	/**
	 * 经理姓名
	 */
					
	private String jinglixingming;
	
	/**
	 * 体温
	 */
					
	private Float tiwen;
	
	/**
	 * 签到类型
	 */
					
	private String qiandaoleixing;
	
	/**
	 * 登记时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date dengjishijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：经理工号
	 */
	public void setJingligonghao(String jingligonghao) {
		this.jingligonghao = jingligonghao;
	}
	/**
	 * 获取：经理工号
	 */
	public String getJingligonghao() {
		return jingligonghao;
	}
	/**
	 * 设置：经理姓名
	 */
	public void setJinglixingming(String jinglixingming) {
		this.jinglixingming = jinglixingming;
	}
	/**
	 * 获取：经理姓名
	 */
	public String getJinglixingming() {
		return jinglixingming;
	}
	/**
	 * 设置：体温
	 */
	public void setTiwen(Float tiwen) {
		this.tiwen = tiwen;
	}
	/**
	 * 获取：体温
	 */
	public Float getTiwen() {
		return tiwen;
	}
	/**
	 * 设置：签到类型
	 */
	public void setQiandaoleixing(String qiandaoleixing) {
		this.qiandaoleixing = qiandaoleixing;
	}
	/**
	 * 获取：签到类型
	 */
	public String getQiandaoleixing() {
		return qiandaoleixing;
	}
	/**
	 * 设置：登记时间
	 */
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}

}
