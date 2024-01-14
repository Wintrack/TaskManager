package taskManager.core.entities.task.status;

import taskManager.core.entities.task.TaskEntities;

public class DefaultState extends TaskStatus {
    DefaultState(TaskEntities taskEntities) {
        super(taskEntities);
    }

    @Override
    public String isDone() {
        return null;
    }

    @Override
    public String isNotDone() {
        return null;
    }

    @Override
    public String isCancel() {
        return null;
    }

    @Override
    public String isInProgress() {
        return null;
    }
}