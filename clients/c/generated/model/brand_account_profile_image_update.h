/*
 * brand_account_profile_image_update.h
 *
 * Base64-encoded image media source
 */

#ifndef _brand_account_profile_image_update_H_
#define _brand_account_profile_image_update_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct brand_account_profile_image_update_t brand_account_profile_image_update_t;


// Enum CONTENTTYPE for brand_account_profile_image_update

typedef enum  { pinterest_rest_api_brand_account_profile_image_update_CONTENTTYPE_NULL = 0, pinterest_rest_api_brand_account_profile_image_update_CONTENTTYPE_image/jpeg, pinterest_rest_api_brand_account_profile_image_update_CONTENTTYPE_image/png } pinterest_rest_api_brand_account_profile_image_update_CONTENTTYPE_e;

char* brand_account_profile_image_update_content_type_ToString(pinterest_rest_api_brand_account_profile_image_update_CONTENTTYPE_e content_type);

pinterest_rest_api_brand_account_profile_image_update_CONTENTTYPE_e brand_account_profile_image_update_content_type_FromString(char* content_type);



typedef struct brand_account_profile_image_update_t {
    pinterest_rest_api_brand_account_profile_image_update_CONTENTTYPE_e content_type; //enum
    char *data; // string

    int _library_owned; // Is the library responsible for freeing this object?
} brand_account_profile_image_update_t;

__attribute__((deprecated)) brand_account_profile_image_update_t *brand_account_profile_image_update_create(
    pinterest_rest_api_brand_account_profile_image_update_CONTENTTYPE_e content_type,
    char *data
);

void brand_account_profile_image_update_free(brand_account_profile_image_update_t *brand_account_profile_image_update);

brand_account_profile_image_update_t *brand_account_profile_image_update_parseFromJSON(cJSON *brand_account_profile_image_updateJSON);

cJSON *brand_account_profile_image_update_convertToJSON(brand_account_profile_image_update_t *brand_account_profile_image_update);

#endif /* _brand_account_profile_image_update_H_ */

