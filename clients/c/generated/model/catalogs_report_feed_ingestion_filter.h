/*
 * catalogs_report_feed_ingestion_filter.h
 *
 * 
 */

#ifndef _catalogs_report_feed_ingestion_filter_H_
#define _catalogs_report_feed_ingestion_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_report_feed_ingestion_filter_t catalogs_report_feed_ingestion_filter_t;


// Enum REPORTTYPE for catalogs_report_feed_ingestion_filter

typedef enum  { pinterest_rest_api_catalogs_report_feed_ingestion_filter_REPORTTYPE_NULL = 0, pinterest_rest_api_catalogs_report_feed_ingestion_filter_REPORTTYPE_FEED_INGESTION_ISSUES } pinterest_rest_api_catalogs_report_feed_ingestion_filter_REPORTTYPE_e;

char* catalogs_report_feed_ingestion_filter_report_type_ToString(pinterest_rest_api_catalogs_report_feed_ingestion_filter_REPORTTYPE_e report_type);

pinterest_rest_api_catalogs_report_feed_ingestion_filter_REPORTTYPE_e catalogs_report_feed_ingestion_filter_report_type_FromString(char* report_type);



typedef struct catalogs_report_feed_ingestion_filter_t {
    pinterest_rest_api_catalogs_report_feed_ingestion_filter_REPORTTYPE_e report_type; //enum
    char *feed_id; // string
    char *processing_result_id; // string

} catalogs_report_feed_ingestion_filter_t;

catalogs_report_feed_ingestion_filter_t *catalogs_report_feed_ingestion_filter_create(
    pinterest_rest_api_catalogs_report_feed_ingestion_filter_REPORTTYPE_e report_type,
    char *feed_id,
    char *processing_result_id
);

void catalogs_report_feed_ingestion_filter_free(catalogs_report_feed_ingestion_filter_t *catalogs_report_feed_ingestion_filter);

catalogs_report_feed_ingestion_filter_t *catalogs_report_feed_ingestion_filter_parseFromJSON(cJSON *catalogs_report_feed_ingestion_filterJSON);

cJSON *catalogs_report_feed_ingestion_filter_convertToJSON(catalogs_report_feed_ingestion_filter_t *catalogs_report_feed_ingestion_filter);

#endif /* _catalogs_report_feed_ingestion_filter_H_ */

