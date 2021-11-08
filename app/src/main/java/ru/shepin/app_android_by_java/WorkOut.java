package ru.shepin.app_android_by_java;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Builder
public class WorkOut {
    String name;
    String description;

    public static final WorkOut[] workouts = {
            new WorkOut("The Limb Loosener", "5  Handstand push-ups\n10 1-legged squats"),
            new WorkOut("Core agony", "1  Handstand push-ups\n10 1-legged squats"),
            new WorkOut("The Wimp Special", "3  Handstand push-ups\n10 1-legged squats")
    };
}
