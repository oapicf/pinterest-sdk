/*
 * brand_accounts_create_request.h
 *
 * 
 */

#ifndef _brand_accounts_create_request_H_
#define _brand_accounts_create_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct brand_accounts_create_request_t brand_accounts_create_request_t;

#include "country.h"
#include "image_base64.h"



typedef struct brand_accounts_create_request_t {
    char *name; // string
    char *username; // string
    pinterest_rest_api_country__e country; //referenced enum
    char *about; // string
    char *website; // string
    struct image_base64_t *profile_image; //model

    int _library_owned; // Is the library responsible for freeing this object?
} brand_accounts_create_request_t;

__attribute__((deprecated)) brand_accounts_create_request_t *brand_accounts_create_request_create(
    char *name,
    char *username,
    pinterest_rest_api_country__e country,
    char *about,
    char *website,
    image_base64_t *profile_image
);

void brand_accounts_create_request_free(brand_accounts_create_request_t *brand_accounts_create_request);

brand_accounts_create_request_t *brand_accounts_create_request_parseFromJSON(cJSON *brand_accounts_create_requestJSON);

cJSON *brand_accounts_create_request_convertToJSON(brand_accounts_create_request_t *brand_accounts_create_request);

#endif /* _brand_accounts_create_request_H_ */

