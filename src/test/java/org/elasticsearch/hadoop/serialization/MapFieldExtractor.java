/*
 * Copyright 2013 the original author or authors.
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
package org.elasticsearch.hadoop.serialization;

import java.util.Map;

import org.elasticsearch.hadoop.cfg.Settings;

public class MapFieldExtractor extends ConstantFieldExtractor {
    private String fieldName;

    @SuppressWarnings("rawtypes")
    @Override
    protected String extractField(Object target) {
        if (target instanceof Map) {
            Map map = (Map) target;
            Object w = map.get(fieldName);
            // since keys are likely primitives, just do a toString
            return (w != null ? w.toString() : null);
        }
        return null;
    }

    @Override
    public void setSettings(Settings settings) {
        super.setSettings(settings);
        fieldName = getFieldName();
    }
}
