package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.crypto.Data;

public class ZipcodeRepo {
	private static List<ZipcodeResponse> DATA=new ArrayList<ZipcodeResponse>();
	private static Map<String,ZipcodeResponse> MAP=new HashMap<String,ZipcodeResponse>();
static {
	DATA.add(new ZipcodeResponse("TS","HYD","INDIA"));
	DATA.add(new ZipcodeResponse("AP","ONGOL","INDIA"));
	DATA.add(new ZipcodeResponse("AP","RJY","INDIA"));
}
static {
	MAP.put("500321",new ZipcodeResponse("TS","HYD","INDIA"));
	MAP.put("533226",new ZipcodeResponse("AP","ONGOL","INDIA"));
	MAP.put("533286",new ZipcodeResponse("AP","RJY","INDIA"));
	
}
public static Map<String,ZipcodeResponse> grtZipcodeResponse()
{
	return MAP;
}

}
