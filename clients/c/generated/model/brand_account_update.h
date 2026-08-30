/*
 * brand_account_update.h
 *
 * Resource create or update operation model.
 */

#ifndef _brand_account_update_H_
#define _brand_account_update_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct brand_account_update_t brand_account_update_t;

#include "brand_account_profile_image_update.h"
#include "country.h"



typedef struct brand_account_update_t {
    char *about; // string
    pinterest_rest_api_country__e country; //referenced enum
    char *name; // string
    struct brand_account_profile_image_update_t *profile_image; //model
    char *username; // string
    char *website; // string

    int _library_owned; // Is the library responsible for freeing this object?
} brand_account_update_t;

__attribute__((deprecated)) brand_account_update_t *brand_account_update_create(
    char *about,
    pinterest_rest_api_country__e country,
    char *name,
    brand_account_profile_image_update_t *profile_image,
    char *username,
    char *website
);

void brand_account_update_free(brand_account_update_t *brand_account_update);

brand_account_update_t *brand_account_update_parseFromJSON(cJSON *brand_account_updateJSON);

cJSON *brand_account_update_convertToJSON(brand_account_update_t *brand_account_update);

#endif /* _brand_account_update_H_ */

