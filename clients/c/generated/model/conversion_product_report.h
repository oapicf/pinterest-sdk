/*
 * conversion_product_report.h
 *
 * 
 */

#ifndef _conversion_product_report_H_
#define _conversion_product_report_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_product_report_t conversion_product_report_t;

#include "bulk_reporting_job_status.h"



typedef struct conversion_product_report_t {
    char *message; // string
    bulk_reporting_job_status_t *report_status; // custom
    double *size; //numeric
    char *token; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} conversion_product_report_t;

__attribute__((deprecated)) conversion_product_report_t *conversion_product_report_create(
    char *message,
    bulk_reporting_job_status_t *report_status,
    double *size,
    char *token,
    char *url
);

void conversion_product_report_free(conversion_product_report_t *conversion_product_report);

conversion_product_report_t *conversion_product_report_parseFromJSON(cJSON *conversion_product_reportJSON);

cJSON *conversion_product_report_convertToJSON(conversion_product_report_t *conversion_product_report);

#endif /* _conversion_product_report_H_ */

