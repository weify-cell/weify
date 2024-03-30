package com.service.weify.interview;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class RateInfo {
    @NonNull
    private int maxHash;
    @NonNull
    private int minHash;
    @NonNull
    private int multiplier;
    @NonNull
    private int collisionCount;
    @NonNull
    private double collisionRate;
}
