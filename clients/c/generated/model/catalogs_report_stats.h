/*
 * catalogs_report_stats.h
 *
 * Diagnostics aggregated numbers
 */

#ifndef _catalogs_report_stats_H_
#define _catalogs_report_stats_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_report_stats_t catalogs_report_stats_t;

#include "catalogs_report_distribution_stats.h"
#include "catalogs_report_feed_ingestion_stats.h"

// Enum REPORTTYPE for catalogs_report_stats

typedef enum  { pinterest_rest_api_catalogs_report_stats_REPORTTYPE_NULL = 0, pinterest_rest_api_catalogs_report_stats_REPORTTYPE_FEED_INGESTION_ISSUES, pinterest_rest_api_catalogs_report_stats_REPORTTYPE_DISTRIBUTION_ISSUES } pinterest_rest_api_catalogs_report_stats_REPORTTYPE_e;

char* catalogs_report_stats_report_type_ToString(pinterest_rest_api_catalogs_report_stats_REPORTTYPE_e report_type);

pinterest_rest_api_catalogs_report_stats_REPORTTYPE_e catalogs_report_stats_report_type_FromString(char* report_type);

// Enum SEVERITY for catalogs_report_stats

typedef enum  { pinterest_rest_api_catalogs_report_stats_SEVERITY_NULL = 0, pinterest_rest_api_catalogs_report_stats_SEVERITY_WARN, pinterest_rest_api_catalogs_report_stats_SEVERITY_ERROR } pinterest_rest_api_catalogs_report_stats_SEVERITY_e;

char* catalogs_report_stats_severity_ToString(pinterest_rest_api_catalogs_report_stats_SEVERITY_e severity);

pinterest_rest_api_catalogs_report_stats_SEVERITY_e catalogs_report_stats_severity_FromString(char* severity);



typedef struct catalogs_report_stats_t {
    pinterest_rest_api_catalogs_report_stats_REPORTTYPE_e report_type; //enum
    char *catalog_id; // string
    int code; //numeric
    char *code_label; // string
    char *message; // string
    int occurrences; //numeric
    pinterest_rest_api_catalogs_report_stats_SEVERITY_e severity; //enum
    int ineligible_for_ads; //boolean
    int ineligible_for_organic; //boolean

} catalogs_report_stats_t;

catalogs_report_stats_t *catalogs_report_stats_create(
    pinterest_rest_api_catalogs_report_stats_REPORTTYPE_e report_type,
    char *catalog_id,
    int code,
    char *code_label,
    char *message,
    int occurrences,
    pinterest_rest_api_catalogs_report_stats_SEVERITY_e severity,
    int ineligible_for_ads,
    int ineligible_for_organic
);

void catalogs_report_stats_free(catalogs_report_stats_t *catalogs_report_stats);

catalogs_report_stats_t *catalogs_report_stats_parseFromJSON(cJSON *catalogs_report_statsJSON);

cJSON *catalogs_report_stats_convertToJSON(catalogs_report_stats_t *catalogs_report_stats);

#endif /* _catalogs_report_stats_H_ */

