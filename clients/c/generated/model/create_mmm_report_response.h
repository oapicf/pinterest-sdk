/*
 * create_mmm_report_response.h
 *
 * 
 */

#ifndef _create_mmm_report_response_H_
#define _create_mmm_report_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_mmm_report_response_t create_mmm_report_response_t;

#include "create_mmm_report_response_data.h"



typedef struct create_mmm_report_response_t {
    double code; //numeric
    struct create_mmm_report_response_data_t *data; //model

} create_mmm_report_response_t;

create_mmm_report_response_t *create_mmm_report_response_create(
    double code,
    create_mmm_report_response_data_t *data
);

void create_mmm_report_response_free(create_mmm_report_response_t *create_mmm_report_response);

create_mmm_report_response_t *create_mmm_report_response_parseFromJSON(cJSON *create_mmm_report_responseJSON);

cJSON *create_mmm_report_response_convertToJSON(create_mmm_report_response_t *create_mmm_report_response);

#endif /* _create_mmm_report_response_H_ */

