package com.attilax.collectionl;

import java.util.Collection;
import java.util.List;

/**
 *
 * 计数聚合操作
 *
 * Created by Brandon on 2016/7/21.
 */
public class CountAggregator<T> implements Aggregator<T> {

    @Override
    public Object aggregate(Object key, Collection<T> values) {
        return values.size();
    }
}

 