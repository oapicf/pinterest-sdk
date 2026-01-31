/*
 * campaign_create_response_data.h
 *
 * 
 */

#ifndef _campaign_create_response_data_H_
#define _campaign_create_response_data_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_create_response_data_t campaign_create_response_data_t;

#include "campaign_bid_options.h"
#include "campaign_summary_status.h"
#include "entity_status.h"
#include "objective_type.h"
#include "tracking_urls.h"



typedef struct campaign_create_response_data_t {
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
    char *id; // string
    struct campaign_bid_options_t *bid_options; //model
    int created_time; //numeric
    int is_performance_plus; //boolean
    pinterest_rest_api_objective_type__e objective_type; //referenced enum
    pinterest_rest_api_campaign_summary_status__e summary_status; //referenced enum
    char *type; // string
    int updated_time; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_create_response_data_t;

__attribute__((deprecated)) campaign_create_response_data_t *campaign_create_response_data_create(
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
    char *id,
    campaign_bid_options_t *bid_options,
    int created_time,
    int is_performance_plus,
    pinterest_rest_api_objective_type__e objective_type,
    pinterest_rest_api_campaign_summary_status__e summary_status,
    char *type,
    int updated_time
);

void campaign_create_response_data_free(campaign_create_response_data_t *campaign_create_response_data);

campaign_create_response_data_t *campaign_create_response_data_parseFromJSON(cJSON *campaign_create_response_dataJSON);

cJSON *campaign_create_response_data_convertToJSON(campaign_create_response_data_t *campaign_create_response_data);

#endif /* _campaign_create_response_data_H_ */

