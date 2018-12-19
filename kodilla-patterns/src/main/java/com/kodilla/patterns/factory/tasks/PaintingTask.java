package com.kodilla.patterns.factory.tasks;
//
public class PaintingTask implements Task {
    String taskName;
    String color;
    String whatToPaint;
    Performance performance;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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
}
