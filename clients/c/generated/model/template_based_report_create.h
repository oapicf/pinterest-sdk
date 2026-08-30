/*
 * template_based_report_create.h
 *
 * Resource create operation model.
 */

#ifndef _template_based_report_create_H_
#define _template_based_report_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct template_based_report_create_t template_based_report_create_t;

#include "bulk_reporting_job_status.h"



typedef struct template_based_report_create_t {
    char *message; // string
    pinterest_rest_api_bulk_reporting_job_status__e report_status; //referenced enum
    char *token; // string

    int _library_owned; // Is the library responsible for freeing this object?
} template_based_report_create_t;

__attribute__((deprecated)) template_based_report_create_t *template_based_report_create_create(
    char *message,
    pinterest_rest_api_bulk_reporting_job_status__e report_status,
    char *token
);

void template_based_report_create_free(template_based_report_create_t *template_based_report_create);

template_based_report_create_t *template_based_report_create_parseFromJSON(cJSON *template_based_report_createJSON);

cJSON *template_based_report_create_convertToJSON(template_based_report_create_t *template_based_report_create);

#endif /* _template_based_report_create_H_ */

