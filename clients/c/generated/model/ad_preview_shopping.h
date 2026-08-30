/*
 * ad_preview_shopping.h
 *
 * Ad preview from a catalog product group (shopping).
 */

#ifndef _ad_preview_shopping_H_
#define _ad_preview_shopping_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_preview_shopping_t ad_preview_shopping_t;

#include "ad_shopping_preview_creative_type.h"
#include "base_preferred_media_type.h"
#include "customizable_cta_type.h"



typedef struct ad_preview_shopping_t {
    char *catalog_product_group_id; // string
    ad_shopping_preview_creative_type_t *creative_type; // custom
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
} ad_preview_shopping_t;

__attribute__((deprecated)) ad_preview_shopping_t *ad_preview_shopping_create(
    char *catalog_product_group_id,
    ad_shopping_preview_creative_type_t *creative_type,
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

void ad_preview_shopping_free(ad_preview_shopping_t *ad_preview_shopping);

ad_preview_shopping_t *ad_preview_shopping_parseFromJSON(cJSON *ad_preview_shoppingJSON);

cJSON *ad_preview_shopping_convertToJSON(ad_preview_shopping_t *ad_preview_shopping);

#endif /* _ad_preview_shopping_H_ */

