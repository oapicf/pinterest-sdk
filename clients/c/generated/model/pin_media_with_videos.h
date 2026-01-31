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

#include "video_metadata_with_item_type.h"

// Enum MEDIATYPE for pin_media_with_videos

typedef enum  { pinterest_rest_api_pin_media_with_videos_MEDIATYPE_NULL = 0, pinterest_rest_api_pin_media_with_videos_MEDIATYPE_multiple_videos } pinterest_rest_api_pin_media_with_videos_MEDIATYPE_e;

char* pin_media_with_videos_media_type_ToString(pinterest_rest_api_pin_media_with_videos_MEDIATYPE_e media_type);

pinterest_rest_api_pin_media_with_videos_MEDIATYPE_e pin_media_with_videos_media_type_FromString(char* media_type);



typedef struct pin_media_with_videos_t {
    list_t *items; //nonprimitive container
    pinterest_rest_api_pin_media_with_videos_MEDIATYPE_e media_type; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} pin_media_with_videos_t;

__attribute__((deprecated)) pin_media_with_videos_t *pin_media_with_videos_create(
    list_t *items,
    pinterest_rest_api_pin_media_with_videos_MEDIATYPE_e media_type
);

void pin_media_with_videos_free(pin_media_with_videos_t *pin_media_with_videos);

pin_media_with_videos_t *pin_media_with_videos_parseFromJSON(cJSON *pin_media_with_videosJSON);

cJSON *pin_media_with_videos_convertToJSON(pin_media_with_videos_t *pin_media_with_videos);

#endif /* _pin_media_with_videos_H_ */

