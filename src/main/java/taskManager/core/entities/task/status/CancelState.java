package taskManager.core.entities.task.status;

import taskManager.core.entities.task.TaskEntities;

public class CancelState extends TaskStatus {
    CancelState(TaskEntities taskEntities) {
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
