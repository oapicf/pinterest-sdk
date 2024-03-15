/*
 * pin_media_source_image_base64.h
 *
 * Base64-encoded image media source
 */

#ifndef _pin_media_source_image_base64_H_
#define _pin_media_source_image_base64_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_media_source_image_base64_t pin_media_source_image_base64_t;


// Enum SOURCETYPE for pin_media_source_image_base64

typedef enum  { pinterest_rest_api_pin_media_source_image_base64_SOURCETYPE_NULL = 0, pinterest_rest_api_pin_media_source_image_base64_SOURCETYPE_image_base64 } pinterest_rest_api_pin_media_source_image_base64_SOURCETYPE_e;

char* pin_media_source_image_base64_source_type_ToString(pinterest_rest_api_pin_media_source_image_base64_SOURCETYPE_e source_type);

pinterest_rest_api_pin_media_source_image_base64_SOURCETYPE_e pin_media_source_image_base64_source_type_FromString(char* source_type);

// Enum CONTENTTYPE for pin_media_source_image_base64

typedef enum  { pinterest_rest_api_pin_media_source_image_base64_CONTENTTYPE_NULL = 0, pinterest_rest_api_pin_media_source_image_base64_CONTENTTYPE_image/jpeg, pinterest_rest_api_pin_media_source_image_base64_CONTENTTYPE_image/png } pinterest_rest_api_pin_media_source_image_base64_CONTENTTYPE_e;

char* pin_media_source_image_base64_content_type_ToString(pinterest_rest_api_pin_media_source_image_base64_CONTENTTYPE_e content_type);

pinterest_rest_api_pin_media_source_image_base64_CONTENTTYPE_e pin_media_source_image_base64_content_type_FromString(char* content_type);



typedef struct pin_media_source_image_base64_t {
    pinterest_rest_api_pin_media_source_image_base64_SOURCETYPE_e source_type; //enum
    pinterest_rest_api_pin_media_source_image_base64_CONTENTTYPE_e content_type; //enum
    char *data; // string
    int is_standard; //boolean

} pin_media_source_image_base64_t;

pin_media_source_image_base64_t *pin_media_source_image_base64_create(
    pinterest_rest_api_pin_media_source_image_base64_SOURCETYPE_e source_type,
    pinterest_rest_api_pin_media_source_image_base64_CONTENTTYPE_e content_type,
    char *data,
    int is_standard
);

void pin_media_source_image_base64_free(pin_media_source_image_base64_t *pin_media_source_image_base64);

pin_media_source_image_base64_t *pin_media_source_image_base64_parseFromJSON(cJSON *pin_media_source_image_base64JSON);

cJSON *pin_media_source_image_base64_convertToJSON(pin_media_source_image_base64_t *pin_media_source_image_base64);

#endif /* _pin_media_source_image_base64_H_ */

