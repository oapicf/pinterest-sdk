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

// Enum  for product_group_promotion

typedef enum  { pinterest_rest_api_product_group_promotion__NULL = 0, pinterest_rest_api_product_group_promotion__ACTIVE, pinterest_rest_api_product_group_promotion__PAUSED, pinterest_rest_api_product_group_promotion__ARCHIVED, pinterest_rest_api_product_group_promotion__DRAFT, pinterest_rest_api_product_group_promotion__DELETED_DRAFT } pinterest_rest_api_product_group_promotion__e;

char* product_group_promotion_status_ToString(pinterest_rest_api_product_group_promotion__e status);

pinterest_rest_api_product_group_promotion__e product_group_promotion_status_FromString(char* status);

// Enum  for product_group_promotion

typedef enum  { pinterest_rest_api_product_group_promotion__NULL = 0, pinterest_rest_api_product_group_promotion__REGULAR, pinterest_rest_api_product_group_promotion__VIDEO, pinterest_rest_api_product_group_promotion__SHOPPING, pinterest_rest_api_product_group_promotion__CAROUSEL, pinterest_rest_api_product_group_promotion__MAX_VIDEO, pinterest_rest_api_product_group_promotion__SHOP_THE_PIN, pinterest_rest_api_product_group_promotion__COLLECTION, pinterest_rest_api_product_group_promotion__IDEA, pinterest_rest_api_product_group_promotion__SHOWCASE, pinterest_rest_api_product_group_promotion__QUIZ } pinterest_rest_api_product_group_promotion__e;

char* product_group_promotion_creative_type_ToString(pinterest_rest_api_product_group_promotion__e creative_type);

pinterest_rest_api_product_group_promotion__e product_group_promotion_creative_type_FromString(char* creative_type);

// Enum  for product_group_promotion

typedef enum  { pinterest_rest_api_product_group_promotion__NULL = 0, pinterest_rest_api_product_group_promotion__CLOSEUP, pinterest_rest_api_product_group_promotion__DIRECT_TO_DESTINATION } pinterest_rest_api_product_group_promotion__e;

char* product_group_promotion_grid_click_type_ToString(pinterest_rest_api_product_group_promotion__e grid_click_type);

pinterest_rest_api_product_group_promotion__e product_group_promotion_grid_click_type_FromString(char* grid_click_type);



typedef struct product_group_promotion_t {
    char *id; // string
    char *ad_group_id; // string
    int bid_in_micro_currency; //numeric
    int included; //boolean
    char *definition; // string
    char *relative_definition; // string
    char *parent_id; // string
    char *slideshow_collections_title; // string
    char *slideshow_collections_description; // string
    int is_mdl; //boolean
    entity_status_t *status; // custom
    char *tracking_url; // string
    char *catalog_product_group_id; // string
    char *catalog_product_group_name; // string
    creative_type_t *creative_type; // custom
    char *collections_hero_pin_id; // string
    char *collections_hero_destination_url; // string
    grid_click_type_t *grid_click_type; // custom

} product_group_promotion_t;

product_group_promotion_t *product_group_promotion_create(
    char *id,
    char *ad_group_id,
    int bid_in_micro_currency,
    int included,
    char *definition,
    char *relative_definition,
    char *parent_id,
    char *slideshow_collections_title,
    char *slideshow_collections_description,
    int is_mdl,
    entity_status_t *status,
    char *tracking_url,
    char *catalog_product_group_id,
    char *catalog_product_group_name,
    creative_type_t *creative_type,
    char *collections_hero_pin_id,
    char *collections_hero_destination_url,
    grid_click_type_t *grid_click_type
);

void product_group_promotion_free(product_group_promotion_t *product_group_promotion);

product_group_promotion_t *product_group_promotion_parseFromJSON(cJSON *product_group_promotionJSON);

cJSON *product_group_promotion_convertToJSON(product_group_promotion_t *product_group_promotion);

#endif /* _product_group_promotion_H_ */

