/*
 * ad_group_create_request_all_of1.h
 *
 * 
 */

#ifndef _ad_group_create_request_all_of1_H_
#define _ad_group_create_request_all_of1_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_group_create_request_all_of1_t ad_group_create_request_all_of1_t;

#include "budget_type.h"
#include "pacing_delivery_type.h"



typedef struct ad_group_create_request_all_of1_t {
    int *auto_targeting_enabled; //boolean
    double *bid_multiplier; //numeric
    budget_type_t *budget_type; // custom
    pacing_delivery_type_t *pacing_delivery_type; // custom

    int _library_owned; // Is the library responsible for freeing this object?
} ad_group_create_request_all_of1_t;

__attribute__((deprecated)) ad_group_create_request_all_of1_t *ad_group_create_request_all_of1_create(
    int *auto_targeting_enabled,
    double *bid_multiplier,
    budget_type_t *budget_type,
    pacing_delivery_type_t *pacing_delivery_type
);

void ad_group_create_request_all_of1_free(ad_group_create_request_all_of1_t *ad_group_create_request_all_of1);

ad_group_create_request_all_of1_t *ad_group_create_request_all_of1_parseFromJSON(cJSON *ad_group_create_request_all_of1JSON);

cJSON *ad_group_create_request_all_of1_convertToJSON(ad_group_create_request_all_of1_t *ad_group_create_request_all_of1);

#endif /* _ad_group_create_request_all_of1_H_ */

