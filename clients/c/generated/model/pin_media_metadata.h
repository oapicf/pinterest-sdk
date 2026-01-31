/*
 * pin_media_metadata.h
 *
 * 
 */

#ifndef _pin_media_metadata_H_
#define _pin_media_metadata_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_media_metadata_t pin_media_metadata_t;

#include "image_metadata.h"
#include "image_size.h"
#include "video_metadata_with_item_type.h"



typedef struct pin_media_metadata_t {
    char *description; // string
    struct image_size_t *images; //model
    char *item_type; // string
    char *link; // string
    char *title; // string
    char *cover_image_url; // string
    double duration; //numeric
    int height; //numeric
    char *video_url; // string
    int width; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} pin_media_metadata_t;

__attribute__((deprecated)) pin_media_metadata_t *pin_media_metadata_create(
    char *description,
    image_size_t *images,
    char *item_type,
    char *link,
    char *title,
    char *cover_image_url,
    double duration,
    int height,
    char *video_url,
    int width
);

void pin_media_metadata_free(pin_media_metadata_t *pin_media_metadata);

pin_media_metadata_t *pin_media_metadata_parseFromJSON(cJSON *pin_media_metadataJSON);

cJSON *pin_media_metadata_convertToJSON(pin_media_metadata_t *pin_media_metadata);

#endif /* _pin_media_metadata_H_ */

