package com.departmentapp.service;

public class HrDeptService extends SuperDeptService {

	public String departmentName() {

		return "Welcome to HR Department";

	}

	public String getTodaysWork() {

		return "Fill today’s Timesheet and Mark your Attendance";

	}

	public String getWorkDeadline() {

		return "Complete by EOD";

	}

	public String doActivity() {

		return "Team Lunch";
	}

}
