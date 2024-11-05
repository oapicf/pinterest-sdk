/*
 * ad_update_request.h
 *
 * 
 */

#ifndef _ad_update_request_H_
#define _ad_update_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_update_request_t ad_update_request_t;

#include "creative_type.h"
#include "entity_status.h"
#include "grid_click_type.h"
#include "quiz_pin_data.h"
#include "tracking_urls.h"

// Enum  for ad_update_request

typedef enum  { pinterest_rest_api_ad_update_request__NULL = 0, pinterest_rest_api_ad_update_request__REGULAR, pinterest_rest_api_ad_update_request__VIDEO, pinterest_rest_api_ad_update_request__SHOPPING, pinterest_rest_api_ad_update_request__CAROUSEL, pinterest_rest_api_ad_update_request__MAX_VIDEO, pinterest_rest_api_ad_update_request__SHOP_THE_PIN, pinterest_rest_api_ad_update_request__COLLECTION, pinterest_rest_api_ad_update_request__IDEA, pinterest_rest_api_ad_update_request__SHOWCASE, pinterest_rest_api_ad_update_request__QUIZ } pinterest_rest_api_ad_update_request__e;

char* ad_update_request_creative_type_ToString(pinterest_rest_api_ad_update_request__e creative_type);

pinterest_rest_api_ad_update_request__e ad_update_request_creative_type_FromString(char* creative_type);

// Enum  for ad_update_request

typedef enum  { pinterest_rest_api_ad_update_request__NULL = 0, pinterest_rest_api_ad_update_request__ACTIVE, pinterest_rest_api_ad_update_request__PAUSED, pinterest_rest_api_ad_update_request__ARCHIVED, pinterest_rest_api_ad_update_request__DRAFT, pinterest_rest_api_ad_update_request__DELETED_DRAFT } pinterest_rest_api_ad_update_request__e;

char* ad_update_request_status_ToString(pinterest_rest_api_ad_update_request__e status);

pinterest_rest_api_ad_update_request__e ad_update_request_status_FromString(char* status);

// Enum  for ad_update_request

typedef enum  { pinterest_rest_api_ad_update_request__NULL = 0, pinterest_rest_api_ad_update_request__CLOSEUP, pinterest_rest_api_ad_update_request__DIRECT_TO_DESTINATION } pinterest_rest_api_ad_update_request__e;

char* ad_update_request_grid_click_type_ToString(pinterest_rest_api_ad_update_request__e grid_click_type);

pinterest_rest_api_ad_update_request__e ad_update_request_grid_click_type_FromString(char* grid_click_type);

// Enum CUSTOMIZABLECTATYPE for ad_update_request

typedef enum  { pinterest_rest_api_ad_update_request_CUSTOMIZABLECTATYPE_NULL = 0, pinterest_rest_api_ad_update_request_CUSTOMIZABLECTATYPE_GET_OFFER, pinterest_rest_api_ad_update_request_CUSTOMIZABLECTATYPE_LEARN_MORE, pinterest_rest_api_ad_update_request_CUSTOMIZABLECTATYPE_ORDER_NOW, pinterest_rest_api_ad_update_request_CUSTOMIZABLECTATYPE_SHOP_NOW, pinterest_rest_api_ad_update_request_CUSTOMIZABLECTATYPE_SIGN_UP, pinterest_rest_api_ad_update_request_CUSTOMIZABLECTATYPE_SUBSCRIBE, pinterest_rest_api_ad_update_request_CUSTOMIZABLECTATYPE_BUY_NOW, pinterest_rest_api_ad_update_request_CUSTOMIZABLECTATYPE_CONTACT_US, pinterest_rest_api_ad_update_request_CUSTOMIZABLECTATYPE_GET_QUOTE, pinterest_rest_api_ad_update_request_CUSTOMIZABLECTATYPE_VISIT_SITE, pinterest_rest_api_ad_update_request_CUSTOMIZABLECTATYPE_APPLY_NOW, pinterest_rest_api_ad_update_request_CUSTOMIZABLECTATYPE_BOOK_NOW, pinterest_rest_api_ad_update_request_CUSTOMIZABLECTATYPE_REQUEST_DEMO, pinterest_rest_api_ad_update_request_CUSTOMIZABLECTATYPE_REGISTER_NOW, pinterest_rest_api_ad_update_request_CUSTOMIZABLECTATYPE_FIND_A_DEALER, pinterest_rest_api_ad_update_request_CUSTOMIZABLECTATYPE_ADD_TO_CART, pinterest_rest_api_ad_update_request_CUSTOMIZABLECTATYPE_WATCH_NOW, pinterest_rest_api_ad_update_request_CUSTOMIZABLECTATYPE_READ_MORE } pinterest_rest_api_ad_update_request_CUSTOMIZABLECTATYPE_e;

char* ad_update_request_customizable_cta_type_ToString(pinterest_rest_api_ad_update_request_CUSTOMIZABLECTATYPE_e customizable_cta_type);

pinterest_rest_api_ad_update_request_CUSTOMIZABLECTATYPE_e ad_update_request_customizable_cta_type_FromString(char* customizable_cta_type);



typedef struct ad_update_request_t {
    char *ad_group_id; // string
    char *android_deep_link; // string
    list_t *carousel_android_deep_links; //primitive container
    list_t *carousel_destination_urls; //primitive container
    list_t *carousel_ios_deep_links; //primitive container
    char *click_tracking_url; // string
    creative_type_t *creative_type; // custom
    char *destination_url; // string
    char *ios_deep_link; // string
    int is_pin_deleted; //boolean
    int is_removable; //boolean
    char *name; // string
    entity_status_t *status; // custom
    struct tracking_urls_t *tracking_urls; //model
    char *view_tracking_url; // string
    char *lead_form_id; // string
    grid_click_type_t *grid_click_type; // custom
    pinterest_rest_api_ad_update_request_CUSTOMIZABLECTATYPE_e customizable_cta_type; //enum
    struct quiz_pin_data_t *quiz_pin_data; //model
    char *id; // string
    char *pin_id; // string

} ad_update_request_t;

ad_update_request_t *ad_update_request_create(
    char *ad_group_id,
    char *android_deep_link,
    list_t *carousel_android_deep_links,
    list_t *carousel_destination_urls,
    list_t *carousel_ios_deep_links,
    char *click_tracking_url,
    creative_type_t *creative_type,
    char *destination_url,
    char *ios_deep_link,
    int is_pin_deleted,
    int is_removable,
    char *name,
    entity_status_t *status,
    tracking_urls_t *tracking_urls,
    char *view_tracking_url,
    char *lead_form_id,
    grid_click_type_t *grid_click_type,
    pinterest_rest_api_ad_update_request_CUSTOMIZABLECTATYPE_e customizable_cta_type,
    quiz_pin_data_t *quiz_pin_data,
    char *id,
    char *pin_id
);

void ad_update_request_free(ad_update_request_t *ad_update_request);

ad_update_request_t *ad_update_request_parseFromJSON(cJSON *ad_update_requestJSON);

cJSON *ad_update_request_convertToJSON(ad_update_request_t *ad_update_request);

#endif /* _ad_update_request_H_ */

