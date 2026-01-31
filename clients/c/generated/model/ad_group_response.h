/*
 * ad_group_response.h
 *
 * 
 */

#ifndef _ad_group_response_H_
#define _ad_group_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_group_response_t ad_group_response_t;

#include "action_type.h"
#include "ad_group_summary_status.h"
#include "any_type.h"
#include "budget_type.h"
#include "entity_status.h"
#include "optimization_goal_metadata.h"
#include "pacing_delivery_type.h"
#include "placement_group_type.h"
#include "targeting_spec.h"
#include "tracking_urls.h"

// Enum BIDSTRATEGYTYPE for ad_group_response

typedef enum  { pinterest_rest_api_ad_group_response_BIDSTRATEGYTYPE_NULL = 0, pinterest_rest_api_ad_group_response_BIDSTRATEGYTYPE_AUTOMATIC_BID, pinterest_rest_api_ad_group_response_BIDSTRATEGYTYPE_MAX_BID, pinterest_rest_api_ad_group_response_BIDSTRATEGYTYPE_TARGET_AVG } pinterest_rest_api_ad_group_response_BIDSTRATEGYTYPE_e;

char* ad_group_response_bid_strategy_type_ToString(pinterest_rest_api_ad_group_response_BIDSTRATEGYTYPE_e bid_strategy_type);

pinterest_rest_api_ad_group_response_BIDSTRATEGYTYPE_e ad_group_response_bid_strategy_type_FromString(char* bid_strategy_type);

// Enum PROMOTIONAPPLICATIONLEVEL for ad_group_response

typedef enum  { pinterest_rest_api_ad_group_response_PROMOTIONAPPLICATIONLEVEL_NULL = 0, pinterest_rest_api_ad_group_response_PROMOTIONAPPLICATIONLEVEL_NONE, pinterest_rest_api_ad_group_response_PROMOTIONAPPLICATIONLEVEL_ITEM, pinterest_rest_api_ad_group_response_PROMOTIONAPPLICATIONLEVEL_AD_GROUP } pinterest_rest_api_ad_group_response_PROMOTIONAPPLICATIONLEVEL_e;

char* ad_group_response_promotion_application_level_ToString(pinterest_rest_api_ad_group_response_PROMOTIONAPPLICATIONLEVEL_e promotion_application_level);

pinterest_rest_api_ad_group_response_PROMOTIONAPPLICATIONLEVEL_e ad_group_response_promotion_application_level_FromString(char* promotion_application_level);

// Enum CONVERSIONLEARNINGMODETYPE for ad_group_response

typedef enum  { pinterest_rest_api_ad_group_response_CONVERSIONLEARNINGMODETYPE_NULL = 0, pinterest_rest_api_ad_group_response_CONVERSIONLEARNINGMODETYPE_NOT_ACTIVE, pinterest_rest_api_ad_group_response_CONVERSIONLEARNINGMODETYPE_ACTIVE } pinterest_rest_api_ad_group_response_CONVERSIONLEARNINGMODETYPE_e;

char* ad_group_response_conversion_learning_mode_type_ToString(pinterest_rest_api_ad_group_response_CONVERSIONLEARNINGMODETYPE_e conversion_learning_mode_type);

pinterest_rest_api_ad_group_response_CONVERSIONLEARNINGMODETYPE_e ad_group_response_conversion_learning_mode_type_FromString(char* conversion_learning_mode_type);



typedef struct ad_group_response_t {
    int auto_targeting_enabled; //boolean
    int bid_in_micro_currency; //numeric
    pinterest_rest_api_ad_group_response_BIDSTRATEGYTYPE_e bid_strategy_type; //enum
    pinterest_rest_api_action_type__e billable_event; //referenced enum
    int budget_in_micro_currency; //numeric
    budget_type_t *budget_type; // custom
    char *campaign_id; // string
    int end_time; //numeric
    int is_creative_optimization; //boolean
    int lifetime_frequency_cap; //numeric
    char *name; // string
    struct optimization_goal_metadata_t *optimization_goal_metadata; //model
    pacing_delivery_type_t *pacing_delivery_type; // custom
    placement_group_type_t *placement_group; // custom
    pinterest_rest_api_ad_group_response_PROMOTIONAPPLICATIONLEVEL_e promotion_application_level; //enum
    char *promotion_id; // string
    int start_time; //numeric
    entity_status_t *status; // custom
    struct targeting_spec_t *targeting_spec; //model
    list_t *targeting_template_ids; //primitive container
    struct tracking_urls_t *tracking_urls; //model
    char *ad_account_id; // string
    double bid_multiplier; //numeric
    pinterest_rest_api_ad_group_response_CONVERSIONLEARNINGMODETYPE_e conversion_learning_mode_type; //enum
    int created_time; //numeric
    any_type_t *dca_assets; // custom
    char *feed_profile_id; // string
    char *id; // string
    ad_group_summary_status_t *summary_status; // custom
    char *type; // string
    int updated_time; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} ad_group_response_t;

__attribute__((deprecated)) ad_group_response_t *ad_group_response_create(
    int auto_targeting_enabled,
    int bid_in_micro_currency,
    pinterest_rest_api_ad_group_response_BIDSTRATEGYTYPE_e bid_strategy_type,
    pinterest_rest_api_action_type__e billable_event,
    int budget_in_micro_currency,
    budget_type_t *budget_type,
    char *campaign_id,
    int end_time,
    int is_creative_optimization,
    int lifetime_frequency_cap,
    char *name,
    optimization_goal_metadata_t *optimization_goal_metadata,
    pacing_delivery_type_t *pacing_delivery_type,
    placement_group_type_t *placement_group,
    pinterest_rest_api_ad_group_response_PROMOTIONAPPLICATIONLEVEL_e promotion_application_level,
    char *promotion_id,
    int start_time,
    entity_status_t *status,
    targeting_spec_t *targeting_spec,
    list_t *targeting_template_ids,
    tracking_urls_t *tracking_urls,
    char *ad_account_id,
    double bid_multiplier,
    pinterest_rest_api_ad_group_response_CONVERSIONLEARNINGMODETYPE_e conversion_learning_mode_type,
    int created_time,
    any_type_t *dca_assets,
    char *feed_profile_id,
    char *id,
    ad_group_summary_status_t *summary_status,
    char *type,
    int updated_time
);

void ad_group_response_free(ad_group_response_t *ad_group_response);

ad_group_response_t *ad_group_response_parseFromJSON(cJSON *ad_group_responseJSON);

cJSON *ad_group_response_convertToJSON(ad_group_response_t *ad_group_response);

#endif /* _ad_group_response_H_ */

