/*
 * campaign_create_request.h
 *
 * 
 */

#ifndef _campaign_create_request_H_
#define _campaign_create_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_create_request_t campaign_create_request_t;

#include "campaign_bid_options_create.h"
#include "entity_status.h"
#include "intended_promotion_type.h"
#include "object.h"
#include "objective_type.h"



typedef struct campaign_create_request_t {
    struct campaign_bid_options_create_t *bid_options; //model
    pinterest_rest_api_intended_promotion_type__e intended_promotion_type; //referenced enum
    int *is_automated_campaign; //boolean
    int *is_campaign_budget_optimization; //boolean
    int *is_flexible_daily_budgets; //boolean
    int *is_ltv_optimized; //boolean
    int *is_performance_plus; //boolean
    int *is_top_of_search; //boolean
    pinterest_rest_api_objective_type__e objective_type; //referenced enum
    pinterest_rest_api_entity_status__e status; //referenced enum
    char *ad_account_id; // string
    int *daily_spend_cap; //numeric
    int *default_ad_group_budget_in_micro_currency; //numeric
    int *end_time; //numeric
    int *lifetime_spend_cap; //numeric
    char *name; // string
    char *order_line_id; // string
    int *start_time; //numeric
    object_t *tracking_urls; //object

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_create_request_t;

__attribute__((deprecated)) campaign_create_request_t *campaign_create_request_create(
    campaign_bid_options_create_t *bid_options,
    pinterest_rest_api_intended_promotion_type__e intended_promotion_type,
    int *is_automated_campaign,
    int *is_campaign_budget_optimization,
    int *is_flexible_daily_budgets,
    int *is_ltv_optimized,
    int *is_performance_plus,
    int *is_top_of_search,
    pinterest_rest_api_objective_type__e objective_type,
    pinterest_rest_api_entity_status__e status,
    char *ad_account_id,
    int *daily_spend_cap,
    int *default_ad_group_budget_in_micro_currency,
    int *end_time,
    int *lifetime_spend_cap,
    char *name,
    char *order_line_id,
    int *start_time,
    object_t *tracking_urls
);

void campaign_create_request_free(campaign_create_request_t *campaign_create_request);

campaign_create_request_t *campaign_create_request_parseFromJSON(cJSON *campaign_create_requestJSON);

cJSON *campaign_create_request_convertToJSON(campaign_create_request_t *campaign_create_request);

#endif /* _campaign_create_request_H_ */

