/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.internal.operations;

import org.gradle.api.problems.interfaces.Problem;

import javax.annotation.Nullable;
import java.util.List;

public final class OperationFinishEvent {
    private final long startTime;
    private final long endTime;
    private final Throwable failure;
    private final Object result;
    private final List<Problem> problems;

    public OperationFinishEvent(long startTime, long endTime, @Nullable Throwable failure, @Nullable Object result, @Nullable List<Problem> problems) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.failure = failure;
        this.result = result;
        this.problems = problems;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    @Nullable
    public Throwable getFailure() {
        return failure;
    }

    @Nullable
    public Object getResult() {
        return result;
    }

    public List<Problem> getProblems() {
        return problems;
    }

    @Override
    public String toString() {
        return "OperationFinishEvent{" +
            "startTime=" + startTime +
            ", endTime=" + endTime +
            ", failure=" + failure +
            ", result=" + result +
            '}';
    }
}
