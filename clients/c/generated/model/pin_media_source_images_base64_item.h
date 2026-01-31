/*
 * pin_media_source_images_base64_item.h
 *
 * 
 */

#ifndef _pin_media_source_images_base64_item_H_
#define _pin_media_source_images_base64_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_media_source_images_base64_item_t pin_media_source_images_base64_item_t;

#include "content_type.h"



typedef struct pin_media_source_images_base64_item_t {
    pinterest_rest_api_content_type__e content_type; //referenced enum
    char *data; // string
    char *description; // string
    char *link; // string
    char *title; // string

    int _library_owned; // Is the library responsible for freeing this object?
} pin_media_source_images_base64_item_t;

__attribute__((deprecated)) pin_media_source_images_base64_item_t *pin_media_source_images_base64_item_create(
    pinterest_rest_api_content_type__e content_type,
    char *data,
    char *description,
    char *link,
    char *title
);

void pin_media_source_images_base64_item_free(pin_media_source_images_base64_item_t *pin_media_source_images_base64_item);

pin_media_source_images_base64_item_t *pin_media_source_images_base64_item_parseFromJSON(cJSON *pin_media_source_images_base64_itemJSON);

cJSON *pin_media_source_images_base64_item_convertToJSON(pin_media_source_images_base64_item_t *pin_media_source_images_base64_item);

#endif /* _pin_media_source_images_base64_item_H_ */

