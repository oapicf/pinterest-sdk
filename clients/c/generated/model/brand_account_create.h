/*
 * brand_account_create.h
 *
 * Resource create operation model.
 */

#ifndef _brand_account_create_H_
#define _brand_account_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct brand_account_create_t brand_account_create_t;

#include "brand_account_profile_image.h"
#include "country.h"



typedef struct brand_account_create_t {
    char *about; // string
    pinterest_rest_api_country__e country; //referenced enum
    char *name; // string
    struct brand_account_profile_image_t *profile_image; //model
    char *username; // string
    char *website; // string

    int _library_owned; // Is the library responsible for freeing this object?
} brand_account_create_t;

__attribute__((deprecated)) brand_account_create_t *brand_account_create_create(
    char *about,
    pinterest_rest_api_country__e country,
    char *name,
    brand_account_profile_image_t *profile_image,
    char *username,
    char *website
);

void brand_account_create_free(brand_account_create_t *brand_account_create);

brand_account_create_t *brand_account_create_parseFromJSON(cJSON *brand_account_createJSON);

cJSON *brand_account_create_convertToJSON(brand_account_create_t *brand_account_create);

#endif /* _brand_account_create_H_ */

