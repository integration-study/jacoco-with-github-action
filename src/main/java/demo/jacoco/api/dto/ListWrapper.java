package demo.jacoco.api.dto;

import java.util.List;

public record ListWrapper<T>(
        List<T> result
) {
}
