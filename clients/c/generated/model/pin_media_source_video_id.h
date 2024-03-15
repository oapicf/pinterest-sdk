/*
 * pin_media_source_video_id.h
 *
 * Video ID-based media source
 */

#ifndef _pin_media_source_video_id_H_
#define _pin_media_source_video_id_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_media_source_video_id_t pin_media_source_video_id_t;


// Enum SOURCETYPE for pin_media_source_video_id

typedef enum  { pinterest_rest_api_pin_media_source_video_id_SOURCETYPE_NULL = 0, pinterest_rest_api_pin_media_source_video_id_SOURCETYPE_video_id } pinterest_rest_api_pin_media_source_video_id_SOURCETYPE_e;

char* pin_media_source_video_id_source_type_ToString(pinterest_rest_api_pin_media_source_video_id_SOURCETYPE_e source_type);

pinterest_rest_api_pin_media_source_video_id_SOURCETYPE_e pin_media_source_video_id_source_type_FromString(char* source_type);

// Enum COVERIMAGECONTENTTYPE for pin_media_source_video_id

typedef enum  { pinterest_rest_api_pin_media_source_video_id_COVERIMAGECONTENTTYPE_NULL = 0, pinterest_rest_api_pin_media_source_video_id_COVERIMAGECONTENTTYPE_image/jpeg, pinterest_rest_api_pin_media_source_video_id_COVERIMAGECONTENTTYPE_image/png } pinterest_rest_api_pin_media_source_video_id_COVERIMAGECONTENTTYPE_e;

char* pin_media_source_video_id_cover_image_content_type_ToString(pinterest_rest_api_pin_media_source_video_id_COVERIMAGECONTENTTYPE_e cover_image_content_type);

pinterest_rest_api_pin_media_source_video_id_COVERIMAGECONTENTTYPE_e pin_media_source_video_id_cover_image_content_type_FromString(char* cover_image_content_type);



typedef struct pin_media_source_video_id_t {
    pinterest_rest_api_pin_media_source_video_id_SOURCETYPE_e source_type; //enum
    char *cover_image_url; // string
    pinterest_rest_api_pin_media_source_video_id_COVERIMAGECONTENTTYPE_e cover_image_content_type; //enum
    char *cover_image_data; // string
    char *media_id; // string
    int is_standard; //boolean

} pin_media_source_video_id_t;

pin_media_source_video_id_t *pin_media_source_video_id_create(
    pinterest_rest_api_pin_media_source_video_id_SOURCETYPE_e source_type,
    char *cover_image_url,
    pinterest_rest_api_pin_media_source_video_id_COVERIMAGECONTENTTYPE_e cover_image_content_type,
    char *cover_image_data,
    char *media_id,
    int is_standard
);

void pin_media_source_video_id_free(pin_media_source_video_id_t *pin_media_source_video_id);

pin_media_source_video_id_t *pin_media_source_video_id_parseFromJSON(cJSON *pin_media_source_video_idJSON);

cJSON *pin_media_source_video_id_convertToJSON(pin_media_source_video_id_t *pin_media_source_video_id);

#endif /* _pin_media_source_video_id_H_ */

