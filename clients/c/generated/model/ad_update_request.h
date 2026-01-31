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
#include "customizable_cta_type.h"
#include "disclosure_type.h"
#include "entity_status.h"
#include "grid_click_type.h"
#include "quiz_pin_data.h"
#include "tracking_urls.h"



typedef struct ad_update_request_t {
    char *ad_group_id; // string
    char *android_deep_link; // string
    list_t *carousel_android_deep_links; //primitive container
    list_t *carousel_destination_urls; //primitive container
    list_t *carousel_ios_deep_links; //primitive container
    char *click_tracking_url; // string
    pinterest_rest_api_creative_type__e creative_type; //referenced enum
    pinterest_rest_api_customizable_cta_type__e customizable_cta_type; //referenced enum
    char *destination_url; // string
    pinterest_rest_api_disclosure_type__e disclosure_type; //referenced enum
    char *disclosure_url; // string
    pinterest_rest_api_grid_click_type__e grid_click_type; //referenced enum
    char *ios_deep_link; // string
    int is_pin_deleted; //boolean
    int is_removable; //boolean
    char *lead_form_id; // string
    char *name; // string
    struct quiz_pin_data_t *quiz_pin_data; //model
    pinterest_rest_api_entity_status__e status; //referenced enum
    struct tracking_urls_t *tracking_urls; //model
    char *view_tracking_url; // string
    char *id; // string
    char *pin_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ad_update_request_t;

__attribute__((deprecated)) ad_update_request_t *ad_update_request_create(
    char *ad_group_id,
    char *android_deep_link,
    list_t *carousel_android_deep_links,
    list_t *carousel_destination_urls,
    list_t *carousel_ios_deep_links,
    char *click_tracking_url,
    pinterest_rest_api_creative_type__e creative_type,
    pinterest_rest_api_customizable_cta_type__e customizable_cta_type,
    char *destination_url,
    pinterest_rest_api_disclosure_type__e disclosure_type,
    char *disclosure_url,
    pinterest_rest_api_grid_click_type__e grid_click_type,
    char *ios_deep_link,
    int is_pin_deleted,
    int is_removable,
    char *lead_form_id,
    char *name,
    quiz_pin_data_t *quiz_pin_data,
    pinterest_rest_api_entity_status__e status,
    tracking_urls_t *tracking_urls,
    char *view_tracking_url,
    char *id,
    char *pin_id
);

void ad_update_request_free(ad_update_request_t *ad_update_request);

ad_update_request_t *ad_update_request_parseFromJSON(cJSON *ad_update_requestJSON);

cJSON *ad_update_request_convertToJSON(ad_update_request_t *ad_update_request);

#endif /* _ad_update_request_H_ */

