/*
 * image_base64.h
 *
 * Base64-encoded image media source
 */

#ifndef _image_base64_H_
#define _image_base64_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct image_base64_t image_base64_t;


// Enum CONTENTTYPE for image_base64

typedef enum  { pinterest_rest_api_image_base64_CONTENTTYPE_NULL = 0, pinterest_rest_api_image_base64_CONTENTTYPE_image/jpeg, pinterest_rest_api_image_base64_CONTENTTYPE_image/png } pinterest_rest_api_image_base64_CONTENTTYPE_e;

char* image_base64_content_type_ToString(pinterest_rest_api_image_base64_CONTENTTYPE_e content_type);

pinterest_rest_api_image_base64_CONTENTTYPE_e image_base64_content_type_FromString(char* content_type);



typedef struct image_base64_t {
    pinterest_rest_api_image_base64_CONTENTTYPE_e content_type; //enum
    char *data; // string

    int _library_owned; // Is the library responsible for freeing this object?
} image_base64_t;

__attribute__((deprecated)) image_base64_t *image_base64_create(
    pinterest_rest_api_image_base64_CONTENTTYPE_e content_type,
    char *data
);

void image_base64_free(image_base64_t *image_base64);

image_base64_t *image_base64_parseFromJSON(cJSON *image_base64JSON);

cJSON *image_base64_convertToJSON(image_base64_t *image_base64);

#endif /* _image_base64_H_ */

