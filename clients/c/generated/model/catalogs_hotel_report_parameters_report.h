/*
 * catalogs_hotel_report_parameters_report.h
 *
 * 
 */

#ifndef _catalogs_hotel_report_parameters_report_H_
#define _catalogs_hotel_report_parameters_report_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_hotel_report_parameters_report_t catalogs_hotel_report_parameters_report_t;

#include "catalogs_report_distribution_issue_filter.h"
#include "catalogs_report_feed_ingestion_filter.h"

// Enum REPORTTYPE for catalogs_hotel_report_parameters_report

typedef enum  { pinterest_rest_api_catalogs_hotel_report_parameters_report_REPORTTYPE_NULL = 0, pinterest_rest_api_catalogs_hotel_report_parameters_report_REPORTTYPE_FEED_INGESTION_ISSUES, pinterest_rest_api_catalogs_hotel_report_parameters_report_REPORTTYPE_DISTRIBUTION_ISSUES } pinterest_rest_api_catalogs_hotel_report_parameters_report_REPORTTYPE_e;

char* catalogs_hotel_report_parameters_report_report_type_ToString(pinterest_rest_api_catalogs_hotel_report_parameters_report_REPORTTYPE_e report_type);

pinterest_rest_api_catalogs_hotel_report_parameters_report_REPORTTYPE_e catalogs_hotel_report_parameters_report_report_type_FromString(char* report_type);



typedef struct catalogs_hotel_report_parameters_report_t {
    pinterest_rest_api_catalogs_hotel_report_parameters_report_REPORTTYPE_e report_type; //enum
    char *feed_id; // string
    char *processing_result_id; // string
    char *catalog_id; // string

} catalogs_hotel_report_parameters_report_t;

catalogs_hotel_report_parameters_report_t *catalogs_hotel_report_parameters_report_create(
    pinterest_rest_api_catalogs_hotel_report_parameters_report_REPORTTYPE_e report_type,
    char *feed_id,
    char *processing_result_id,
    char *catalog_id
);

void catalogs_hotel_report_parameters_report_free(catalogs_hotel_report_parameters_report_t *catalogs_hotel_report_parameters_report);

catalogs_hotel_report_parameters_report_t *catalogs_hotel_report_parameters_report_parseFromJSON(cJSON *catalogs_hotel_report_parameters_reportJSON);

cJSON *catalogs_hotel_report_parameters_report_convertToJSON(catalogs_hotel_report_parameters_report_t *catalogs_hotel_report_parameters_report);

#endif /* _catalogs_hotel_report_parameters_report_H_ */

