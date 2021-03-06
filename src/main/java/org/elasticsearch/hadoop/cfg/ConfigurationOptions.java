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
package org.elasticsearch.hadoop.cfg;

/**
 * Class providing the various Configuration parameters used by the ElasticSearch Hadoop integration.
 */
public interface ConfigurationOptions {

    /** ElasticSearch host **/
    String ES_HOST = "es.host";
    String ES_HOST_DEFAULT = "localhost";

    /** ElasticSearch port **/
    String ES_PORT = "es.port";
    String ES_PORT_DEFAULT = "9200";

    /** ElasticSearch index */
    String ES_RESOURCE = "es.resource";
    String ES_QUERY = "es.query";

    /** ElasticSearch batch size given in bytes */
    String ES_BATCH_SIZE_BYTES = "es.batch.size.bytes";
    String ES_BATCH_SIZE_BYTES_DEFAULT = "10mb";

    /** ElasticSearch batch size given in entries */
    String ES_BATCH_SIZE_ENTRIES = "es.batch.size.entries";
    String ES_BATCH_SIZE_ENTRIES_DEFAULT = "0";

    /** Whether to trigger an index refresh after doing batch writing */
    String ES_BATCH_WRITE_REFRESH = "es.batch.write.refresh";
    String ES_BATCH_WRITE_REFRESH_DEFAULT = "true";

    /** Http bulk retries **/
    String ES_BATCH_WRITE_RETRY_COUNT = "es.batch.write.retry.count";
    String ES_BATCH_WRITE_RETRY_COUNT_DEFAULT = "3";

    String ES_BATCH_WRITE_RETRY_WAIT = "es.batch.write.retry.wait";
    String ES_BATCH_WRITE_RETRY_WAIT_DEFAULT = "1m";

    String ES_BATCH_WRITE_RETRY_POLICY = "es.batch.write.retry.policy";
    String ES_BATCH_WRITE_RETRY_POLICY_NONE = "none";
    String ES_BATCH_WRITE_RETRY_POLICY_SIMPLE = "simple";
    String ES_BATCH_WRITE_RETRY_POLICY_DEFAULT = ES_BATCH_WRITE_RETRY_POLICY_SIMPLE;

    /** HTTP connection timeout */
    String ES_HTTP_TIMEOUT = "es.http.timeout";
    String ES_HTTP_TIMEOUT_DEFAULT = "1m";

    /** Scroll keep-alive */
    String ES_SCROLL_KEEPALIVE = "es.scroll.keepalive";
    String ES_SCROLL_KEEPALIVE_DEFAULT = "5m";

    /** Scroll size */
    String ES_SCROLL_SIZE = "es.scroll.size";
    String ES_SCROLL_SIZE_DEFAULT = "50";

    /** Scroll fields */
    String ES_SCROLL_FIELDS = "es.scroll.fields";

    /** Serialization settings */

    /** Value writer - setup automatically; can be overridden for custom types */
    String ES_SERIALIZATION_WRITER_CLASS = "es.ser.writer.class";

    /** Value reader - setup automatically; can be overridden for custom types */
    String ES_SERIALIZATION_READER_CLASS = "es.ser.reader.class";

    /** Index settings */
    String ES_INDEX_AUTO_CREATE = "es.index.auto.create";
    String ES_INDEX_AUTO_CREATE_DEFAULT = "yes";

    String ES_INDEX_READ_MISSING_AS_EMPTY = "es.index.read.missing.as.empty";
    String ES_INDEX_READ_MISSING_AS_EMPTY_DEFAULT = "false";

    /** Mapping types */
    String ES_MAPPING_DEFAULT_EXTRACTOR_CLASS = "es.mapping.default.extractor.class";

    String ES_MAPPING_ID = "es.mapping.id";
    String ES_MAPPING_ID_EXTRACTOR_CLASS = "es.mapping.id.extractor.class";
    String ES_MAPPING_PARENT = "es.mapping.parent";
    String ES_MAPPING_PARENT_EXTRACTOR_CLASS = "es.mapping.parent.extractor.class";
    String ES_MAPPING_VERSION = "es.mapping.version";
    String ES_MAPPING_VERSION_EXTRACTOR_CLASS = "es.mapping.version.extractor.class";
    String ES_MAPPING_ROUTING = "es.mapping.routing";
    String ES_MAPPING_ROUTING_EXTRACTOR_CLASS = "es.mapping.routing.extractor.class";
    String ES_MAPPING_TTL = "es.mapping.ttl";
    String ES_MAPPING_TTL_EXTRACTOR_CLASS = "es.mapping.ttl.extractor.class";
    String ES_MAPPING_TIMESTAMP = "es.mapping.timestamp";
    String ES_MAPPING_TIMESTAMP_EXTRACTOR_CLASS = "es.mapping.timestamp.extractor.class";

    /** Operation types */
    String ES_WRITE_OPERATION = "es.write.operation";
    String ES_OPERATION_INDEX = "index";
    String ES_OPERATION_CREATE = "create";
    String ES_OPERATION_UPDATE = "update";
    String ES_OPERATION_DELETE = "delete";
    String ES_WRITE_OPERATION_DEFAULT = ES_OPERATION_INDEX;

    String ES_UPSERT_DOC = "es.upsert.doc";
    String ES_UPSERT_DOC_DEFAULT = "true";
}