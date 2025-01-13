package com.gsenc.chatbot.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.binding.MapperMethod.ParamMap;
import org.apache.ibatis.mapping.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsenc.chatbot.map.HrMap;

@Service
public class ChatbotAPIService {
	
	@Autowired
	HrMap  hrMap;
 
	public List<Map> getTotalList(ParamMap paramMap) {
		List<Map> list = hrMap.list(paramMap);
		for(Map singlelist : list) {						
				System.out.println(singlelist.values());			
		}
		return list;
	}
}
