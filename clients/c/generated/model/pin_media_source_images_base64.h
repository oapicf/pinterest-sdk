/*
 * pin_media_source_images_base64.h
 *
 * Multiple Base64-encoded images media source
 */

#ifndef _pin_media_source_images_base64_H_
#define _pin_media_source_images_base64_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_media_source_images_base64_t pin_media_source_images_base64_t;

#include "pin_media_source_images_base64_items_inner.h"

// Enum SOURCETYPE for pin_media_source_images_base64

typedef enum  { pinterest_rest_api_pin_media_source_images_base64_SOURCETYPE_NULL = 0, pinterest_rest_api_pin_media_source_images_base64_SOURCETYPE_multiple_image_base64 } pinterest_rest_api_pin_media_source_images_base64_SOURCETYPE_e;

char* pin_media_source_images_base64_source_type_ToString(pinterest_rest_api_pin_media_source_images_base64_SOURCETYPE_e source_type);

pinterest_rest_api_pin_media_source_images_base64_SOURCETYPE_e pin_media_source_images_base64_source_type_FromString(char* source_type);



typedef struct pin_media_source_images_base64_t {
    pinterest_rest_api_pin_media_source_images_base64_SOURCETYPE_e source_type; //enum
    list_t *items; //nonprimitive container
    int index; //numeric

} pin_media_source_images_base64_t;

pin_media_source_images_base64_t *pin_media_source_images_base64_create(
    pinterest_rest_api_pin_media_source_images_base64_SOURCETYPE_e source_type,
    list_t *items,
    int index
);

void pin_media_source_images_base64_free(pin_media_source_images_base64_t *pin_media_source_images_base64);

pin_media_source_images_base64_t *pin_media_source_images_base64_parseFromJSON(cJSON *pin_media_source_images_base64JSON);

cJSON *pin_media_source_images_base64_convertToJSON(pin_media_source_images_base64_t *pin_media_source_images_base64);

#endif /* _pin_media_source_images_base64_H_ */

