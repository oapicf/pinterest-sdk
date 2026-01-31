/*
 * ad_preview_request.h
 *
 * 
 */

#ifndef _ad_preview_request_H_
#define _ad_preview_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_preview_request_t ad_preview_request_t;

#include "ad_preview_create_from_image.h"
#include "ad_preview_create_from_pin.h"
#include "ad_preview_shopping.h"
#include "customizable_cta_type.h"

// Enum CREATIVETYPE for ad_preview_request

typedef enum  { pinterest_rest_api_ad_preview_request_CREATIVETYPE_NULL = 0, pinterest_rest_api_ad_preview_request_CREATIVETYPE_SHOPPING, pinterest_rest_api_ad_preview_request_CREATIVETYPE_CAROUSEL, pinterest_rest_api_ad_preview_request_CREATIVETYPE_COLLECTION, pinterest_rest_api_ad_preview_request_CREATIVETYPE_REGULAR } pinterest_rest_api_ad_preview_request_CREATIVETYPE_e;

char* ad_preview_request_creative_type_ToString(pinterest_rest_api_ad_preview_request_CREATIVETYPE_e creative_type);

pinterest_rest_api_ad_preview_request_CREATIVETYPE_e ad_preview_request_creative_type_FromString(char* creative_type);

// Enum PREFERREDMEDIATYPE for ad_preview_request

typedef enum  { pinterest_rest_api_ad_preview_request_PREFERREDMEDIATYPE_NULL = 0, pinterest_rest_api_ad_preview_request_PREFERREDMEDIATYPE_VIDEO, pinterest_rest_api_ad_preview_request_PREFERREDMEDIATYPE_IMAGE } pinterest_rest_api_ad_preview_request_PREFERREDMEDIATYPE_e;

char* ad_preview_request_preferred_media_type_ToString(pinterest_rest_api_ad_preview_request_PREFERREDMEDIATYPE_e preferred_media_type);

pinterest_rest_api_ad_preview_request_PREFERREDMEDIATYPE_e ad_preview_request_preferred_media_type_FromString(char* preferred_media_type);



typedef struct ad_preview_request_t {
    char *image_url; // string
    char *title; // string
    char *pin_id; // string
    char *catalog_product_group_id; // string
    pinterest_rest_api_ad_preview_request_CREATIVETYPE_e creative_type; //enum
    customizable_cta_type_t *customizable_cta_type; // custom
    char *hero_image_title; // string
    char *hero_image_url; // string
    char *hero_pin_id; // string
    char *image_tag; // string
    char *item_id; // string
    pinterest_rest_api_ad_preview_request_PREFERREDMEDIATYPE_e preferred_media_type; //enum
    char *video_tag; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ad_preview_request_t;

__attribute__((deprecated)) ad_preview_request_t *ad_preview_request_create(
    char *image_url,
    char *title,
    char *pin_id,
    char *catalog_product_group_id,
    pinterest_rest_api_ad_preview_request_CREATIVETYPE_e creative_type,
    customizable_cta_type_t *customizable_cta_type,
    char *hero_image_title,
    char *hero_image_url,
    char *hero_pin_id,
    char *image_tag,
    char *item_id,
    pinterest_rest_api_ad_preview_request_PREFERREDMEDIATYPE_e preferred_media_type,
    char *video_tag
);

void ad_preview_request_free(ad_preview_request_t *ad_preview_request);

ad_preview_request_t *ad_preview_request_parseFromJSON(cJSON *ad_preview_requestJSON);

cJSON *ad_preview_request_convertToJSON(ad_preview_request_t *ad_preview_request);

#endif /* _ad_preview_request_H_ */

