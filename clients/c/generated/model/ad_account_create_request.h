/*
 * ad_account_create_request.h
 *
 * 
 */

#ifndef _ad_account_create_request_H_
#define _ad_account_create_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_account_create_request_t ad_account_create_request_t;

#include "country.h"



typedef struct ad_account_create_request_t {
    pinterest_rest_api_country__e country; //referenced enum
    char *name; // string
    char *owner_user_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ad_account_create_request_t;

__attribute__((deprecated)) ad_account_create_request_t *ad_account_create_request_create(
    pinterest_rest_api_country__e country,
    char *name,
    char *owner_user_id
);

void ad_account_create_request_free(ad_account_create_request_t *ad_account_create_request);

ad_account_create_request_t *ad_account_create_request_parseFromJSON(cJSON *ad_account_create_requestJSON);

cJSON *ad_account_create_request_convertToJSON(ad_account_create_request_t *ad_account_create_request);

#endif /* _ad_account_create_request_H_ */

