/*
 * template_based_report.h
 *
 * 
 */

#ifndef _template_based_report_H_
#define _template_based_report_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct template_based_report_t template_based_report_t;

#include "bulk_reporting_job_status.h"



typedef struct template_based_report_t {
    char *message; // string
    pinterest_rest_api_bulk_reporting_job_status__e report_status; //referenced enum
    char *template_id; // string
    char *token; // string

    int _library_owned; // Is the library responsible for freeing this object?
} template_based_report_t;

__attribute__((deprecated)) template_based_report_t *template_based_report_create(
    char *message,
    pinterest_rest_api_bulk_reporting_job_status__e report_status,
    char *template_id,
    char *token
);

void template_based_report_free(template_based_report_t *template_based_report);

template_based_report_t *template_based_report_parseFromJSON(cJSON *template_based_reportJSON);

cJSON *template_based_report_convertToJSON(template_based_report_t *template_based_report);

#endif /* _template_based_report_H_ */

