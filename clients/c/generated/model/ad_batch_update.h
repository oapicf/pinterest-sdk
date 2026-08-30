/*
 * ad_batch_update.h
 *
 * 
 */

#ifndef _ad_batch_update_H_
#define _ad_batch_update_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_batch_update_t ad_batch_update_t;

#include "ad_collections_header_type.h"
#include "creative_type.h"
#include "customizable_cta_type.h"
#include "disclosure_type.h"
#include "entity_status.h"
#include "grid_click_type.h"
#include "quiz_pin_data.h"
#include "tracking_urls.h"



typedef struct ad_batch_update_t {
    char *ad_group_id; // string
    char *android_deep_link; // string
    list_t *carousel_android_deep_links; //primitive container
    list_t *carousel_destination_urls; //primitive container
    list_t *carousel_ios_deep_links; //primitive container
    char *click_tracking_url; // string
    char *collection_items_destination_url_template; // string
    ad_collections_header_type_t *collections_header_type; // custom
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
    pinterest_rest_api_entity_status__e status; //referenced enum
    struct tracking_urls_t *tracking_urls; //model
    char *view_tracking_url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ad_batch_update_t;

__attribute__((deprecated)) ad_batch_update_t *ad_batch_update_create(
    char *ad_group_id,
    char *android_deep_link,
    list_t *carousel_android_deep_links,
    list_t *carousel_destination_urls,
    list_t *carousel_ios_deep_links,
    char *click_tracking_url,
    char *collection_items_destination_url_template,
    ad_collections_header_type_t *collections_header_type,
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
    pinterest_rest_api_entity_status__e status,
    tracking_urls_t *tracking_urls,
    char *view_tracking_url
);

void ad_batch_update_free(ad_batch_update_t *ad_batch_update);

ad_batch_update_t *ad_batch_update_parseFromJSON(cJSON *ad_batch_updateJSON);

cJSON *ad_batch_update_convertToJSON(ad_batch_update_t *ad_batch_update);

#endif /* _ad_batch_update_H_ */

