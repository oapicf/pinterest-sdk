/*
 * mmm_report.h
 *
 * 
 */

#ifndef _mmm_report_H_
#define _mmm_report_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct mmm_report_t mmm_report_t;

#include "bulk_reporting_job_status.h"



typedef struct mmm_report_t {
    char *message; // string
    bulk_reporting_job_status_t *report_status; // custom
    double *size; //numeric
    char *status; // string
    char *token; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} mmm_report_t;

__attribute__((deprecated)) mmm_report_t *mmm_report_create(
    char *message,
    bulk_reporting_job_status_t *report_status,
    double *size,
    char *status,
    char *token,
    char *url
);

void mmm_report_free(mmm_report_t *mmm_report);

mmm_report_t *mmm_report_parseFromJSON(cJSON *mmm_reportJSON);

cJSON *mmm_report_convertToJSON(mmm_report_t *mmm_report);

#endif /* _mmm_report_H_ */

