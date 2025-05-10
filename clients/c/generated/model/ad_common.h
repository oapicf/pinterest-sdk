/*
 * ad_common.h
 *
 * Creation fields
 */

#ifndef _ad_common_H_
#define _ad_common_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_common_t ad_common_t;

#include "creative_type.h"
#include "entity_status.h"
#include "grid_click_type.h"
#include "quiz_pin_data.h"
#include "tracking_urls.h"

// Enum CUSTOMIZABLECTATYPE for ad_common

typedef enum  { pinterest_rest_api_ad_common_CUSTOMIZABLECTATYPE_NULL = 0, pinterest_rest_api_ad_common_CUSTOMIZABLECTATYPE_GET_OFFER, pinterest_rest_api_ad_common_CUSTOMIZABLECTATYPE_LEARN_MORE, pinterest_rest_api_ad_common_CUSTOMIZABLECTATYPE_ORDER_NOW, pinterest_rest_api_ad_common_CUSTOMIZABLECTATYPE_SHOP_NOW, pinterest_rest_api_ad_common_CUSTOMIZABLECTATYPE_SIGN_UP, pinterest_rest_api_ad_common_CUSTOMIZABLECTATYPE_SUBSCRIBE, pinterest_rest_api_ad_common_CUSTOMIZABLECTATYPE_BUY_NOW, pinterest_rest_api_ad_common_CUSTOMIZABLECTATYPE_CONTACT_US, pinterest_rest_api_ad_common_CUSTOMIZABLECTATYPE_GET_QUOTE, pinterest_rest_api_ad_common_CUSTOMIZABLECTATYPE_VISIT_SITE, pinterest_rest_api_ad_common_CUSTOMIZABLECTATYPE_APPLY_NOW, pinterest_rest_api_ad_common_CUSTOMIZABLECTATYPE_BOOK_NOW, pinterest_rest_api_ad_common_CUSTOMIZABLECTATYPE_REQUEST_DEMO, pinterest_rest_api_ad_common_CUSTOMIZABLECTATYPE_REGISTER_NOW, pinterest_rest_api_ad_common_CUSTOMIZABLECTATYPE_FIND_A_DEALER, pinterest_rest_api_ad_common_CUSTOMIZABLECTATYPE_ADD_TO_CART, pinterest_rest_api_ad_common_CUSTOMIZABLECTATYPE_WATCH_NOW, pinterest_rest_api_ad_common_CUSTOMIZABLECTATYPE_READ_MORE } pinterest_rest_api_ad_common_CUSTOMIZABLECTATYPE_e;

char* ad_common_customizable_cta_type_ToString(pinterest_rest_api_ad_common_CUSTOMIZABLECTATYPE_e customizable_cta_type);

pinterest_rest_api_ad_common_CUSTOMIZABLECTATYPE_e ad_common_customizable_cta_type_FromString(char* customizable_cta_type);



typedef struct ad_common_t {
    char *ad_group_id; // string
    char *android_deep_link; // string
    list_t *carousel_android_deep_links; //primitive container
    list_t *carousel_destination_urls; //primitive container
    list_t *carousel_ios_deep_links; //primitive container
    char *click_tracking_url; // string
    pinterest_rest_api_creative_type__e creative_type; //referenced enum
    char *destination_url; // string
    char *ios_deep_link; // string
    int is_pin_deleted; //boolean
    int is_removable; //boolean
    char *name; // string
    pinterest_rest_api_entity_status__e status; //referenced enum
    struct tracking_urls_t *tracking_urls; //model
    char *view_tracking_url; // string
    char *lead_form_id; // string
    pinterest_rest_api_grid_click_type__e grid_click_type; //referenced enum
    pinterest_rest_api_ad_common_CUSTOMIZABLECTATYPE_e customizable_cta_type; //enum
    struct quiz_pin_data_t *quiz_pin_data; //model

    int _library_owned; // Is the library responsible for freeing this object?
} ad_common_t;

__attribute__((deprecated)) ad_common_t *ad_common_create(
    char *ad_group_id,
    char *android_deep_link,
    list_t *carousel_android_deep_links,
    list_t *carousel_destination_urls,
    list_t *carousel_ios_deep_links,
    char *click_tracking_url,
    pinterest_rest_api_creative_type__e creative_type,
    char *destination_url,
    char *ios_deep_link,
    int is_pin_deleted,
    int is_removable,
    char *name,
    pinterest_rest_api_entity_status__e status,
    tracking_urls_t *tracking_urls,
    char *view_tracking_url,
    char *lead_form_id,
    pinterest_rest_api_grid_click_type__e grid_click_type,
    pinterest_rest_api_ad_common_CUSTOMIZABLECTATYPE_e customizable_cta_type,
    quiz_pin_data_t *quiz_pin_data
);

void ad_common_free(ad_common_t *ad_common);

ad_common_t *ad_common_parseFromJSON(cJSON *ad_commonJSON);

cJSON *ad_common_convertToJSON(ad_common_t *ad_common);

#endif /* _ad_common_H_ */

