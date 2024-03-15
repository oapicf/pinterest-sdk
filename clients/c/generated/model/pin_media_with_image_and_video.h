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

#include "pin_media.h"
#include "pin_media_metadata.h"



typedef struct pin_media_with_image_and_video_t {
    char *media_type; // string
    list_t *items; //nonprimitive container

} pin_media_with_image_and_video_t;

pin_media_with_image_and_video_t *pin_media_with_image_and_video_create(
    char *media_type,
    list_t *items
);

void pin_media_with_image_and_video_free(pin_media_with_image_and_video_t *pin_media_with_image_and_video);

pin_media_with_image_and_video_t *pin_media_with_image_and_video_parseFromJSON(cJSON *pin_media_with_image_and_videoJSON);

cJSON *pin_media_with_image_and_video_convertToJSON(pin_media_with_image_and_video_t *pin_media_with_image_and_video);

#endif /* _pin_media_with_image_and_video_H_ */

