package com.br.utils;

public class BRStatics {

	private static String createPath() {
		BRStatics brs = new BRStatics();
		String url = brs.getClass().getResource("").getPath();
		String path = url.substring(1,url.indexOf(".metadata"))+"semi-project/WebContent/image/"; 
		return path;
	}
	public static final String ROOT_PATH = createPath(); 
	public static final String ROOT_PATH_FOR_MAC = "/"+createPath();
}
