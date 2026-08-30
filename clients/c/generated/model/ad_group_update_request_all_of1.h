/*
 * ad_group_update_request_all_of1.h
 *
 * 
 */

#ifndef _ad_group_update_request_all_of1_H_
#define _ad_group_update_request_all_of1_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_group_update_request_all_of1_t ad_group_update_request_all_of1_t;

#include "targeting_spec_operations.h"



typedef struct ad_group_update_request_all_of1_t {
    double *bid_multiplier; //numeric
    char *id; // string
    list_t *targeting_spec_operations; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} ad_group_update_request_all_of1_t;

__attribute__((deprecated)) ad_group_update_request_all_of1_t *ad_group_update_request_all_of1_create(
    double *bid_multiplier,
    char *id,
    list_t *targeting_spec_operations
);

void ad_group_update_request_all_of1_free(ad_group_update_request_all_of1_t *ad_group_update_request_all_of1);

ad_group_update_request_all_of1_t *ad_group_update_request_all_of1_parseFromJSON(cJSON *ad_group_update_request_all_of1JSON);

cJSON *ad_group_update_request_all_of1_convertToJSON(ad_group_update_request_all_of1_t *ad_group_update_request_all_of1);

#endif /* _ad_group_update_request_all_of1_H_ */

