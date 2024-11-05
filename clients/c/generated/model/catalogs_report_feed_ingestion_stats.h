/*
 * catalogs_report_feed_ingestion_stats.h
 *
 * 
 */

#ifndef _catalogs_report_feed_ingestion_stats_H_
#define _catalogs_report_feed_ingestion_stats_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_report_feed_ingestion_stats_t catalogs_report_feed_ingestion_stats_t;


// Enum REPORTTYPE for catalogs_report_feed_ingestion_stats

typedef enum  { pinterest_rest_api_catalogs_report_feed_ingestion_stats_REPORTTYPE_NULL = 0, pinterest_rest_api_catalogs_report_feed_ingestion_stats_REPORTTYPE_FEED_INGESTION_ISSUES } pinterest_rest_api_catalogs_report_feed_ingestion_stats_REPORTTYPE_e;

char* catalogs_report_feed_ingestion_stats_report_type_ToString(pinterest_rest_api_catalogs_report_feed_ingestion_stats_REPORTTYPE_e report_type);

pinterest_rest_api_catalogs_report_feed_ingestion_stats_REPORTTYPE_e catalogs_report_feed_ingestion_stats_report_type_FromString(char* report_type);

// Enum SEVERITY for catalogs_report_feed_ingestion_stats

typedef enum  { pinterest_rest_api_catalogs_report_feed_ingestion_stats_SEVERITY_NULL = 0, pinterest_rest_api_catalogs_report_feed_ingestion_stats_SEVERITY_WARN, pinterest_rest_api_catalogs_report_feed_ingestion_stats_SEVERITY_ERROR } pinterest_rest_api_catalogs_report_feed_ingestion_stats_SEVERITY_e;

char* catalogs_report_feed_ingestion_stats_severity_ToString(pinterest_rest_api_catalogs_report_feed_ingestion_stats_SEVERITY_e severity);

pinterest_rest_api_catalogs_report_feed_ingestion_stats_SEVERITY_e catalogs_report_feed_ingestion_stats_severity_FromString(char* severity);



typedef struct catalogs_report_feed_ingestion_stats_t {
    pinterest_rest_api_catalogs_report_feed_ingestion_stats_REPORTTYPE_e report_type; //enum
    char *catalog_id; // string
    int code; //numeric
    char *code_label; // string
    char *message; // string
    int occurrences; //numeric
    pinterest_rest_api_catalogs_report_feed_ingestion_stats_SEVERITY_e severity; //enum

} catalogs_report_feed_ingestion_stats_t;

catalogs_report_feed_ingestion_stats_t *catalogs_report_feed_ingestion_stats_create(
    pinterest_rest_api_catalogs_report_feed_ingestion_stats_REPORTTYPE_e report_type,
    char *catalog_id,
    int code,
    char *code_label,
    char *message,
    int occurrences,
    pinterest_rest_api_catalogs_report_feed_ingestion_stats_SEVERITY_e severity
);

void catalogs_report_feed_ingestion_stats_free(catalogs_report_feed_ingestion_stats_t *catalogs_report_feed_ingestion_stats);

catalogs_report_feed_ingestion_stats_t *catalogs_report_feed_ingestion_stats_parseFromJSON(cJSON *catalogs_report_feed_ingestion_statsJSON);

cJSON *catalogs_report_feed_ingestion_stats_convertToJSON(catalogs_report_feed_ingestion_stats_t *catalogs_report_feed_ingestion_stats);

#endif /* _catalogs_report_feed_ingestion_stats_H_ */

