/*
 * ad_response.h
 *
 * 
 */

#ifndef _ad_response_H_
#define _ad_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_response_t ad_response_t;

#include "ad_common_quiz_pin_data.h"
#include "ad_common_tracking_urls.h"
#include "creative_type.h"
#include "entity_status.h"
#include "grid_click_type.h"
#include "pin_promotion_summary_status.h"

// Enum  for ad_response

typedef enum  { pinterest_rest_api_ad_response__NULL = 0, pinterest_rest_api_ad_response__REGULAR, pinterest_rest_api_ad_response__VIDEO, pinterest_rest_api_ad_response__SHOPPING, pinterest_rest_api_ad_response__CAROUSEL, pinterest_rest_api_ad_response__MAX_VIDEO, pinterest_rest_api_ad_response__SHOP_THE_PIN, pinterest_rest_api_ad_response__COLLECTION, pinterest_rest_api_ad_response__IDEA, pinterest_rest_api_ad_response__SHOWCASE, pinterest_rest_api_ad_response__QUIZ } pinterest_rest_api_ad_response__e;

char* ad_response_creative_type_ToString(pinterest_rest_api_ad_response__e creative_type);

pinterest_rest_api_ad_response__e ad_response_creative_type_FromString(char* creative_type);

// Enum  for ad_response

typedef enum  { pinterest_rest_api_ad_response__NULL = 0, pinterest_rest_api_ad_response__ACTIVE, pinterest_rest_api_ad_response__PAUSED, pinterest_rest_api_ad_response__ARCHIVED, pinterest_rest_api_ad_response__DRAFT, pinterest_rest_api_ad_response__DELETED_DRAFT } pinterest_rest_api_ad_response__e;

char* ad_response_status_ToString(pinterest_rest_api_ad_response__e status);

pinterest_rest_api_ad_response__e ad_response_status_FromString(char* status);

// Enum  for ad_response

typedef enum  { pinterest_rest_api_ad_response__NULL = 0, pinterest_rest_api_ad_response__CLOSEUP, pinterest_rest_api_ad_response__DIRECT_TO_DESTINATION } pinterest_rest_api_ad_response__e;

char* ad_response_grid_click_type_ToString(pinterest_rest_api_ad_response__e grid_click_type);

pinterest_rest_api_ad_response__e ad_response_grid_click_type_FromString(char* grid_click_type);

// Enum CUSTOMIZABLECTATYPE for ad_response

typedef enum  { pinterest_rest_api_ad_response_CUSTOMIZABLECTATYPE_NULL = 0, pinterest_rest_api_ad_response_CUSTOMIZABLECTATYPE_GET_OFFER, pinterest_rest_api_ad_response_CUSTOMIZABLECTATYPE_LEARN_MORE, pinterest_rest_api_ad_response_CUSTOMIZABLECTATYPE_ORDER_NOW, pinterest_rest_api_ad_response_CUSTOMIZABLECTATYPE_SHOP_NOW, pinterest_rest_api_ad_response_CUSTOMIZABLECTATYPE_SIGN_UP, pinterest_rest_api_ad_response_CUSTOMIZABLECTATYPE_SUBSCRIBE, pinterest_rest_api_ad_response_CUSTOMIZABLECTATYPE_BUY_NOW, pinterest_rest_api_ad_response_CUSTOMIZABLECTATYPE_CONTACT_US, pinterest_rest_api_ad_response_CUSTOMIZABLECTATYPE_GET_QUOTE, pinterest_rest_api_ad_response_CUSTOMIZABLECTATYPE_VISIT_WEBSITE, pinterest_rest_api_ad_response_CUSTOMIZABLECTATYPE_APPLY_NOW, pinterest_rest_api_ad_response_CUSTOMIZABLECTATYPE_BOOK_NOW, pinterest_rest_api_ad_response_CUSTOMIZABLECTATYPE_REQUEST_DEMO, pinterest_rest_api_ad_response_CUSTOMIZABLECTATYPE_REGISTER_NOW, pinterest_rest_api_ad_response_CUSTOMIZABLECTATYPE_FIND_A_DEALER, pinterest_rest_api_ad_response_CUSTOMIZABLECTATYPE_ADD_TO_CART, pinterest_rest_api_ad_response_CUSTOMIZABLECTATYPE_WATCH_NOW, pinterest_rest_api_ad_response_CUSTOMIZABLECTATYPE_READ_MORE, pinterest_rest_api_ad_response_CUSTOMIZABLECTATYPE_null } pinterest_rest_api_ad_response_CUSTOMIZABLECTATYPE_e;

char* ad_response_customizable_cta_type_ToString(pinterest_rest_api_ad_response_CUSTOMIZABLECTATYPE_e customizable_cta_type);

pinterest_rest_api_ad_response_CUSTOMIZABLECTATYPE_e ad_response_customizable_cta_type_FromString(char* customizable_cta_type);

// Enum REJECTEDREASONS for ad_response

typedef enum  { pinterest_rest_api_ad_response_REJECTEDREASONS_NULL = 0, pinterest_rest_api_ad_response_REJECTEDREASONS_HASHTAGS, pinterest_rest_api_ad_response_REJECTEDREASONS_PROMOTIONS_AND_PRICES, pinterest_rest_api_ad_response_REJECTEDREASONS_TARGETING, pinterest_rest_api_ad_response_REJECTEDREASONS_LANDING_PAGE, pinterest_rest_api_ad_response_REJECTEDREASONS_CAPS_AND_SYMBOLS, pinterest_rest_api_ad_response_REJECTEDREASONS_SHOCKING, pinterest_rest_api_ad_response_REJECTEDREASONS_WEIGHT_LOSS, pinterest_rest_api_ad_response_REJECTEDREASONS_PROHIBITED_PRODUCT, pinterest_rest_api_ad_response_REJECTEDREASONS_AUTHENTICITY, pinterest_rest_api_ad_response_REJECTEDREASONS_NUDITY, pinterest_rest_api_ad_response_REJECTEDREASONS_CONFUSING_DESIGN, pinterest_rest_api_ad_response_REJECTEDREASONS_URGENCY, pinterest_rest_api_ad_response_REJECTEDREASONS_RATINGS, pinterest_rest_api_ad_response_REJECTEDREASONS_APP, pinterest_rest_api_ad_response_REJECTEDREASONS_ALCOHOL, pinterest_rest_api_ad_response_REJECTEDREASONS_CONTESTS, pinterest_rest_api_ad_response_REJECTEDREASONS_POLITICAL, pinterest_rest_api_ad_response_REJECTEDREASONS_OTHER, pinterest_rest_api_ad_response_REJECTEDREASONS_IMAGE, pinterest_rest_api_ad_response_REJECTEDREASONS_NAR, pinterest_rest_api_ad_response_REJECTEDREASONS_INCONSISTENT, pinterest_rest_api_ad_response_REJECTEDREASONS_CLICKBAIT, pinterest_rest_api_ad_response_REJECTEDREASONS_NO_DESCRIPTION, pinterest_rest_api_ad_response_REJECTEDREASONS_LOW_QUALITY, pinterest_rest_api_ad_response_REJECTEDREASONS_EXAGGERATED_CLAIMS, pinterest_rest_api_ad_response_REJECTEDREASONS_PINTEREST_BRAND, pinterest_rest_api_ad_response_REJECTEDREASONS_ALCOHOL_NO_SALE, pinterest_rest_api_ad_response_REJECTEDREASONS_LANDING_PAGE_SPEED, pinterest_rest_api_ad_response_REJECTEDREASONS_LANDING_PAGE_HARDWALL, pinterest_rest_api_ad_response_REJECTEDREASONS_LANDING_PAGE_BROKEN, pinterest_rest_api_ad_response_REJECTEDREASONS_LANDING_PAGE_QUALITY, pinterest_rest_api_ad_response_REJECTEDREASONS_OUT_OF_STOCK, pinterest_rest_api_ad_response_REJECTEDREASONS_IMAGE_LOW_QUALITY, pinterest_rest_api_ad_response_REJECTEDREASONS_IMAGE_BUSY, pinterest_rest_api_ad_response_REJECTEDREASONS_IMAGE_POORLY_EDITED, pinterest_rest_api_ad_response_REJECTEDREASONS_IMAGE_BEFORE_AFTER, pinterest_rest_api_ad_response_REJECTEDREASONS_UGC, pinterest_rest_api_ad_response_REJECTEDREASONS_FAKE_BUTTONS, pinterest_rest_api_ad_response_REJECTEDREASONS_WEAPONS, pinterest_rest_api_ad_response_REJECTEDREASONS_SENSITIVE, pinterest_rest_api_ad_response_REJECTEDREASONS_UNACCEPTABLE_BUSINESS, pinterest_rest_api_ad_response_REJECTEDREASONS_SUSPICIOUS_CLAIMS, pinterest_rest_api_ad_response_REJECTEDREASONS_PHARMA, pinterest_rest_api_ad_response_REJECTEDREASONS_SUSPICIOUS_SUPPLEMENTS, pinterest_rest_api_ad_response_REJECTEDREASONS_ILLEGAL_RECREATIONAL_DRUG, pinterest_rest_api_ad_response_REJECTEDREASONS_LOW_QUALITY_LANDING_PAGE, pinterest_rest_api_ad_response_REJECTEDREASONS_RESTRICTED_HEALTHCARE, pinterest_rest_api_ad_response_REJECTEDREASONS_INCONSISTENT_LANG_FR } pinterest_rest_api_ad_response_REJECTEDREASONS_e;

char* ad_response_rejected_reasons_ToString(pinterest_rest_api_ad_response_REJECTEDREASONS_e rejected_reasons);

pinterest_rest_api_ad_response_REJECTEDREASONS_e ad_response_rejected_reasons_FromString(char* rejected_reasons);

// Enum REVIEWSTATUS for ad_response

typedef enum  { pinterest_rest_api_ad_response_REVIEWSTATUS_NULL = 0, pinterest_rest_api_ad_response_REVIEWSTATUS_OTHER, pinterest_rest_api_ad_response_REVIEWSTATUS_PENDING, pinterest_rest_api_ad_response_REVIEWSTATUS_REJECTED, pinterest_rest_api_ad_response_REVIEWSTATUS_APPROVED } pinterest_rest_api_ad_response_REVIEWSTATUS_e;

char* ad_response_review_status_ToString(pinterest_rest_api_ad_response_REVIEWSTATUS_e review_status);

pinterest_rest_api_ad_response_REVIEWSTATUS_e ad_response_review_status_FromString(char* review_status);



typedef struct ad_response_t {
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
    struct ad_common_tracking_urls_t *tracking_urls; //model
    char *view_tracking_url; // string
    char *lead_form_id; // string
    grid_click_type_t *grid_click_type; // custom
    pinterest_rest_api_ad_response_CUSTOMIZABLECTATYPE_e customizable_cta_type; //enum
    struct ad_common_quiz_pin_data_t *quiz_pin_data; //model
    char *pin_id; // string
    char *ad_account_id; // string
    char *campaign_id; // string
    char *collection_items_destination_url_template; // string
    int created_time; //numeric
    char *id; // string
    list_t *rejected_reasons; //primitive container
    list_t *rejection_labels; //primitive container
    pinterest_rest_api_ad_response_REVIEWSTATUS_e review_status; //enum
    char *type; // string
    int updated_time; //numeric
    pin_promotion_summary_status_t *summary_status; // custom

} ad_response_t;

ad_response_t *ad_response_create(
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
    ad_common_tracking_urls_t *tracking_urls,
    char *view_tracking_url,
    char *lead_form_id,
    grid_click_type_t *grid_click_type,
    pinterest_rest_api_ad_response_CUSTOMIZABLECTATYPE_e customizable_cta_type,
    ad_common_quiz_pin_data_t *quiz_pin_data,
    char *pin_id,
    char *ad_account_id,
    char *campaign_id,
    char *collection_items_destination_url_template,
    int created_time,
    char *id,
    list_t *rejected_reasons,
    list_t *rejection_labels,
    pinterest_rest_api_ad_response_REVIEWSTATUS_e review_status,
    char *type,
    int updated_time,
    pin_promotion_summary_status_t *summary_status
);

void ad_response_free(ad_response_t *ad_response);

ad_response_t *ad_response_parseFromJSON(cJSON *ad_responseJSON);

cJSON *ad_response_convertToJSON(ad_response_t *ad_response);

#endif /* _ad_response_H_ */

