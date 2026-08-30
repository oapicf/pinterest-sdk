/*
 * campaign_create_request_all_of1.h
 *
 * 
 */

#ifndef _campaign_create_request_all_of1_H_
#define _campaign_create_request_all_of1_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_create_request_all_of1_t campaign_create_request_all_of1_t;

#include "campaign_bid_options_create.h"
#include "entity_status.h"
#include "intended_promotion_type.h"
#include "objective_type.h"



typedef struct campaign_create_request_all_of1_t {
    struct campaign_bid_options_create_t *bid_options; //model
    pinterest_rest_api_intended_promotion_type__e intended_promotion_type; //referenced enum
    int *is_automated_campaign; //boolean
    int *is_campaign_budget_optimization; //boolean
    int *is_flexible_daily_budgets; //boolean
    int *is_ltv_optimized; //boolean
    int *is_performance_plus; //boolean
    int *is_top_of_search; //boolean
    pinterest_rest_api_objective_type__e objective_type; //referenced enum
    entity_status_t *status; // custom

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_create_request_all_of1_t;

__attribute__((deprecated)) campaign_create_request_all_of1_t *campaign_create_request_all_of1_create(
    campaign_bid_options_create_t *bid_options,
    pinterest_rest_api_intended_promotion_type__e intended_promotion_type,
    int *is_automated_campaign,
    int *is_campaign_budget_optimization,
    int *is_flexible_daily_budgets,
    int *is_ltv_optimized,
    int *is_performance_plus,
    int *is_top_of_search,
    pinterest_rest_api_objective_type__e objective_type,
    entity_status_t *status
);

void campaign_create_request_all_of1_free(campaign_create_request_all_of1_t *campaign_create_request_all_of1);

campaign_create_request_all_of1_t *campaign_create_request_all_of1_parseFromJSON(cJSON *campaign_create_request_all_of1JSON);

cJSON *campaign_create_request_all_of1_convertToJSON(campaign_create_request_all_of1_t *campaign_create_request_all_of1);

#endif /* _campaign_create_request_all_of1_H_ */

