/*
 * pin_media_source_images_base64_items_inner.h
 *
 * 
 */

#ifndef _pin_media_source_images_base64_items_inner_H_
#define _pin_media_source_images_base64_items_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_media_source_images_base64_items_inner_t pin_media_source_images_base64_items_inner_t;


// Enum CONTENTTYPE for pin_media_source_images_base64_items_inner

typedef enum  { pinterest_rest_api_pin_media_source_images_base64_items_inner_CONTENTTYPE_NULL = 0, pinterest_rest_api_pin_media_source_images_base64_items_inner_CONTENTTYPE_image/jpeg, pinterest_rest_api_pin_media_source_images_base64_items_inner_CONTENTTYPE_image/png } pinterest_rest_api_pin_media_source_images_base64_items_inner_CONTENTTYPE_e;

char* pin_media_source_images_base64_items_inner_content_type_ToString(pinterest_rest_api_pin_media_source_images_base64_items_inner_CONTENTTYPE_e content_type);

pinterest_rest_api_pin_media_source_images_base64_items_inner_CONTENTTYPE_e pin_media_source_images_base64_items_inner_content_type_FromString(char* content_type);



typedef struct pin_media_source_images_base64_items_inner_t {
    char *title; // string
    char *description; // string
    char *link; // string
    pinterest_rest_api_pin_media_source_images_base64_items_inner_CONTENTTYPE_e content_type; //enum
    char *data; // string

} pin_media_source_images_base64_items_inner_t;

pin_media_source_images_base64_items_inner_t *pin_media_source_images_base64_items_inner_create(
    char *title,
    char *description,
    char *link,
    pinterest_rest_api_pin_media_source_images_base64_items_inner_CONTENTTYPE_e content_type,
    char *data
);

void pin_media_source_images_base64_items_inner_free(pin_media_source_images_base64_items_inner_t *pin_media_source_images_base64_items_inner);

pin_media_source_images_base64_items_inner_t *pin_media_source_images_base64_items_inner_parseFromJSON(cJSON *pin_media_source_images_base64_items_innerJSON);

cJSON *pin_media_source_images_base64_items_inner_convertToJSON(pin_media_source_images_base64_items_inner_t *pin_media_source_images_base64_items_inner);

#endif /* _pin_media_source_images_base64_items_inner_H_ */

