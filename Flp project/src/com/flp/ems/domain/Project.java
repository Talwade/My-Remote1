package com.flp.ems.domain;

public class Project {

	private String project_name;
	private String proj_id;
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getProj_id() {
		return proj_id;
	}
	public void setProj_id(String proj_id) {
		this.proj_id = proj_id;
	}
	@Override
	public String toString() {
		return "Project [project_name=" + project_name + "]";
	}

	
	
	/*public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}
*/
	
	
	
}
