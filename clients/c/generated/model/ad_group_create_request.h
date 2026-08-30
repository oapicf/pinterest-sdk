/*
 * ad_group_create_request.h
 *
 * 
 */

#ifndef _ad_group_create_request_H_
#define _ad_group_create_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_group_create_request_t ad_group_create_request_t;

#include "action_type.h"
#include "bid_strategy_type.h"
#include "budget_type.h"
#include "entity_status.h"
#include "object.h"
#include "pacing_delivery_type.h"
#include "placement_group_type.h"
#include "targeting_spec.h"

// Enum PROMOTIONAPPLICATIONLEVEL for ad_group_create_request

typedef enum  { pinterest_rest_api_ad_group_create_request_PROMOTIONAPPLICATIONLEVEL_NULL = 0, pinterest_rest_api_ad_group_create_request_PROMOTIONAPPLICATIONLEVEL_NONE, pinterest_rest_api_ad_group_create_request_PROMOTIONAPPLICATIONLEVEL_ITEM, pinterest_rest_api_ad_group_create_request_PROMOTIONAPPLICATIONLEVEL_AD_GROUP } pinterest_rest_api_ad_group_create_request_PROMOTIONAPPLICATIONLEVEL_e;

char* ad_group_create_request_promotion_application_level_ToString(pinterest_rest_api_ad_group_create_request_PROMOTIONAPPLICATIONLEVEL_e promotion_application_level);

pinterest_rest_api_ad_group_create_request_PROMOTIONAPPLICATIONLEVEL_e ad_group_create_request_promotion_application_level_FromString(char* promotion_application_level);



typedef struct ad_group_create_request_t {
    int *auto_targeting_enabled; //boolean
    double *bid_multiplier; //numeric
    pinterest_rest_api_budget_type__e budget_type; //referenced enum
    pinterest_rest_api_pacing_delivery_type__e pacing_delivery_type; //referenced enum
    int *bid_in_micro_currency; //numeric
    pinterest_rest_api_bid_strategy_type__e bid_strategy_type; //referenced enum
    pinterest_rest_api_action_type__e billable_event; //referenced enum
    int *budget_in_micro_currency; //numeric
    char *campaign_id; // string
    int *end_time; //numeric
    int *is_creative_optimization; //boolean
    int *lifetime_frequency_cap; //numeric
    char *name; // string
    object_t *optimization_goal_metadata; //object
    placement_group_type_t *placement_group; // custom
    pinterest_rest_api_ad_group_create_request_PROMOTIONAPPLICATIONLEVEL_e promotion_application_level; //enum
    char *promotion_id; // string
    list_t *promotion_ids; //primitive container
    int *start_time; //numeric
    entity_status_t *status; // custom
    struct targeting_spec_t *targeting_spec; //model
    list_t *targeting_template_ids; //primitive container
    object_t *tracking_urls; //object

    int _library_owned; // Is the library responsible for freeing this object?
} ad_group_create_request_t;

__attribute__((deprecated)) ad_group_create_request_t *ad_group_create_request_create(
    int *auto_targeting_enabled,
    double *bid_multiplier,
    pinterest_rest_api_budget_type__e budget_type,
    pinterest_rest_api_pacing_delivery_type__e pacing_delivery_type,
    int *bid_in_micro_currency,
    pinterest_rest_api_bid_strategy_type__e bid_strategy_type,
    pinterest_rest_api_action_type__e billable_event,
    int *budget_in_micro_currency,
    char *campaign_id,
    int *end_time,
    int *is_creative_optimization,
    int *lifetime_frequency_cap,
    char *name,
    object_t *optimization_goal_metadata,
    placement_group_type_t *placement_group,
    pinterest_rest_api_ad_group_create_request_PROMOTIONAPPLICATIONLEVEL_e promotion_application_level,
    char *promotion_id,
    list_t *promotion_ids,
    int *start_time,
    entity_status_t *status,
    targeting_spec_t *targeting_spec,
    list_t *targeting_template_ids,
    object_t *tracking_urls
);

void ad_group_create_request_free(ad_group_create_request_t *ad_group_create_request);

ad_group_create_request_t *ad_group_create_request_parseFromJSON(cJSON *ad_group_create_requestJSON);

cJSON *ad_group_create_request_convertToJSON(ad_group_create_request_t *ad_group_create_request);

#endif /* _ad_group_create_request_H_ */

