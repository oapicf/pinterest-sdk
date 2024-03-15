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
#include "image_metadata_images.h"
#include "video_metadata.h"



typedef struct pin_media_metadata_t {
    char *item_type; // string
    char *title; // string
    char *description; // string
    char *link; // string
    struct image_metadata_images_t *images; //model
    char *cover_image_url; // string
    char *video_url; // string
    double duration; //numeric
    int height; //numeric
    int width; //numeric

} pin_media_metadata_t;

pin_media_metadata_t *pin_media_metadata_create(
    char *item_type,
    char *title,
    char *description,
    char *link,
    image_metadata_images_t *images,
    char *cover_image_url,
    char *video_url,
    double duration,
    int height,
    int width
);

void pin_media_metadata_free(pin_media_metadata_t *pin_media_metadata);

pin_media_metadata_t *pin_media_metadata_parseFromJSON(cJSON *pin_media_metadataJSON);

cJSON *pin_media_metadata_convertToJSON(pin_media_metadata_t *pin_media_metadata);

#endif /* _pin_media_metadata_H_ */

