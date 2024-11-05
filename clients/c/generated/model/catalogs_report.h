/*
 * catalogs_report.h
 *
 * 
 */

#ifndef _catalogs_report_H_
#define _catalogs_report_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_report_t catalogs_report_t;


// Enum REPORTSTATUS for catalogs_report

typedef enum  { pinterest_rest_api_catalogs_report_REPORTSTATUS_NULL = 0, pinterest_rest_api_catalogs_report_REPORTSTATUS_FINISHED, pinterest_rest_api_catalogs_report_REPORTSTATUS_IN_PROGRESS } pinterest_rest_api_catalogs_report_REPORTSTATUS_e;

char* catalogs_report_report_status_ToString(pinterest_rest_api_catalogs_report_REPORTSTATUS_e report_status);

pinterest_rest_api_catalogs_report_REPORTSTATUS_e catalogs_report_report_status_FromString(char* report_status);



typedef struct catalogs_report_t {
    pinterest_rest_api_catalogs_report_REPORTSTATUS_e report_status; //enum
    char *url; // string
    double size; //numeric

} catalogs_report_t;

catalogs_report_t *catalogs_report_create(
    pinterest_rest_api_catalogs_report_REPORTSTATUS_e report_status,
    char *url,
    double size
);

void catalogs_report_free(catalogs_report_t *catalogs_report);

catalogs_report_t *catalogs_report_parseFromJSON(cJSON *catalogs_reportJSON);

cJSON *catalogs_report_convertToJSON(catalogs_report_t *catalogs_report);

#endif /* _catalogs_report_H_ */

