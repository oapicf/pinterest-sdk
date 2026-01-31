/*
 * pin_media_source_video_id.h
 *
 * Video ID-based media source.
 */

#ifndef _pin_media_source_video_id_H_
#define _pin_media_source_video_id_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_media_source_video_id_t pin_media_source_video_id_t;

#include "content_type.h"

// Enum SOURCETYPE for pin_media_source_video_id

typedef enum  { pinterest_rest_api_pin_media_source_video_id_SOURCETYPE_NULL = 0, pinterest_rest_api_pin_media_source_video_id_SOURCETYPE_video_id } pinterest_rest_api_pin_media_source_video_id_SOURCETYPE_e;

char* pin_media_source_video_id_source_type_ToString(pinterest_rest_api_pin_media_source_video_id_SOURCETYPE_e source_type);

pinterest_rest_api_pin_media_source_video_id_SOURCETYPE_e pin_media_source_video_id_source_type_FromString(char* source_type);



typedef struct pin_media_source_video_id_t {
    content_type_t *cover_image_content_type; // custom
    char *cover_image_data; // string
    int cover_image_key_frame_time; //numeric
    char *cover_image_url; // string
    int is_standard; //boolean
    char *media_id; // string
    pinterest_rest_api_pin_media_source_video_id_SOURCETYPE_e source_type; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} pin_media_source_video_id_t;

__attribute__((deprecated)) pin_media_source_video_id_t *pin_media_source_video_id_create(
    content_type_t *cover_image_content_type,
    char *cover_image_data,
    int cover_image_key_frame_time,
    char *cover_image_url,
    int is_standard,
    char *media_id,
    pinterest_rest_api_pin_media_source_video_id_SOURCETYPE_e source_type
);

void pin_media_source_video_id_free(pin_media_source_video_id_t *pin_media_source_video_id);

pin_media_source_video_id_t *pin_media_source_video_id_parseFromJSON(cJSON *pin_media_source_video_idJSON);

cJSON *pin_media_source_video_id_convertToJSON(pin_media_source_video_id_t *pin_media_source_video_id);

#endif /* _pin_media_source_video_id_H_ */

