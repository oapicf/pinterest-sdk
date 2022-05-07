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
#include "ad_group_response_all_of.h"
#include "ad_group_response_all_of_1.h"
#include "ad_group_summary_status.h"
#include "entity_status.h"
#include "pacing_delivery_type.h"
#include "placement_group_type.h"
#include "tracking_urls.h"

// Enum BUDGETTYPE for ad_group_response

typedef enum  { pinterest_rest_api_ad_group_response_BUDGETTYPE_NULL = 0, pinterest_rest_api_ad_group_response_BUDGETTYPE_DAILY, pinterest_rest_api_ad_group_response_BUDGETTYPE_LIFETIME, pinterest_rest_api_ad_group_response_BUDGETTYPE_CBO_ADGROUP } pinterest_rest_api_ad_group_response_BUDGETTYPE_e;

char* ad_group_response_budget_type_ToString(pinterest_rest_api_ad_group_response_BUDGETTYPE_e budget_type);

pinterest_rest_api_ad_group_response_BUDGETTYPE_e ad_group_response_budget_type_FromString(char* budget_type);

// Enum CONVERSIONLEARNINGMODETYPE for ad_group_response

typedef enum  { pinterest_rest_api_ad_group_response_CONVERSIONLEARNINGMODETYPE_NULL = 0, pinterest_rest_api_ad_group_response_CONVERSIONLEARNINGMODETYPE_NOT_ACTIVE, pinterest_rest_api_ad_group_response_CONVERSIONLEARNINGMODETYPE_ACTIVE, pinterest_rest_api_ad_group_response_CONVERSIONLEARNINGMODETYPE_null } pinterest_rest_api_ad_group_response_CONVERSIONLEARNINGMODETYPE_e;

char* ad_group_response_conversion_learning_mode_type_ToString(pinterest_rest_api_ad_group_response_CONVERSIONLEARNINGMODETYPE_e conversion_learning_mode_type);

pinterest_rest_api_ad_group_response_CONVERSIONLEARNINGMODETYPE_e ad_group_response_conversion_learning_mode_type_FromString(char* conversion_learning_mode_type);

// Enum  for ad_group_response

typedef enum  { pinterest_rest_api_ad_group_response__NULL = 0, pinterest_rest_api_ad_group_response__CLICKTHROUGH, pinterest_rest_api_ad_group_response__IMPRESSION, pinterest_rest_api_ad_group_response__VIDEO_V_50_MRC, pinterest_rest_api_ad_group_response__BILLABLE_ENGAGEMENT } pinterest_rest_api_ad_group_response__e;

char* ad_group_response_billable_event_ToString(pinterest_rest_api_ad_group_response__e billable_event);

pinterest_rest_api_ad_group_response__e ad_group_response_billable_event_FromString(char* billable_event);



typedef struct ad_group_response_t {
    char *name; // string
    struct entity_status_t *status; //model
    int budget_in_micro_currency; //numeric
    int bid_in_micro_currency; //numeric
    pinterest_rest_api_ad_group_response_BUDGETTYPE_e budget_type; //enum
    int start_time; //numeric
    int end_time; //numeric
    list_t* targeting_spec; //map
    int lifetime_frequency_cap; //numeric
    struct tracking_urls_t *tracking_urls; //model
    int auto_targeting_enabled; //boolean
    struct placement_group_type_t *placement_group; //model
    struct pacing_delivery_type_t *pacing_delivery_type; //model
    pinterest_rest_api_ad_group_response_CONVERSIONLEARNINGMODETYPE_e conversion_learning_mode_type; //enum
    struct ad_group_summary_status_t *summary_status; //model
    char *feed_profile_id; // string
    char *campaign_id; // string
    action_type_t *billable_event; // custom
    char *id; // string
    char *type; // string
    char *ad_account_id; // string
    int created_time; //numeric
    int updated_time; //numeric

} ad_group_response_t;

ad_group_response_t *ad_group_response_create(
    char *name,
    entity_status_t *status,
    int budget_in_micro_currency,
    int bid_in_micro_currency,
    pinterest_rest_api_ad_group_response_BUDGETTYPE_e budget_type,
    int start_time,
    int end_time,
    list_t* targeting_spec,
    int lifetime_frequency_cap,
    tracking_urls_t *tracking_urls,
    int auto_targeting_enabled,
    placement_group_type_t *placement_group,
    pacing_delivery_type_t *pacing_delivery_type,
    pinterest_rest_api_ad_group_response_CONVERSIONLEARNINGMODETYPE_e conversion_learning_mode_type,
    ad_group_summary_status_t *summary_status,
    char *feed_profile_id,
    char *campaign_id,
    action_type_t *billable_event,
    char *id,
    char *type,
    char *ad_account_id,
    int created_time,
    int updated_time
);

void ad_group_response_free(ad_group_response_t *ad_group_response);

ad_group_response_t *ad_group_response_parseFromJSON(cJSON *ad_group_responseJSON);

cJSON *ad_group_response_convertToJSON(ad_group_response_t *ad_group_response);

#endif /* _ad_group_response_H_ */

