package com.sunchaser.mojian.util;

import org.springframework.beans.BeanUtils;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;

import static com.sunchaser.mojian.base.Constants.StringConstants.EMPTY;

/**
 * @author sunchaser admin@lilu.org.cn
 * @since JDK8 2021/10/26
 */
public class Optionals {
    private Optionals() {
    }

    public static Integer of(Integer i) {
        return Optional.ofNullable(i).orElse(0);
    }

    public static Integer of(Integer i, Integer defaultValue) {
        return Optional.ofNullable(i).orElse(defaultValue);
    }

    public static Long of(Long l) {
        return Optional.ofNullable(l).orElse(0L);
    }

    public static Long of(Long l, Long defaultValue) {
        return Optional.ofNullable(l).orElse(defaultValue);
    }

    public static String of(String str) {
        return Optional.ofNullable(str).orElse(EMPTY);
    }

    public static String of(String str, String defaultValue) {
        return Optional.ofNullable(str).orElse(defaultValue);
    }

    public static <T> Collection<T> of(Collection<T> col) {
        return Optional.ofNullable(col).orElseGet(Collections::emptyList);
    }

    public static <K, V> Map<K, V> of(Map<K, V> map) {
        return Optional.ofNullable(map).orElseGet(Collections::emptyMap);
    }

    public static <T> T of(T t, Class<T> clazz) {
        return Optional.ofNullable(t).orElseGet(() -> BeanUtils.instantiateClass(clazz));
    }

    public static <T> T of(T t, T defaultValue) {
        return Optional.ofNullable(t).orElse(defaultValue);
    }
}
