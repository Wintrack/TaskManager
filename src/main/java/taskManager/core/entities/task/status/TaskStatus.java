package taskManager.core.entities.task.status;

import taskManager.core.entities.task.TaskEntities;

public abstract class TaskStatus {
    TaskEntities taskEntities;

    TaskStatus(TaskEntities taskEntities) {
        this.taskEntities = taskEntities;
    }

    public abstract String isDone();
    public abstract String isNotDone();
    public abstract String isCancel();
    public abstract String isInProgress();
}
