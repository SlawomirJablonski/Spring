package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("lunch products", "vifon soupe", 2);
            case PAINTING:
                return new PaintingTask("room painting", "indygo", "wall");
            case DRIVING:
                return new DrivingTask("join war", "Kiev", "tank");
            default:
                return null;
        }
    }
}
