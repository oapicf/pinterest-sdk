/*
 * pin_media_source_images_url_items_inner.h
 *
 * 
 */

#ifndef _pin_media_source_images_url_items_inner_H_
#define _pin_media_source_images_url_items_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_media_source_images_url_items_inner_t pin_media_source_images_url_items_inner_t;




typedef struct pin_media_source_images_url_items_inner_t {
    char *title; // string
    char *description; // string
    char *link; // string
    char *url; // string

} pin_media_source_images_url_items_inner_t;

pin_media_source_images_url_items_inner_t *pin_media_source_images_url_items_inner_create(
    char *title,
    char *description,
    char *link,
    char *url
);

void pin_media_source_images_url_items_inner_free(pin_media_source_images_url_items_inner_t *pin_media_source_images_url_items_inner);

pin_media_source_images_url_items_inner_t *pin_media_source_images_url_items_inner_parseFromJSON(cJSON *pin_media_source_images_url_items_innerJSON);

cJSON *pin_media_source_images_url_items_inner_convertToJSON(pin_media_source_images_url_items_inner_t *pin_media_source_images_url_items_inner);

#endif /* _pin_media_source_images_url_items_inner_H_ */

