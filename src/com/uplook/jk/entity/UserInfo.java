package com.uplook.jk.entity;
//编写十三个属性
public class UserInfo {
  private String username;
  private String password;
  private String sex;
  private String  edu;
  private String mobile;
  private String prjtime;
  private String qq;
  private String school;
  private String major;
  private String stat;
  private String teacher="丁老师";
  private String project="实训";
  private String note;
  //get  set  alt+shift+s+r
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getEdu() {
	return edu;
}
public void setEdu(String edu) {
	this.edu = edu;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getPrjtime() {
	return prjtime;
}
public void setPrjtime(String prjtime) {
	this.prjtime = prjtime;
}
public String getQq() {
	return qq;
}
public void setQq(String qq) {
	this.qq = qq;
}
public String getSchool() {
	return school;
}
public void setSchool(String school) {
	this.school = school;
}
public String getMajor() {
	return major;
}
public void setMajor(String major) {
	this.major = major;
}
public String getStat() {
	return stat;
}
public void setStat(String stat) {
	this.stat = stat;
}
public String getTeacher() {
	return teacher;
}
public void setTeacher(String teacher) {
	this.teacher = teacher;
}
public String getProject() {
	return project;
}
public void setProject(String project) {
	this.project = project;
}
public String getNote() {
	return note;
}
public void setNote(String note) {
	this.note = note;
}
  //生成无参构造 alt+/
public UserInfo() {
	// TODO Auto-generated constructor stub
}
//生成有参构造 alt+shift+s+o
public UserInfo(String username, String password, String sex, String edu, String mobile, String prjtime, String qq,
		String school, String major, String stat) {
	super();
	this.username = username;
	this.password = password;
	this.sex = sex;
	this.edu = edu;
	this.mobile = mobile;
	this.prjtime = prjtime;
	this.qq = qq;
	this.school = school;
	this.major = major;
	this.stat = stat;
}


}
