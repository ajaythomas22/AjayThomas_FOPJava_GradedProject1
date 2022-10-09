package com.departmentapp.service;

public class AdminDeptService extends SuperDeptService {

	public String departmentName() {

		return "Welcome to Admin Department";

	}

	public String getTodaysWork() {

		return "Complete your Documents Submission";

	}

	public String getWorkDeadline() {

		return "Complete by EOD";

	}

}
