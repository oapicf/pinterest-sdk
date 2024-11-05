/*
 * catalogs_report_distribution_stats.h
 *
 * 
 */

#ifndef _catalogs_report_distribution_stats_H_
#define _catalogs_report_distribution_stats_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_report_distribution_stats_t catalogs_report_distribution_stats_t;


// Enum REPORTTYPE for catalogs_report_distribution_stats

typedef enum  { pinterest_rest_api_catalogs_report_distribution_stats_REPORTTYPE_NULL = 0, pinterest_rest_api_catalogs_report_distribution_stats_REPORTTYPE_DISTRIBUTION_ISSUES } pinterest_rest_api_catalogs_report_distribution_stats_REPORTTYPE_e;

char* catalogs_report_distribution_stats_report_type_ToString(pinterest_rest_api_catalogs_report_distribution_stats_REPORTTYPE_e report_type);

pinterest_rest_api_catalogs_report_distribution_stats_REPORTTYPE_e catalogs_report_distribution_stats_report_type_FromString(char* report_type);



typedef struct catalogs_report_distribution_stats_t {
    pinterest_rest_api_catalogs_report_distribution_stats_REPORTTYPE_e report_type; //enum
    char *catalog_id; // string
    int code; //numeric
    char *code_label; // string
    char *message; // string
    int occurrences; //numeric
    int ineligible_for_ads; //boolean
    int ineligible_for_organic; //boolean

} catalogs_report_distribution_stats_t;

catalogs_report_distribution_stats_t *catalogs_report_distribution_stats_create(
    pinterest_rest_api_catalogs_report_distribution_stats_REPORTTYPE_e report_type,
    char *catalog_id,
    int code,
    char *code_label,
    char *message,
    int occurrences,
    int ineligible_for_ads,
    int ineligible_for_organic
);

void catalogs_report_distribution_stats_free(catalogs_report_distribution_stats_t *catalogs_report_distribution_stats);

catalogs_report_distribution_stats_t *catalogs_report_distribution_stats_parseFromJSON(cJSON *catalogs_report_distribution_statsJSON);

cJSON *catalogs_report_distribution_stats_convertToJSON(catalogs_report_distribution_stats_t *catalogs_report_distribution_stats);

#endif /* _catalogs_report_distribution_stats_H_ */

