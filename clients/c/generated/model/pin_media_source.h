/*
 * pin_media_source.h
 *
 * Pin media source that can be an image, video, or a mix of both passed in as a request.
 */

#ifndef _pin_media_source_H_
#define _pin_media_source_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_media_source_t pin_media_source_t;

#include "content_type.h"
#include "pin_media_source_image_base64.h"
#include "pin_media_source_image_url.h"
#include "pin_media_source_images_base64.h"
#include "pin_media_source_images_url.h"
#include "pin_media_source_images_url_item.h"
#include "pin_media_source_pin_url.h"
#include "pin_media_source_video_id.h"

// Enum SOURCETYPE for pin_media_source

typedef enum  { pinterest_rest_api_pin_media_source_SOURCETYPE_NULL = 0, pinterest_rest_api_pin_media_source_SOURCETYPE_pin_url } pinterest_rest_api_pin_media_source_SOURCETYPE_e;

char* pin_media_source_source_type_ToString(pinterest_rest_api_pin_media_source_SOURCETYPE_e source_type);

pinterest_rest_api_pin_media_source_SOURCETYPE_e pin_media_source_source_type_FromString(char* source_type);



typedef struct pin_media_source_t {
    pinterest_rest_api_content_type__e content_type; //referenced enum
    char *data; // string
    int *is_standard; //boolean
    pinterest_rest_api_pin_media_source_SOURCETYPE_e source_type; //enum
    char *url; // string
    content_type_t *cover_image_content_type; // custom
    char *cover_image_data; // string
    int *cover_image_key_frame_time; //numeric
    char *cover_image_url; // string
    char *media_id; // string
    int *index; //numeric
    list_t *items; //nonprimitive container
    int *is_affiliate_link; //boolean

    int _library_owned; // Is the library responsible for freeing this object?
} pin_media_source_t;

__attribute__((deprecated)) pin_media_source_t *pin_media_source_create(
    pinterest_rest_api_content_type__e content_type,
    char *data,
    int *is_standard,
    pinterest_rest_api_pin_media_source_SOURCETYPE_e source_type,
    char *url,
    content_type_t *cover_image_content_type,
    char *cover_image_data,
    int *cover_image_key_frame_time,
    char *cover_image_url,
    char *media_id,
    int *index,
    list_t *items,
    int *is_affiliate_link
);

void pin_media_source_free(pin_media_source_t *pin_media_source);

pin_media_source_t *pin_media_source_parseFromJSON(cJSON *pin_media_sourceJSON);

cJSON *pin_media_source_convertToJSON(pin_media_source_t *pin_media_source);

#endif /* _pin_media_source_H_ */

