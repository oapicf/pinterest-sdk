/*
 * pin_media_with_videos.h
 *
 * Pin with multiple videos.
 */

#ifndef _pin_media_with_videos_H_
#define _pin_media_with_videos_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_media_with_videos_t pin_media_with_videos_t;

#include "pin_media.h"
#include "video_metadata.h"



typedef struct pin_media_with_videos_t {
    char *media_type; // string
    list_t *items; //nonprimitive container

} pin_media_with_videos_t;

pin_media_with_videos_t *pin_media_with_videos_create(
    char *media_type,
    list_t *items
);

void pin_media_with_videos_free(pin_media_with_videos_t *pin_media_with_videos);

pin_media_with_videos_t *pin_media_with_videos_parseFromJSON(cJSON *pin_media_with_videosJSON);

cJSON *pin_media_with_videos_convertToJSON(pin_media_with_videos_t *pin_media_with_videos);

#endif /* _pin_media_with_videos_H_ */

