/*
 * ad_group_create_create.h
 *
 * Resource create operation model.
 */

#ifndef _ad_group_create_create_H_
#define _ad_group_create_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_group_create_create_t ad_group_create_create_t;

#include "action_type.h"
#include "ad_group_tracking_urls.h"
#include "adgroup_tracking_features.h"
#include "bid_strategy_type.h"
#include "budget_type.h"
#include "entity_status.h"
#include "nullable_optimization_goal_metadata.h"
#include "pacing_delivery_type.h"
#include "performance_plus_campaign_settings.h"
#include "placement_group_type.h"
#include "placement_traffic_type.h"
#include "promotion_application_level.h"
#include "targeting_spec_optimal.h"



typedef struct ad_group_create_create_t {
    int *auto_targeting_enabled; //boolean
    int *bid_in_micro_currency; //numeric
    double *bid_multiplier; //numeric
    pinterest_rest_api_bid_strategy_type__e bid_strategy_type; //referenced enum
    pinterest_rest_api_action_type__e billable_event; //referenced enum
    int *budget_in_micro_currency; //numeric
    budget_type_t *budget_type; // custom
    char *campaign_id; // string
    char *customer_segment_id; // string
    int *end_time; //numeric
    struct adgroup_tracking_features_t *ext_features; //model
    char *feed_profile_id; // string
    int *is_creative_optimization; //boolean
    int *is_local_inventory; //boolean
    int *lifetime_frequency_cap; //numeric
    double *local_inventory_radius_in_miles; //numeric
    char *name; // string
    struct nullable_optimization_goal_metadata_t *optimization_goal_metadata; //model
    pacing_delivery_type_t *pacing_delivery_type; // custom
    struct performance_plus_campaign_settings_t *performance_plus_campaign_settings; //model
    placement_group_type_t *placement_group; // custom
    placement_traffic_type_t *placement_traffic_type; // custom
    promotion_application_level_t *promotion_application_level; // custom
    char *promotion_id; // string
    list_t *promotion_ids; //primitive container
    int *start_time; //numeric
    entity_status_t *status; // custom
    struct targeting_spec_optimal_t *targeting_spec; //model
    list_t *targeting_template_ids; //primitive container
    struct ad_group_tracking_urls_t *tracking_urls; //model

    int _library_owned; // Is the library responsible for freeing this object?
} ad_group_create_create_t;

__attribute__((deprecated)) ad_group_create_create_t *ad_group_create_create_create(
    int *auto_targeting_enabled,
    int *bid_in_micro_currency,
    double *bid_multiplier,
    pinterest_rest_api_bid_strategy_type__e bid_strategy_type,
    pinterest_rest_api_action_type__e billable_event,
    int *budget_in_micro_currency,
    budget_type_t *budget_type,
    char *campaign_id,
    char *customer_segment_id,
    int *end_time,
    adgroup_tracking_features_t *ext_features,
    char *feed_profile_id,
    int *is_creative_optimization,
    int *is_local_inventory,
    int *lifetime_frequency_cap,
    double *local_inventory_radius_in_miles,
    char *name,
    nullable_optimization_goal_metadata_t *optimization_goal_metadata,
    pacing_delivery_type_t *pacing_delivery_type,
    performance_plus_campaign_settings_t *performance_plus_campaign_settings,
    placement_group_type_t *placement_group,
    placement_traffic_type_t *placement_traffic_type,
    promotion_application_level_t *promotion_application_level,
    char *promotion_id,
    list_t *promotion_ids,
    int *start_time,
    entity_status_t *status,
    targeting_spec_optimal_t *targeting_spec,
    list_t *targeting_template_ids,
    ad_group_tracking_urls_t *tracking_urls
);

void ad_group_create_create_free(ad_group_create_create_t *ad_group_create_create);

ad_group_create_create_t *ad_group_create_create_parseFromJSON(cJSON *ad_group_create_createJSON);

cJSON *ad_group_create_create_convertToJSON(ad_group_create_create_t *ad_group_create_create);

#endif /* _ad_group_create_create_H_ */

