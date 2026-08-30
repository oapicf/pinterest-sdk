/*
 * campaign_update_request.h
 *
 * 
 */

#ifndef _campaign_update_request_H_
#define _campaign_update_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_update_request_t campaign_update_request_t;

#include "campaign_bid_options_update.h"
#include "entity_status.h"
#include "intended_promotion_type.h"
#include "object.h"
#include "objective_type.h"



typedef struct campaign_update_request_t {
    struct campaign_bid_options_update_t *bid_options; //model
    pinterest_rest_api_intended_promotion_type__e intended_promotion_type; //referenced enum
    int *is_ltv_optimized; //boolean
    int *is_performance_plus; //boolean
    int *is_top_of_search; //boolean
    objective_type_t *objective_type; // custom
    char *ad_account_id; // string
    int *daily_spend_cap; //numeric
    int *default_ad_group_budget_in_micro_currency; //numeric
    int *end_time; //numeric
    char *id; // string
    int *is_automated_campaign; //boolean
    int *is_campaign_budget_optimization; //boolean
    int *is_flexible_daily_budgets; //boolean
    int *lifetime_spend_cap; //numeric
    char *name; // string
    char *order_line_id; // string
    int *start_time; //numeric
    pinterest_rest_api_entity_status__e status; //referenced enum
    object_t *tracking_urls; //object

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_update_request_t;

__attribute__((deprecated)) campaign_update_request_t *campaign_update_request_create(
    campaign_bid_options_update_t *bid_options,
    pinterest_rest_api_intended_promotion_type__e intended_promotion_type,
    int *is_ltv_optimized,
    int *is_performance_plus,
    int *is_top_of_search,
    objective_type_t *objective_type,
    char *ad_account_id,
    int *daily_spend_cap,
    int *default_ad_group_budget_in_micro_currency,
    int *end_time,
    char *id,
    int *is_automated_campaign,
    int *is_campaign_budget_optimization,
    int *is_flexible_daily_budgets,
    int *lifetime_spend_cap,
    char *name,
    char *order_line_id,
    int *start_time,
    pinterest_rest_api_entity_status__e status,
    object_t *tracking_urls
);

void campaign_update_request_free(campaign_update_request_t *campaign_update_request);

campaign_update_request_t *campaign_update_request_parseFromJSON(cJSON *campaign_update_requestJSON);

cJSON *campaign_update_request_convertToJSON(campaign_update_request_t *campaign_update_request);

#endif /* _campaign_update_request_H_ */

