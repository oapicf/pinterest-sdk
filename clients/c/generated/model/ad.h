/*
 * ad.h
 *
 * 
 */

#ifndef _ad_H_
#define _ad_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_t ad_t;

#include "ad_collections_header_type.h"
#include "ad_disapproval_reasons.h"
#include "ad_review_status.h"
#include "carting_product.h"
#include "creative_type.h"
#include "customizable_cta_type.h"
#include "disclosure_type.h"
#include "entity_status.h"
#include "grid_click_type.h"
#include "pin_promotion_summary_status.h"
#include "quiz_pin_data.h"
#include "tracking_urls.h"

// Enum  for ad

typedef enum  { pinterest_rest_api_ad__NULL = 0, pinterest_rest_api_ad__HASHTAGS, pinterest_rest_api_ad__PROMOTIONS_AND_PRICES, pinterest_rest_api_ad__TARGETING, pinterest_rest_api_ad__LANDING_PAGE, pinterest_rest_api_ad__CAPS_AND_SYMBOLS, pinterest_rest_api_ad__SHOCKING, pinterest_rest_api_ad__WEIGHT_LOSS, pinterest_rest_api_ad__PROHIBITED_PRODUCT, pinterest_rest_api_ad__AUTHENTICITY, pinterest_rest_api_ad__NUDITY, pinterest_rest_api_ad__CONFUSING_DESIGN, pinterest_rest_api_ad__URGENCY, pinterest_rest_api_ad__RATINGS, pinterest_rest_api_ad__APP, pinterest_rest_api_ad__ALCOHOL, pinterest_rest_api_ad__CONTESTS, pinterest_rest_api_ad__POLITICAL, pinterest_rest_api_ad__OTHER, pinterest_rest_api_ad__IMAGE, pinterest_rest_api_ad__NAR, pinterest_rest_api_ad__INCONSISTENT, pinterest_rest_api_ad__CLICKBAIT, pinterest_rest_api_ad__NO_DESCRIPTION, pinterest_rest_api_ad__LOW_QUALITY, pinterest_rest_api_ad__EXAGGERATED_CLAIMS, pinterest_rest_api_ad__PINTEREST_BRAND, pinterest_rest_api_ad__ALCOHOL_NO_SALE, pinterest_rest_api_ad__LANDING_PAGE_SPEED, pinterest_rest_api_ad__LANDING_PAGE_HARDWALL, pinterest_rest_api_ad__LANDING_PAGE_BROKEN, pinterest_rest_api_ad__LANDING_PAGE_QUALITY, pinterest_rest_api_ad__OUT_OF_STOCK, pinterest_rest_api_ad__IMAGE_LOW_QUALITY, pinterest_rest_api_ad__IMAGE_BUSY, pinterest_rest_api_ad__IMAGE_POORLY_EDITED, pinterest_rest_api_ad__IMAGE_BEFORE_AFTER, pinterest_rest_api_ad__UGC, pinterest_rest_api_ad__FAKE_BUTTONS, pinterest_rest_api_ad__WEAPONS, pinterest_rest_api_ad__SENSITIVE, pinterest_rest_api_ad__UNACCEPTABLE_BUSINESS, pinterest_rest_api_ad__SUSPICIOUS_CLAIMS, pinterest_rest_api_ad__PHARMA, pinterest_rest_api_ad__SUSPICIOUS_SUPPLEMENTS, pinterest_rest_api_ad__ILLEGAL_RECREATIONAL_DRUG, pinterest_rest_api_ad__LOW_QUALITY_LANDING_PAGE, pinterest_rest_api_ad__RESTRICTED_HEALTHCARE, pinterest_rest_api_ad__INCONSISTENT_LANG_FR } pinterest_rest_api_ad__e;

char* ad_rejected_reasons_ToString(pinterest_rest_api_ad__e rejected_reasons);

pinterest_rest_api_ad__e ad_rejected_reasons_FromString(char* rejected_reasons);



typedef struct ad_t {
    char *ad_account_id; // string
    char *ad_group_id; // string
    char *android_deep_link; // string
    char *campaign_id; // string
    list_t *carousel_android_deep_links; //primitive container
    list_t *carousel_destination_urls; //primitive container
    list_t *carousel_ios_deep_links; //primitive container
    int *carting_platform_type; //numeric
    list_t *carting_products; //nonprimitive container
    char *click_tracking_url; // string
    char *collection_items_destination_url_template; // string
    ad_collections_header_type_t *collections_header_type; // custom
    int *created_time; //numeric
    pinterest_rest_api_creative_type__e creative_type; //referenced enum
    pinterest_rest_api_customizable_cta_type__e customizable_cta_type; //referenced enum
    char *destination_url; // string
    pinterest_rest_api_disclosure_type__e disclosure_type; //referenced enum
    char *disclosure_url; // string
    pinterest_rest_api_grid_click_type__e grid_click_type; //referenced enum
    char *id; // string
    char *ios_deep_link; // string
    int *is_carting; //boolean
    int *is_collage_accepted_terms; //boolean
    int *is_collage_single_destination; //boolean
    int *is_pin_deleted; //boolean
    int *is_removable; //boolean
    char *lead_form_id; // string
    char *name; // string
    char *pin_id; // string
    struct quiz_pin_data_t *quiz_pin_data; //model
    list_t *rejected_reasons; //nonprimitive container
    list_t *rejection_labels; //primitive container
    ad_review_status_t *review_status; // custom
    pinterest_rest_api_entity_status__e status; //referenced enum
    pin_promotion_summary_status_t *summary_status; // custom
    struct tracking_urls_t *tracking_urls; //model
    char *type; // string
    int *updated_time; //numeric
    char *view_tracking_url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ad_t;

__attribute__((deprecated)) ad_t *ad_create(
    char *ad_account_id,
    char *ad_group_id,
    char *android_deep_link,
    char *campaign_id,
    list_t *carousel_android_deep_links,
    list_t *carousel_destination_urls,
    list_t *carousel_ios_deep_links,
    int *carting_platform_type,
    list_t *carting_products,
    char *click_tracking_url,
    char *collection_items_destination_url_template,
    ad_collections_header_type_t *collections_header_type,
    int *created_time,
    pinterest_rest_api_creative_type__e creative_type,
    pinterest_rest_api_customizable_cta_type__e customizable_cta_type,
    char *destination_url,
    pinterest_rest_api_disclosure_type__e disclosure_type,
    char *disclosure_url,
    pinterest_rest_api_grid_click_type__e grid_click_type,
    char *id,
    char *ios_deep_link,
    int *is_carting,
    int *is_collage_accepted_terms,
    int *is_collage_single_destination,
    int *is_pin_deleted,
    int *is_removable,
    char *lead_form_id,
    char *name,
    char *pin_id,
    quiz_pin_data_t *quiz_pin_data,
    list_t *rejected_reasons,
    list_t *rejection_labels,
    ad_review_status_t *review_status,
    pinterest_rest_api_entity_status__e status,
    pin_promotion_summary_status_t *summary_status,
    tracking_urls_t *tracking_urls,
    char *type,
    int *updated_time,
    char *view_tracking_url
);

void ad_free(ad_t *ad);

ad_t *ad_parseFromJSON(cJSON *adJSON);

cJSON *ad_convertToJSON(ad_t *ad);

#endif /* _ad_H_ */

