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
#include "objective_type.h"
#include "tracking_urls.h"



typedef struct campaign_update_request_t {
    char *id; // string
    char *ad_account_id; // string
    int daily_spend_cap; //numeric
    int end_time; //numeric
    int is_automated_campaign; //boolean
    int is_flexible_daily_budgets; //boolean
    int lifetime_spend_cap; //numeric
    char *name; // string
    char *order_line_id; // string
    int start_time; //numeric
    entity_status_t *status; // custom
    struct tracking_urls_t *tracking_urls; //model
    int default_ad_group_budget_in_micro_currency; //numeric
    int is_campaign_budget_optimization; //boolean
    struct campaign_bid_options_update_t *bid_options; //model
    int is_performance_plus; //boolean
    objective_type_t *objective_type; // custom

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_update_request_t;

__attribute__((deprecated)) campaign_update_request_t *campaign_update_request_create(
    char *id,
    char *ad_account_id,
    int daily_spend_cap,
    int end_time,
    int is_automated_campaign,
    int is_flexible_daily_budgets,
    int lifetime_spend_cap,
    char *name,
    char *order_line_id,
    int start_time,
    entity_status_t *status,
    tracking_urls_t *tracking_urls,
    int default_ad_group_budget_in_micro_currency,
    int is_campaign_budget_optimization,
    campaign_bid_options_update_t *bid_options,
    int is_performance_plus,
    objective_type_t *objective_type
);

void campaign_update_request_free(campaign_update_request_t *campaign_update_request);

campaign_update_request_t *campaign_update_request_parseFromJSON(cJSON *campaign_update_requestJSON);

cJSON *campaign_update_request_convertToJSON(campaign_update_request_t *campaign_update_request);

#endif /* _campaign_update_request_H_ */

