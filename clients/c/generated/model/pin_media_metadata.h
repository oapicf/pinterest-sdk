/*
 * pin_media_metadata.h
 *
 * Per-item entry inside &#x60;PinMedia.items&#x60; for mixed image/video pins. Discriminated by &#x60;item_type&#x60;.
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

// Enum ITEMTYPE for pin_media_metadata

typedef enum  { pinterest_rest_api_pin_media_metadata_ITEMTYPE_NULL = 0, pinterest_rest_api_pin_media_metadata_ITEMTYPE_video } pinterest_rest_api_pin_media_metadata_ITEMTYPE_e;

char* pin_media_metadata_item_type_ToString(pinterest_rest_api_pin_media_metadata_ITEMTYPE_e item_type);

pinterest_rest_api_pin_media_metadata_ITEMTYPE_e pin_media_metadata_item_type_FromString(char* item_type);



typedef struct pin_media_metadata_t {
    char *description; // string
    struct image_size_t *images; //model
    pinterest_rest_api_pin_media_metadata_ITEMTYPE_e item_type; //enum
    char *link; // string
    char *title; // string
    char *cover_image_url; // string
    double *duration; //numeric
    int *height; //numeric
    char *video_url; // string
    char *video_url_hls; // string
    int *width; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} pin_media_metadata_t;

__attribute__((deprecated)) pin_media_metadata_t *pin_media_metadata_create(
    char *description,
    image_size_t *images,
    pinterest_rest_api_pin_media_metadata_ITEMTYPE_e item_type,
    char *link,
    char *title,
    char *cover_image_url,
    double *duration,
    int *height,
    char *video_url,
    char *video_url_hls,
    int *width
);

void pin_media_metadata_free(pin_media_metadata_t *pin_media_metadata);

pin_media_metadata_t *pin_media_metadata_parseFromJSON(cJSON *pin_media_metadataJSON);

cJSON *pin_media_metadata_convertToJSON(pin_media_metadata_t *pin_media_metadata);

#endif /* _pin_media_metadata_H_ */

