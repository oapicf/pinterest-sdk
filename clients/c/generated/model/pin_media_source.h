/*
 * pin_media_source.h
 *
 * Pin media source.
 */

#ifndef _pin_media_source_H_
#define _pin_media_source_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_media_source_t pin_media_source_t;

#include "pin_media_source_image_base64.h"
#include "pin_media_source_image_url.h"
#include "pin_media_source_images_base64.h"
#include "pin_media_source_images_url.h"
#include "pin_media_source_images_url_items_inner.h"
#include "pin_media_source_pin_url.h"
#include "pin_media_source_video_id.h"

// Enum SOURCETYPE for pin_media_source

typedef enum  { pinterest_rest_api_pin_media_source_SOURCETYPE_NULL = 0, pinterest_rest_api_pin_media_source_SOURCETYPE_pin_url } pinterest_rest_api_pin_media_source_SOURCETYPE_e;

char* pin_media_source_source_type_ToString(pinterest_rest_api_pin_media_source_SOURCETYPE_e source_type);

pinterest_rest_api_pin_media_source_SOURCETYPE_e pin_media_source_source_type_FromString(char* source_type);

// Enum CONTENTTYPE for pin_media_source

typedef enum  { pinterest_rest_api_pin_media_source_CONTENTTYPE_NULL = 0, pinterest_rest_api_pin_media_source_CONTENTTYPE_image/jpeg, pinterest_rest_api_pin_media_source_CONTENTTYPE_image/png } pinterest_rest_api_pin_media_source_CONTENTTYPE_e;

char* pin_media_source_content_type_ToString(pinterest_rest_api_pin_media_source_CONTENTTYPE_e content_type);

pinterest_rest_api_pin_media_source_CONTENTTYPE_e pin_media_source_content_type_FromString(char* content_type);

// Enum COVERIMAGECONTENTTYPE for pin_media_source

typedef enum  { pinterest_rest_api_pin_media_source_COVERIMAGECONTENTTYPE_NULL = 0, pinterest_rest_api_pin_media_source_COVERIMAGECONTENTTYPE_image/jpeg, pinterest_rest_api_pin_media_source_COVERIMAGECONTENTTYPE_image/png } pinterest_rest_api_pin_media_source_COVERIMAGECONTENTTYPE_e;

char* pin_media_source_cover_image_content_type_ToString(pinterest_rest_api_pin_media_source_COVERIMAGECONTENTTYPE_e cover_image_content_type);

pinterest_rest_api_pin_media_source_COVERIMAGECONTENTTYPE_e pin_media_source_cover_image_content_type_FromString(char* cover_image_content_type);



typedef struct pin_media_source_t {
    pinterest_rest_api_pin_media_source_SOURCETYPE_e source_type; //enum
    pinterest_rest_api_pin_media_source_CONTENTTYPE_e content_type; //enum
    char *data; // string
    int is_standard; //boolean
    char *url; // string
    char *cover_image_url; // string
    pinterest_rest_api_pin_media_source_COVERIMAGECONTENTTYPE_e cover_image_content_type; //enum
    char *cover_image_data; // string
    char *media_id; // string
    list_t *items; //nonprimitive container
    int index; //numeric
    int is_affiliate_link; //boolean

} pin_media_source_t;

pin_media_source_t *pin_media_source_create(
    pinterest_rest_api_pin_media_source_SOURCETYPE_e source_type,
    pinterest_rest_api_pin_media_source_CONTENTTYPE_e content_type,
    char *data,
    int is_standard,
    char *url,
    char *cover_image_url,
    pinterest_rest_api_pin_media_source_COVERIMAGECONTENTTYPE_e cover_image_content_type,
    char *cover_image_data,
    char *media_id,
    list_t *items,
    int index,
    int is_affiliate_link
);

void pin_media_source_free(pin_media_source_t *pin_media_source);

pin_media_source_t *pin_media_source_parseFromJSON(cJSON *pin_media_sourceJSON);

cJSON *pin_media_source_convertToJSON(pin_media_source_t *pin_media_source);

#endif /* _pin_media_source_H_ */

