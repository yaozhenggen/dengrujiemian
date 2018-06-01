package com.uplook.jk.web;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


import com.uplook.jk.dao.impl.UserDaoImpl;
import com.uplook.jk.entity.UserInfo;
public class ExportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("正在导出。。。");
		//设置字符集
		response.setContentType("text/html;charset=utf-8");
		//创建文件
		 File file =new File("c:/计算机四班.xls");
		//文件输出流
	
		FileOutputStream fos =new FileOutputStream(file);
	
		/*//刷新缓冲区
		fos.flush();*/
		//创建工作薄
		HSSFWorkbook book =new HSSFWorkbook(); 
		//创建工作表
		HSSFSheet sheet =book.createSheet();
		//创建行
		int r=0,c=0;
		HSSFRow row=sheet.createRow(r++);
		HSSFCell cell=null;
		String[] headers={"用户名","密码","性别","学历","学校","QQ号码","手机号码",
				"实训日期","专业","状态","实训老师",
				"项目内容","备注"};
		int[] column ={3000,5000,1000,2000,3000,4000,5000,5000,3000,2000,3000,2000,2000};
		for(int i=0;i<headers.length;i++){
			cell = row.createCell(c++);
			cell.setCellValue(headers[i]);
			sheet.setColumnWidth(i, column[i]);
		}
		List<UserInfo> list =new UserDaoImpl().findAllUser();
		for(int i=0;i<list.size();i++){
			UserInfo user=list.get(i);
			row=sheet.createRow(r++);
			c=0;
		    cell=row.createCell(c++);
		    cell.setCellValue(user.getUsername());
		    cell=row.createCell(c++);
		    cell.setCellValue(user.getPassword());
		    cell=row.createCell(c++);
		    cell.setCellValue(user.getSex());
		    cell=row.createCell(c++);
		    cell.setCellValue(user.getEdu());
		    cell=row.createCell(c++);
		    cell.setCellValue(user.getSchool());
		    cell=row.createCell(c++);
		    cell.setCellValue(user.getQq());
		    cell=row.createCell(c++);
		    cell.setCellValue(user.getMobile());
		    cell=row.createCell(c++);
		    cell.setCellValue(user.getPrjtime());
		    cell=row.createCell(c++);
		    cell.setCellValue(user.getMajor());
		    cell=row.createCell(c++);
		    cell.setCellValue(user.getProject());
		    cell=row.createCell(c++);
		    cell.setCellValue(user.getStat());
		    cell=row.createCell(c++);
		    cell.setCellValue(user.getTeacher());
		    cell=row.createCell(c++);
		    cell.setCellValue(user.getNote());
		}
		book.write(fos);
		fos.flush();
		if(fos!=null){
         fos.close();			
		}
		PrintWriter pw=response.getWriter();
		pw.print("<h2>导出成功！</h2><a href='download.python'>点击下载</a>");
	}

}
