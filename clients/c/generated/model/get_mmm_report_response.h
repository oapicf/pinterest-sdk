/*
 * get_mmm_report_response.h
 *
 * 
 */

#ifndef _get_mmm_report_response_H_
#define _get_mmm_report_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_mmm_report_response_t get_mmm_report_response_t;

#include "get_mmm_report_response_data.h"



typedef struct get_mmm_report_response_t {
    double code; //numeric
    struct get_mmm_report_response_data_t *data; //model
    char *message; // string
    char *status; // string

} get_mmm_report_response_t;

get_mmm_report_response_t *get_mmm_report_response_create(
    double code,
    get_mmm_report_response_data_t *data,
    char *message,
    char *status
);

void get_mmm_report_response_free(get_mmm_report_response_t *get_mmm_report_response);

get_mmm_report_response_t *get_mmm_report_response_parseFromJSON(cJSON *get_mmm_report_responseJSON);

cJSON *get_mmm_report_response_convertToJSON(get_mmm_report_response_t *get_mmm_report_response);

#endif /* _get_mmm_report_response_H_ */

