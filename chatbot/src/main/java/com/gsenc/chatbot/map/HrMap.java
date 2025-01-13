package com.gsenc.chatbot.map;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.binding.MapperMethod.ParamMap;
import org.apache.ibatis.mapping.ResultMap;

@Mapper
public interface HrMap {
	List<Map> list(ParamMap paramMap);

}
