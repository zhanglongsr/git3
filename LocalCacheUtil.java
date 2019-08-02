package com.liepin.h.web.common.util;

import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 本地缓存，不设上限，谨慎使用
 * 
 * @author chengjun
 * 
 */
public class LocalCacheUtil {

    private static LocalCacheUtil instance = new LocalCacheUtil();

    private static final int initialCapacity = 1024;

    private ConcurrentHashMap<String, SoftReference<Object>> map;

    private LocalCacheUtil() {
        map = new ConcurrentHashMap<String, SoftReference<Object>>(initialCapacity);
    }

    public static LocalCacheUtil getInstance() {
        return instance;
    }

    public void set(String key, Object obj) {
        map.put(key, new SoftReference<Object>(obj));
    }

    public Object get(String key) {
        SoftReference<Object> softReference = map.get(key);
        return softReference == null ? null : softReference.get();
    }
}
