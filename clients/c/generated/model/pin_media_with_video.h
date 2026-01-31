/*
 * pin_media_with_video.h
 *
 * Pin with video.
 */

#ifndef _pin_media_with_video_H_
#define _pin_media_with_video_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_media_with_video_t pin_media_with_video_t;

#include "image_size.h"

// Enum MEDIATYPE for pin_media_with_video

typedef enum  { pinterest_rest_api_pin_media_with_video_MEDIATYPE_NULL = 0, pinterest_rest_api_pin_media_with_video_MEDIATYPE_video } pinterest_rest_api_pin_media_with_video_MEDIATYPE_e;

char* pin_media_with_video_media_type_ToString(pinterest_rest_api_pin_media_with_video_MEDIATYPE_e media_type);

pinterest_rest_api_pin_media_with_video_MEDIATYPE_e pin_media_with_video_media_type_FromString(char* media_type);



typedef struct pin_media_with_video_t {
    char *cover_image_url; // string
    double duration; //numeric
    int height; //numeric
    struct image_size_t *images; //model
    pinterest_rest_api_pin_media_with_video_MEDIATYPE_e media_type; //enum
    char *video_url; // string
    int width; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} pin_media_with_video_t;

__attribute__((deprecated)) pin_media_with_video_t *pin_media_with_video_create(
    char *cover_image_url,
    double duration,
    int height,
    image_size_t *images,
    pinterest_rest_api_pin_media_with_video_MEDIATYPE_e media_type,
    char *video_url,
    int width
);

void pin_media_with_video_free(pin_media_with_video_t *pin_media_with_video);

pin_media_with_video_t *pin_media_with_video_parseFromJSON(cJSON *pin_media_with_videoJSON);

cJSON *pin_media_with_video_convertToJSON(pin_media_with_video_t *pin_media_with_video);

#endif /* _pin_media_with_video_H_ */

