package com.bwf.hsj;

import java.io.UnsupportedEncodingException;

public class FirstGit {
	public static void main(String[] args) {
		System.out.println("hello world");
		try {
			System.out.println(new String("ÄãºÃ£¬ÊÀ½ç£¡".getBytes("UTF-8"),"GBK"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
