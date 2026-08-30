/*
 * brand_account_profile_image.h
 *
 * Base64-encoded image media source
 */

#ifndef _brand_account_profile_image_H_
#define _brand_account_profile_image_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct brand_account_profile_image_t brand_account_profile_image_t;


// Enum CONTENTTYPE for brand_account_profile_image

typedef enum  { pinterest_rest_api_brand_account_profile_image_CONTENTTYPE_NULL = 0, pinterest_rest_api_brand_account_profile_image_CONTENTTYPE_image/jpeg, pinterest_rest_api_brand_account_profile_image_CONTENTTYPE_image/png } pinterest_rest_api_brand_account_profile_image_CONTENTTYPE_e;

char* brand_account_profile_image_content_type_ToString(pinterest_rest_api_brand_account_profile_image_CONTENTTYPE_e content_type);

pinterest_rest_api_brand_account_profile_image_CONTENTTYPE_e brand_account_profile_image_content_type_FromString(char* content_type);



typedef struct brand_account_profile_image_t {
    pinterest_rest_api_brand_account_profile_image_CONTENTTYPE_e content_type; //enum
    char *data; // string

    int _library_owned; // Is the library responsible for freeing this object?
} brand_account_profile_image_t;

__attribute__((deprecated)) brand_account_profile_image_t *brand_account_profile_image_create(
    pinterest_rest_api_brand_account_profile_image_CONTENTTYPE_e content_type,
    char *data
);

void brand_account_profile_image_free(brand_account_profile_image_t *brand_account_profile_image);

brand_account_profile_image_t *brand_account_profile_image_parseFromJSON(cJSON *brand_account_profile_imageJSON);

cJSON *brand_account_profile_image_convertToJSON(brand_account_profile_image_t *brand_account_profile_image);

#endif /* _brand_account_profile_image_H_ */

