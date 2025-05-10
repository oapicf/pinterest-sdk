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

#include "entity_status.h"
#include "grid_click_type.h"



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
    pinterest_rest_api_entity_status__e status; //referenced enum
    char *tracking_url; // string
    char *catalog_product_group_id; // string
    char *catalog_product_group_name; // string
    char *collections_hero_pin_id; // string
    char *collections_hero_destination_url; // string
    pinterest_rest_api_grid_click_type__e grid_click_type; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} product_group_promotion_t;

__attribute__((deprecated)) product_group_promotion_t *product_group_promotion_create(
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
    pinterest_rest_api_entity_status__e status,
    char *tracking_url,
    char *catalog_product_group_id,
    char *catalog_product_group_name,
    char *collections_hero_pin_id,
    char *collections_hero_destination_url,
    pinterest_rest_api_grid_click_type__e grid_click_type
);

void product_group_promotion_free(product_group_promotion_t *product_group_promotion);

product_group_promotion_t *product_group_promotion_parseFromJSON(cJSON *product_group_promotionJSON);

cJSON *product_group_promotion_convertToJSON(product_group_promotion_t *product_group_promotion);

#endif /* _product_group_promotion_H_ */

