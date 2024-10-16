package com.ust.department_service.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@NoArgsConstructor
//@AllArgsConstructor
//@Data

public class DepartmentPojo {
		private long deptId;
		private String deptName;
		private List<EmployeePojo> allEmp;
		public long getDeptId() {
			return deptId;
		}
		public void setDeptId(long deptId) {
			this.deptId = deptId;
		}
		public String getDeptName() {
			return deptName;
		}
		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}
		public List<EmployeePojo> getAllEmp() {
			return allEmp;
		}
		public void setAllEmp(List<EmployeePojo> allEmp) {
			this.allEmp = allEmp;
		}
		public DepartmentPojo(long deptId, String deptName, List<EmployeePojo> allEmp) {
			super();
			this.deptId = deptId;
			this.deptName = deptName;
			this.allEmp = allEmp;
		}
		public DepartmentPojo() {
			super();
			// TODO Auto-generated constructor stub
		}
		
}
