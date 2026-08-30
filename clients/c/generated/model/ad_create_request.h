/*
 * ad_create_request.h
 *
 * 
 */

#ifndef _ad_create_request_H_
#define _ad_create_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_create_request_t ad_create_request_t;

#include "creative_type.h"
#include "customizable_cta_type.h"
#include "disclosure_type.h"
#include "entity_status.h"
#include "grid_click_type.h"
#include "object.h"



typedef struct ad_create_request_t {
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
    int *is_carting; //boolean
    int *is_pin_deleted; //boolean
    int *is_removable; //boolean
    char *lead_form_id; // string
    char *name; // string
    char *pin_id; // string
    object_t *quiz_pin_data; //object
    pinterest_rest_api_entity_status__e status; //referenced enum
    object_t *tracking_urls; //object
    char *view_tracking_url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ad_create_request_t;

__attribute__((deprecated)) ad_create_request_t *ad_create_request_create(
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
    int *is_carting,
    int *is_pin_deleted,
    int *is_removable,
    char *lead_form_id,
    char *name,
    char *pin_id,
    object_t *quiz_pin_data,
    pinterest_rest_api_entity_status__e status,
    object_t *tracking_urls,
    char *view_tracking_url
);

void ad_create_request_free(ad_create_request_t *ad_create_request);

ad_create_request_t *ad_create_request_parseFromJSON(cJSON *ad_create_requestJSON);

cJSON *ad_create_request_convertToJSON(ad_create_request_t *ad_create_request);

#endif /* _ad_create_request_H_ */

