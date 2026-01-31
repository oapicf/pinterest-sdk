/*
 * pin_media.h
 *
 * Pin media that can be an image, video, or a mix of both.
 */

#ifndef _pin_media_H_
#define _pin_media_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_media_t pin_media_t;

#include "image_size.h"
#include "pin_media_metadata.h"
#include "pin_media_with_image.h"
#include "pin_media_with_image_and_video.h"
#include "pin_media_with_images.h"
#include "pin_media_with_video.h"
#include "pin_media_with_videos.h"

// Enum MEDIATYPE for pin_media

typedef enum  { pinterest_rest_api_pin_media_MEDIATYPE_NULL = 0, pinterest_rest_api_pin_media_MEDIATYPE_multiple_mixed } pinterest_rest_api_pin_media_MEDIATYPE_e;

char* pin_media_media_type_ToString(pinterest_rest_api_pin_media_MEDIATYPE_e media_type);

pinterest_rest_api_pin_media_MEDIATYPE_e pin_media_media_type_FromString(char* media_type);



typedef struct pin_media_t {
    struct image_size_t *images; //model
    pinterest_rest_api_pin_media_MEDIATYPE_e media_type; //enum
    char *cover_image_url; // string
    double duration; //numeric
    int height; //numeric
    char *video_url; // string
    int width; //numeric
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} pin_media_t;

__attribute__((deprecated)) pin_media_t *pin_media_create(
    image_size_t *images,
    pinterest_rest_api_pin_media_MEDIATYPE_e media_type,
    char *cover_image_url,
    double duration,
    int height,
    char *video_url,
    int width,
    list_t *items
);

void pin_media_free(pin_media_t *pin_media);

pin_media_t *pin_media_parseFromJSON(cJSON *pin_mediaJSON);

cJSON *pin_media_convertToJSON(pin_media_t *pin_media);

#endif /* _pin_media_H_ */

