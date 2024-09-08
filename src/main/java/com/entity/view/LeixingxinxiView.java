package com.entity.view;

import com.entity.LeixingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 类型信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-29 17:16:24
 */
@TableName("leixingxinxi")
public class LeixingxinxiView  extends LeixingxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LeixingxinxiView(){
	}
 
 	public LeixingxinxiView(LeixingxinxiEntity leixingxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, leixingxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
