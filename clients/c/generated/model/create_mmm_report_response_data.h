/*
 * create_mmm_report_response_data.h
 *
 * 
 */

#ifndef _create_mmm_report_response_data_H_
#define _create_mmm_report_response_data_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_mmm_report_response_data_t create_mmm_report_response_data_t;

#include "bulk_reporting_job_status.h"



typedef struct create_mmm_report_response_data_t {
    bulk_reporting_job_status_t *report_status; // custom
    char *token; // string
    char *message; // string
    char *status; // string

} create_mmm_report_response_data_t;

create_mmm_report_response_data_t *create_mmm_report_response_data_create(
    bulk_reporting_job_status_t *report_status,
    char *token,
    char *message,
    char *status
);

void create_mmm_report_response_data_free(create_mmm_report_response_data_t *create_mmm_report_response_data);

create_mmm_report_response_data_t *create_mmm_report_response_data_parseFromJSON(cJSON *create_mmm_report_response_dataJSON);

cJSON *create_mmm_report_response_data_convertToJSON(create_mmm_report_response_data_t *create_mmm_report_response_data);

#endif /* _create_mmm_report_response_data_H_ */

