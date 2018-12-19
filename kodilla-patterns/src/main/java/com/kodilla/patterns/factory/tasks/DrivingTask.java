package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    String taskName;
    String where;
    String using;
    Performance performance;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.performance = Performance.TODO;
    }

    @Override
    public void executeTask() {
        this.performance = Performance.DONE;;
    }

    @Override
    public String getTaskName() {
        return this.taskName;
    }


    @Override
    public boolean isTaskExecuted() {
        if (this.performance == Performance.DONE) {
            return true;
        } else return false;
    }

    public void setPerformance(Performance performance) {
        this.performance = performance;
    }
}
