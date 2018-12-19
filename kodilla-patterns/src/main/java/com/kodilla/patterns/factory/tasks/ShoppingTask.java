package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    String taskName;
    String whatToBuy;
    double quantity;
    Performance performance;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        this.performance = Performance.TODO;
    }

    @Override
    public void executeTask(){
        this.performance = Performance.DONE;
    }

    @Override
    public String getTaskName(){
        return this.taskName;
    }


    @Override
    public boolean isTaskExecuted(){
        if (this.performance == Performance.DONE) {
            return true;
        } else return false;
    }
}
