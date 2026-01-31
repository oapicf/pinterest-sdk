/*
 * pin_media_with_image_and_video.h
 *
 * Pin with a mix of images and videos.
 */

#ifndef _pin_media_with_image_and_video_H_
#define _pin_media_with_image_and_video_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_media_with_image_and_video_t pin_media_with_image_and_video_t;

#include "pin_media_metadata.h"

// Enum MEDIATYPE for pin_media_with_image_and_video

typedef enum  { pinterest_rest_api_pin_media_with_image_and_video_MEDIATYPE_NULL = 0, pinterest_rest_api_pin_media_with_image_and_video_MEDIATYPE_multiple_mixed } pinterest_rest_api_pin_media_with_image_and_video_MEDIATYPE_e;

char* pin_media_with_image_and_video_media_type_ToString(pinterest_rest_api_pin_media_with_image_and_video_MEDIATYPE_e media_type);

pinterest_rest_api_pin_media_with_image_and_video_MEDIATYPE_e pin_media_with_image_and_video_media_type_FromString(char* media_type);



typedef struct pin_media_with_image_and_video_t {
    list_t *items; //nonprimitive container
    pinterest_rest_api_pin_media_with_image_and_video_MEDIATYPE_e media_type; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} pin_media_with_image_and_video_t;

__attribute__((deprecated)) pin_media_with_image_and_video_t *pin_media_with_image_and_video_create(
    list_t *items,
    pinterest_rest_api_pin_media_with_image_and_video_MEDIATYPE_e media_type
);

void pin_media_with_image_and_video_free(pin_media_with_image_and_video_t *pin_media_with_image_and_video);

pin_media_with_image_and_video_t *pin_media_with_image_and_video_parseFromJSON(cJSON *pin_media_with_image_and_videoJSON);

cJSON *pin_media_with_image_and_video_convertToJSON(pin_media_with_image_and_video_t *pin_media_with_image_and_video);

#endif /* _pin_media_with_image_and_video_H_ */

