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

#include "pin_media.h"
#include "pin_media_with_image_all_of_images.h"



typedef struct pin_media_with_video_t {
    char *media_type; // string
    struct pin_media_with_image_all_of_images_t *images; //model
    char *cover_image_url; // string
    char *video_url; // string
    double duration; //numeric
    int height; //numeric
    int width; //numeric

} pin_media_with_video_t;

pin_media_with_video_t *pin_media_with_video_create(
    char *media_type,
    pin_media_with_image_all_of_images_t *images,
    char *cover_image_url,
    char *video_url,
    double duration,
    int height,
    int width
);

void pin_media_with_video_free(pin_media_with_video_t *pin_media_with_video);

pin_media_with_video_t *pin_media_with_video_parseFromJSON(cJSON *pin_media_with_videoJSON);

cJSON *pin_media_with_video_convertToJSON(pin_media_with_video_t *pin_media_with_video);

#endif /* _pin_media_with_video_H_ */

