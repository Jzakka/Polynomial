package org.example.work;

import org.example.Progress;

public abstract class Worker {
    String conditionalRegex;

    public Worker(String conditionalRegex) {
        this.conditionalRegex = conditionalRegex;
    }

    public void receiveWork(){
        if (String.valueOf(Progress.getCurrentDigit()).matches(conditionalRegex)) {
            work();
        }
    }

    public abstract void work();
}
