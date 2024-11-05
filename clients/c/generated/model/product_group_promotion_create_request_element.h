/*
 * product_group_promotion_create_request_element.h
 *
 * 
 */

#ifndef _product_group_promotion_create_request_element_H_
#define _product_group_promotion_create_request_element_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct product_group_promotion_create_request_element_t product_group_promotion_create_request_element_t;

#include "creative_type.h"
#include "entity_status.h"
#include "grid_click_type.h"

// Enum  for product_group_promotion_create_request_element

typedef enum  { pinterest_rest_api_product_group_promotion_create_request_element__NULL = 0, pinterest_rest_api_product_group_promotion_create_request_element__ACTIVE, pinterest_rest_api_product_group_promotion_create_request_element__PAUSED, pinterest_rest_api_product_group_promotion_create_request_element__ARCHIVED, pinterest_rest_api_product_group_promotion_create_request_element__DRAFT, pinterest_rest_api_product_group_promotion_create_request_element__DELETED_DRAFT } pinterest_rest_api_product_group_promotion_create_request_element__e;

char* product_group_promotion_create_request_element_status_ToString(pinterest_rest_api_product_group_promotion_create_request_element__e status);

pinterest_rest_api_product_group_promotion_create_request_element__e product_group_promotion_create_request_element_status_FromString(char* status);

// Enum  for product_group_promotion_create_request_element

typedef enum  { pinterest_rest_api_product_group_promotion_create_request_element__NULL = 0, pinterest_rest_api_product_group_promotion_create_request_element__CLOSEUP, pinterest_rest_api_product_group_promotion_create_request_element__DIRECT_TO_DESTINATION } pinterest_rest_api_product_group_promotion_create_request_element__e;

char* product_group_promotion_create_request_element_grid_click_type_ToString(pinterest_rest_api_product_group_promotion_create_request_element__e grid_click_type);

pinterest_rest_api_product_group_promotion_create_request_element__e product_group_promotion_create_request_element_grid_click_type_FromString(char* grid_click_type);

// Enum  for product_group_promotion_create_request_element

typedef enum  { pinterest_rest_api_product_group_promotion_create_request_element__NULL = 0, pinterest_rest_api_product_group_promotion_create_request_element__REGULAR, pinterest_rest_api_product_group_promotion_create_request_element__VIDEO, pinterest_rest_api_product_group_promotion_create_request_element__SHOPPING, pinterest_rest_api_product_group_promotion_create_request_element__CAROUSEL, pinterest_rest_api_product_group_promotion_create_request_element__MAX_VIDEO, pinterest_rest_api_product_group_promotion_create_request_element__SHOP_THE_PIN, pinterest_rest_api_product_group_promotion_create_request_element__COLLECTION, pinterest_rest_api_product_group_promotion_create_request_element__IDEA, pinterest_rest_api_product_group_promotion_create_request_element__SHOWCASE, pinterest_rest_api_product_group_promotion_create_request_element__QUIZ } pinterest_rest_api_product_group_promotion_create_request_element__e;

char* product_group_promotion_create_request_element_creative_type_ToString(pinterest_rest_api_product_group_promotion_create_request_element__e creative_type);

pinterest_rest_api_product_group_promotion_create_request_element__e product_group_promotion_create_request_element_creative_type_FromString(char* creative_type);



typedef struct product_group_promotion_create_request_element_t {
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
    char *collections_hero_pin_id; // string
    char *collections_hero_destination_url; // string
    grid_click_type_t *grid_click_type; // custom
    creative_type_t *creative_type; // custom

} product_group_promotion_create_request_element_t;

product_group_promotion_create_request_element_t *product_group_promotion_create_request_element_create(
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
    char *collections_hero_pin_id,
    char *collections_hero_destination_url,
    grid_click_type_t *grid_click_type,
    creative_type_t *creative_type
);

void product_group_promotion_create_request_element_free(product_group_promotion_create_request_element_t *product_group_promotion_create_request_element);

product_group_promotion_create_request_element_t *product_group_promotion_create_request_element_parseFromJSON(cJSON *product_group_promotion_create_request_elementJSON);

cJSON *product_group_promotion_create_request_element_convertToJSON(product_group_promotion_create_request_element_t *product_group_promotion_create_request_element);

#endif /* _product_group_promotion_create_request_element_H_ */

