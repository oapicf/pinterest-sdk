/*
 * ad_account_create.h
 *
 * Resource create operation model.
 */

#ifndef _ad_account_create_H_
#define _ad_account_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_account_create_t ad_account_create_t;

#include "country.h"
#include "currency.h"



typedef struct ad_account_create_t {
    pinterest_rest_api_country__e country; //referenced enum
    pinterest_rest_api_currency__e currency; //referenced enum
    char *name; // string
    char *owner_user_id; // string
    char *time_zone; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ad_account_create_t;

__attribute__((deprecated)) ad_account_create_t *ad_account_create_create(
    pinterest_rest_api_country__e country,
    pinterest_rest_api_currency__e currency,
    char *name,
    char *owner_user_id,
    char *time_zone
);

void ad_account_create_free(ad_account_create_t *ad_account_create);

ad_account_create_t *ad_account_create_parseFromJSON(cJSON *ad_account_createJSON);

cJSON *ad_account_create_convertToJSON(ad_account_create_t *ad_account_create);

#endif /* _ad_account_create_H_ */

