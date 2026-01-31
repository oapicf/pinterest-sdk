/*
 * pin_media_source_image_base64.h
 *
 * Image Base64-based media source.
 */

#ifndef _pin_media_source_image_base64_H_
#define _pin_media_source_image_base64_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_media_source_image_base64_t pin_media_source_image_base64_t;

#include "content_type.h"

// Enum SOURCETYPE for pin_media_source_image_base64

typedef enum  { pinterest_rest_api_pin_media_source_image_base64_SOURCETYPE_NULL = 0, pinterest_rest_api_pin_media_source_image_base64_SOURCETYPE_image_base64 } pinterest_rest_api_pin_media_source_image_base64_SOURCETYPE_e;

char* pin_media_source_image_base64_source_type_ToString(pinterest_rest_api_pin_media_source_image_base64_SOURCETYPE_e source_type);

pinterest_rest_api_pin_media_source_image_base64_SOURCETYPE_e pin_media_source_image_base64_source_type_FromString(char* source_type);



typedef struct pin_media_source_image_base64_t {
    pinterest_rest_api_content_type__e content_type; //referenced enum
    char *data; // string
    int is_standard; //boolean
    pinterest_rest_api_pin_media_source_image_base64_SOURCETYPE_e source_type; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} pin_media_source_image_base64_t;

__attribute__((deprecated)) pin_media_source_image_base64_t *pin_media_source_image_base64_create(
    pinterest_rest_api_content_type__e content_type,
    char *data,
    int is_standard,
    pinterest_rest_api_pin_media_source_image_base64_SOURCETYPE_e source_type
);

void pin_media_source_image_base64_free(pin_media_source_image_base64_t *pin_media_source_image_base64);

pin_media_source_image_base64_t *pin_media_source_image_base64_parseFromJSON(cJSON *pin_media_source_image_base64JSON);

cJSON *pin_media_source_image_base64_convertToJSON(pin_media_source_image_base64_t *pin_media_source_image_base64);

#endif /* _pin_media_source_image_base64_H_ */

