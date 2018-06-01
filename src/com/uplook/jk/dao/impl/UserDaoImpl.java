//用户接口实现类
package com.uplook.jk.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.uplook.jk.entity.UserInfo;
import com.uplook.jk.util.DBUtil;

public class UserDaoImpl {
    //编写三个属性 访问修饰符
	private Connection conn;//链接
	private PreparedStatement pstmt;//预处理
	private ResultSet rs;//结果集
	//添加用户的方法
	public int addUser(UserInfo user){
		//编写SQL语句
		String sql ="insert into tab_jk_user"
				+ "(username, password,sex,edu,"
				+ " mobile, prjtime,qq,"
				+ "school,major,stat,teacher,project,note)"
				+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		//连接数据库
		conn =DBUtil.getConnection();
		//预处理sql语句
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2,DBUtil.getMD5(user.getPassword().getBytes()));
			pstmt.setString(3, user.getSex());
			pstmt.setString(4, user.getEdu());
			pstmt.setString(5, user.getMobile());
			pstmt.setString(6, user.getPrjtime());
			pstmt.setString(7, user.getQq());
			pstmt.setString(8, user.getSchool());
			pstmt.setString(9, user.getMajor());
			pstmt.setString(10, user.getStat());
			pstmt.setString(11, user.getTeacher());
			pstmt.setString(12, user.getProject());
			pstmt.setString(13, user.getNote());
			return pstmt.executeUpdate();//执行更新
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{//关闭数据库
			//先开后关
			try {
				if(pstmt!=null){
					pstmt.close();
				}if(conn!=null){
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
	}
	
	//查找所有用户信息的方法
	public List<UserInfo> findAllUser(){
		List<UserInfo> list = new ArrayList<UserInfo>();
		//编写sql语句
		String sql = "select * from tab_jk_user";
		//获取链接
		conn = DBUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			//执行查询返回一个结果集
			rs = pstmt.executeQuery();
			while(rs.next()){
				UserInfo user = new UserInfo();
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setSex(rs.getString("sex"));
				user.setEdu(rs.getString("edu"));
				user.setQq(rs.getString("qq"));
				user.setMobile(rs.getString("mobile"));
				user.setMajor(rs.getString("major"));
				user.setPrjtime(rs.getString("prjtime"));
				user.setStat(rs.getString("stat"));
				user.setSchool(rs.getString("school"));
				user.setTeacher(rs.getString("teacher"));
				user.setProject(rs.getString("project"));
				user.setNote(rs.getString("note"));
				
				list.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				if (rs!=null) {
					rs.close();				
				}
				if (pstmt!=null) {
					pstmt.close();
				}
				if (conn!=null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
				return list;
	}
	public static void main(String[] arg){
		List<UserInfo> list = new UserDaoImpl().findAllUser();
		System.out.print(list.size());
	}
}
