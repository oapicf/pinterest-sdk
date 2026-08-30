/*
 * ad_update_request_all_of1.h
 *
 * 
 */

#ifndef _ad_update_request_all_of1_H_
#define _ad_update_request_all_of1_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_update_request_all_of1_t ad_update_request_all_of1_t;




typedef struct ad_update_request_all_of1_t {
    char *id; // string
    char *pin_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ad_update_request_all_of1_t;

__attribute__((deprecated)) ad_update_request_all_of1_t *ad_update_request_all_of1_create(
    char *id,
    char *pin_id
);

void ad_update_request_all_of1_free(ad_update_request_all_of1_t *ad_update_request_all_of1);

ad_update_request_all_of1_t *ad_update_request_all_of1_parseFromJSON(cJSON *ad_update_request_all_of1JSON);

cJSON *ad_update_request_all_of1_convertToJSON(ad_update_request_all_of1_t *ad_update_request_all_of1);

#endif /* _ad_update_request_all_of1_H_ */

