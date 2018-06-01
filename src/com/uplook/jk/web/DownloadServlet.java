package com.uplook.jk.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DownloadServlet
 */
public class DownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.print("正在下载");
		File file = new File("c:/计算机二班.xls");
		try {
			download(response,file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void download(HttpServletResponse response, File file) throws Exception {
		response.reset();
		//设置字符集
		response.setContentType("APPLICATION/OCTET-STREAM");
		//filename是中文，可能会出现乱码，以下方式进行转码
		String filename = response.encodeURL(new String(file.getName().getBytes("GB2312"),"iso8859-1"));
		//设置返回页面的meta值，Content-Disposition是属性名，attachment表示以附件形式下载，如果是在页面中打开，将attachment改为inline.
		response.setHeader("Content-Disposition", "attachment;filename=\""+filename+"\"");
		ServletOutputStream sos =response.getOutputStream();
		InputStream is = new FileInputStream(file);
		//在bufferedinputStream里面的默认数组的字节大小就是8192
		byte[] b = new byte[8192];
		int length;
		while ((length=is.read(b))>0){
			sos.write(b,0,length);
		}
		sos.flush();
		sos.close();
		is.close();
	}

}
