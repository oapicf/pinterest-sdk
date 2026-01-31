/*
 * pin_media_source_images_url_item.h
 *
 * 
 */

#ifndef _pin_media_source_images_url_item_H_
#define _pin_media_source_images_url_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_media_source_images_url_item_t pin_media_source_images_url_item_t;




typedef struct pin_media_source_images_url_item_t {
    char *description; // string
    char *link; // string
    char *title; // string
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} pin_media_source_images_url_item_t;

__attribute__((deprecated)) pin_media_source_images_url_item_t *pin_media_source_images_url_item_create(
    char *description,
    char *link,
    char *title,
    char *url
);

void pin_media_source_images_url_item_free(pin_media_source_images_url_item_t *pin_media_source_images_url_item);

pin_media_source_images_url_item_t *pin_media_source_images_url_item_parseFromJSON(cJSON *pin_media_source_images_url_itemJSON);

cJSON *pin_media_source_images_url_item_convertToJSON(pin_media_source_images_url_item_t *pin_media_source_images_url_item);

#endif /* _pin_media_source_images_url_item_H_ */

