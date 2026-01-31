/*
 * product_group_promotion.h
 *
 * 
 */

#ifndef _product_group_promotion_H_
#define _product_group_promotion_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct product_group_promotion_t product_group_promotion_t;

#include "creative_type.h"
#include "entity_status.h"
#include "grid_click_type.h"

// Enum COLLECTIONSHEADERTYPE for product_group_promotion

typedef enum  { pinterest_rest_api_product_group_promotion_COLLECTIONSHEADERTYPE_NULL = 0, pinterest_rest_api_product_group_promotion_COLLECTIONSHEADERTYPE_SHOP_THIS_COLLECTION, pinterest_rest_api_product_group_promotion_COLLECTIONSHEADERTYPE_EXPLORE_THIS_COLLECTION, pinterest_rest_api_product_group_promotion_COLLECTIONSHEADERTYPE_NO_HEADER, pinterest_rest_api_product_group_promotion_COLLECTIONSHEADERTYPE_ON_SALE, pinterest_rest_api_product_group_promotion_COLLECTIONSHEADERTYPE_GET_DEAL } pinterest_rest_api_product_group_promotion_COLLECTIONSHEADERTYPE_e;

char* product_group_promotion_collections_header_type_ToString(pinterest_rest_api_product_group_promotion_COLLECTIONSHEADERTYPE_e collections_header_type);

pinterest_rest_api_product_group_promotion_COLLECTIONSHEADERTYPE_e product_group_promotion_collections_header_type_FromString(char* collections_header_type);

// Enum CUSTOMIZABLECTATYPE for product_group_promotion

typedef enum  { pinterest_rest_api_product_group_promotion_CUSTOMIZABLECTATYPE_NULL = 0, pinterest_rest_api_product_group_promotion_CUSTOMIZABLECTATYPE_SHOP_NOW, pinterest_rest_api_product_group_promotion_CUSTOMIZABLECTATYPE_BOOK_NOW, pinterest_rest_api_product_group_promotion_CUSTOMIZABLECTATYPE_ON_SALE, pinterest_rest_api_product_group_promotion_CUSTOMIZABLECTATYPE_GET_DEAL, pinterest_rest_api_product_group_promotion_CUSTOMIZABLECTATYPE_BUY_ONLINE_PICKUP_IN_STORE } pinterest_rest_api_product_group_promotion_CUSTOMIZABLECTATYPE_e;

char* product_group_promotion_customizable_cta_type_ToString(pinterest_rest_api_product_group_promotion_CUSTOMIZABLECTATYPE_e customizable_cta_type);

pinterest_rest_api_product_group_promotion_CUSTOMIZABLECTATYPE_e product_group_promotion_customizable_cta_type_FromString(char* customizable_cta_type);

// Enum PREFERREDMEDIATYPE for product_group_promotion

typedef enum  { pinterest_rest_api_product_group_promotion_PREFERREDMEDIATYPE_NULL = 0, pinterest_rest_api_product_group_promotion_PREFERREDMEDIATYPE_VIDEO, pinterest_rest_api_product_group_promotion_PREFERREDMEDIATYPE_IMAGE } pinterest_rest_api_product_group_promotion_PREFERREDMEDIATYPE_e;

char* product_group_promotion_preferred_media_type_ToString(pinterest_rest_api_product_group_promotion_PREFERREDMEDIATYPE_e preferred_media_type);

pinterest_rest_api_product_group_promotion_PREFERREDMEDIATYPE_e product_group_promotion_preferred_media_type_FromString(char* preferred_media_type);



typedef struct product_group_promotion_t {
    char *ad_group_id; // string
    int bid_in_micro_currency; //numeric
    char *catalog_product_group_id; // string
    char *catalog_product_group_name; // string
    pinterest_rest_api_product_group_promotion_COLLECTIONSHEADERTYPE_e collections_header_type; //enum
    char *collections_hero_destination_url; // string
    char *collections_hero_pin_id; // string
    pinterest_rest_api_creative_type__e creative_type; //referenced enum
    pinterest_rest_api_product_group_promotion_CUSTOMIZABLECTATYPE_e customizable_cta_type; //enum
    char *definition; // string
    pinterest_rest_api_grid_click_type__e grid_click_type; //referenced enum
    char *id; // string
    int included; //boolean
    int is_generate_background; //boolean
    int is_mdl; //boolean
    char *parent_id; // string
    pinterest_rest_api_product_group_promotion_PREFERREDMEDIATYPE_e preferred_media_type; //enum
    char *relative_definition; // string
    char *selected_image_tag; // string
    char *selected_video_tag; // string
    char *slideshow_collections_description; // string
    char *slideshow_collections_title; // string
    pinterest_rest_api_entity_status__e status; //referenced enum
    char *tracking_url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} product_group_promotion_t;

__attribute__((deprecated)) product_group_promotion_t *product_group_promotion_create(
    char *ad_group_id,
    int bid_in_micro_currency,
    char *catalog_product_group_id,
    char *catalog_product_group_name,
    pinterest_rest_api_product_group_promotion_COLLECTIONSHEADERTYPE_e collections_header_type,
    char *collections_hero_destination_url,
    char *collections_hero_pin_id,
    pinterest_rest_api_creative_type__e creative_type,
    pinterest_rest_api_product_group_promotion_CUSTOMIZABLECTATYPE_e customizable_cta_type,
    char *definition,
    pinterest_rest_api_grid_click_type__e grid_click_type,
    char *id,
    int included,
    int is_generate_background,
    int is_mdl,
    char *parent_id,
    pinterest_rest_api_product_group_promotion_PREFERREDMEDIATYPE_e preferred_media_type,
    char *relative_definition,
    char *selected_image_tag,
    char *selected_video_tag,
    char *slideshow_collections_description,
    char *slideshow_collections_title,
    pinterest_rest_api_entity_status__e status,
    char *tracking_url
);

void product_group_promotion_free(product_group_promotion_t *product_group_promotion);

product_group_promotion_t *product_group_promotion_parseFromJSON(cJSON *product_group_promotionJSON);

cJSON *product_group_promotion_convertToJSON(product_group_promotion_t *product_group_promotion);

#endif /* _product_group_promotion_H_ */

