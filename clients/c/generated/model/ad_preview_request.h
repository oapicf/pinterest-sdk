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

#include "ad_preview_shopping.h"
#include "ad_preview_source_image.h"
#include "ad_preview_source_pin_id.h"
#include "ad_shopping_preview_creative_type.h"
#include "base_preferred_media_type.h"
#include "customizable_cta_type.h"



typedef struct ad_preview_request_t {
    char *image_url; // string
    char *promotion_id; // string
    char *title; // string
    ad_shopping_preview_creative_type_t *creative_type; // custom
    char *pin_id; // string
    char *catalog_product_group_id; // string
    customizable_cta_type_t *customizable_cta_type; // custom
    char *hero_image_title; // string
    char *hero_image_url; // string
    char *hero_pin_id; // string
    char *image_tag; // string
    char *item_id; // string
    base_preferred_media_type_t *preferred_media_type; // custom
    int *show_promotion; //boolean
    char *video_tag; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ad_preview_request_t;

__attribute__((deprecated)) ad_preview_request_t *ad_preview_request_create(
    char *image_url,
    char *promotion_id,
    char *title,
    ad_shopping_preview_creative_type_t *creative_type,
    char *pin_id,
    char *catalog_product_group_id,
    customizable_cta_type_t *customizable_cta_type,
    char *hero_image_title,
    char *hero_image_url,
    char *hero_pin_id,
    char *image_tag,
    char *item_id,
    base_preferred_media_type_t *preferred_media_type,
    int *show_promotion,
    char *video_tag
);

void ad_preview_request_free(ad_preview_request_t *ad_preview_request);

ad_preview_request_t *ad_preview_request_parseFromJSON(cJSON *ad_preview_requestJSON);

cJSON *ad_preview_request_convertToJSON(ad_preview_request_t *ad_preview_request);

#endif /* _ad_preview_request_H_ */

