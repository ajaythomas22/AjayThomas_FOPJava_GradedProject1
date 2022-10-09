package com.departmentapp.main;

import com.departmentapp.service.AdminDeptService;
import com.departmentapp.service.HrDeptService;
import com.departmentapp.service.TechDeptService;

public class DepartmentAppDriver {

	public static void main(String[] args) {

		AdminDeptService adminDeptObj = new AdminDeptService();
		HrDeptService hrDeptObj = new HrDeptService();
		TechDeptService techDeptObj = new TechDeptService();
		System.out.println("------------------------------------------------");

		System.out.println(adminDeptObj.departmentName());
		System.out.println(adminDeptObj.getTodaysWork());
		System.out.println(adminDeptObj.getWorkDeadline());
		System.out.println(adminDeptObj.isTodayAHoliday());
		System.out.println("------------------------------------------------");

		System.out.println(hrDeptObj.departmentName());
		System.out.println(hrDeptObj.doActivity());
		System.out.println(hrDeptObj.getTodaysWork());
		System.out.println(hrDeptObj.getWorkDeadline());
		System.out.println(hrDeptObj.isTodayAHoliday());
		System.out.println("------------------------------------------------");

		System.out.println(techDeptObj.departmentName());
		System.out.println(techDeptObj.getTodaysWork());
		System.out.println(techDeptObj.getWorkDeadline());
		System.out.println(techDeptObj.getTechStackInformation());
		System.out.println(techDeptObj.isTodayAHoliday());
		System.out.println("------------------------------------------------");
	}

}
