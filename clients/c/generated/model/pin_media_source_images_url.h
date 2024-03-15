/*
 * pin_media_source_images_url.h
 *
 * Multiple images urls-based media source
 */

#ifndef _pin_media_source_images_url_H_
#define _pin_media_source_images_url_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_media_source_images_url_t pin_media_source_images_url_t;

#include "pin_media_source_images_url_items_inner.h"

// Enum SOURCETYPE for pin_media_source_images_url

typedef enum  { pinterest_rest_api_pin_media_source_images_url_SOURCETYPE_NULL = 0, pinterest_rest_api_pin_media_source_images_url_SOURCETYPE_multiple_image_urls } pinterest_rest_api_pin_media_source_images_url_SOURCETYPE_e;

char* pin_media_source_images_url_source_type_ToString(pinterest_rest_api_pin_media_source_images_url_SOURCETYPE_e source_type);

pinterest_rest_api_pin_media_source_images_url_SOURCETYPE_e pin_media_source_images_url_source_type_FromString(char* source_type);



typedef struct pin_media_source_images_url_t {
    pinterest_rest_api_pin_media_source_images_url_SOURCETYPE_e source_type; //enum
    list_t *items; //nonprimitive container
    int index; //numeric

} pin_media_source_images_url_t;

pin_media_source_images_url_t *pin_media_source_images_url_create(
    pinterest_rest_api_pin_media_source_images_url_SOURCETYPE_e source_type,
    list_t *items,
    int index
);

void pin_media_source_images_url_free(pin_media_source_images_url_t *pin_media_source_images_url);

pin_media_source_images_url_t *pin_media_source_images_url_parseFromJSON(cJSON *pin_media_source_images_urlJSON);

cJSON *pin_media_source_images_url_convertToJSON(pin_media_source_images_url_t *pin_media_source_images_url);

#endif /* _pin_media_source_images_url_H_ */

