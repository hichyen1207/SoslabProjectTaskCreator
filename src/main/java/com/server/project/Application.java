package com.server.project;

import com.server.project.createtask.HouseToTask;
import com.server.project.createtask.TaskChecker;

public class Application {
	public static void main(String[] args) throws Exception {
		HouseToTask toTask = new HouseToTask();
		TaskChecker taskChecker = new TaskChecker();
		int id = taskChecker.checkWhereTaskStart();
		toTask.toTask(id);
	}
}