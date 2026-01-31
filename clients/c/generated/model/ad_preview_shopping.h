/*
 * ad_preview_shopping.h
 *
 * 
 */

#ifndef _ad_preview_shopping_H_
#define _ad_preview_shopping_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_preview_shopping_t ad_preview_shopping_t;

#include "customizable_cta_type.h"

// Enum CREATIVETYPE for ad_preview_shopping

typedef enum  { pinterest_rest_api_ad_preview_shopping_CREATIVETYPE_NULL = 0, pinterest_rest_api_ad_preview_shopping_CREATIVETYPE_SHOPPING, pinterest_rest_api_ad_preview_shopping_CREATIVETYPE_CAROUSEL, pinterest_rest_api_ad_preview_shopping_CREATIVETYPE_COLLECTION, pinterest_rest_api_ad_preview_shopping_CREATIVETYPE_REGULAR } pinterest_rest_api_ad_preview_shopping_CREATIVETYPE_e;

char* ad_preview_shopping_creative_type_ToString(pinterest_rest_api_ad_preview_shopping_CREATIVETYPE_e creative_type);

pinterest_rest_api_ad_preview_shopping_CREATIVETYPE_e ad_preview_shopping_creative_type_FromString(char* creative_type);

// Enum PREFERREDMEDIATYPE for ad_preview_shopping

typedef enum  { pinterest_rest_api_ad_preview_shopping_PREFERREDMEDIATYPE_NULL = 0, pinterest_rest_api_ad_preview_shopping_PREFERREDMEDIATYPE_VIDEO, pinterest_rest_api_ad_preview_shopping_PREFERREDMEDIATYPE_IMAGE } pinterest_rest_api_ad_preview_shopping_PREFERREDMEDIATYPE_e;

char* ad_preview_shopping_preferred_media_type_ToString(pinterest_rest_api_ad_preview_shopping_PREFERREDMEDIATYPE_e preferred_media_type);

pinterest_rest_api_ad_preview_shopping_PREFERREDMEDIATYPE_e ad_preview_shopping_preferred_media_type_FromString(char* preferred_media_type);



typedef struct ad_preview_shopping_t {
    char *catalog_product_group_id; // string
    pinterest_rest_api_ad_preview_shopping_CREATIVETYPE_e creative_type; //enum
    customizable_cta_type_t *customizable_cta_type; // custom
    char *hero_image_title; // string
    char *hero_image_url; // string
    char *hero_pin_id; // string
    char *image_tag; // string
    char *item_id; // string
    pinterest_rest_api_ad_preview_shopping_PREFERREDMEDIATYPE_e preferred_media_type; //enum
    char *video_tag; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ad_preview_shopping_t;

__attribute__((deprecated)) ad_preview_shopping_t *ad_preview_shopping_create(
    char *catalog_product_group_id,
    pinterest_rest_api_ad_preview_shopping_CREATIVETYPE_e creative_type,
    customizable_cta_type_t *customizable_cta_type,
    char *hero_image_title,
    char *hero_image_url,
    char *hero_pin_id,
    char *image_tag,
    char *item_id,
    pinterest_rest_api_ad_preview_shopping_PREFERREDMEDIATYPE_e preferred_media_type,
    char *video_tag
);

void ad_preview_shopping_free(ad_preview_shopping_t *ad_preview_shopping);

ad_preview_shopping_t *ad_preview_shopping_parseFromJSON(cJSON *ad_preview_shoppingJSON);

cJSON *ad_preview_shopping_convertToJSON(ad_preview_shopping_t *ad_preview_shopping);

#endif /* _ad_preview_shopping_H_ */

