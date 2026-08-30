/*
 * campaign_batch_response_data.h
 *
 * Campaign data in batch response, with all fields optional to support error cases where data may be empty.
 */

#ifndef _campaign_batch_response_data_H_
#define _campaign_batch_response_data_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_batch_response_data_t campaign_batch_response_data_t;

#include "campaign_bid_options.h"
#include "campaign_objective_type.h"
#include "intended_promotion_type.h"
#include "nullable_entity_status.h"
#include "performance_plus_campaign_settings.h"
#include "summary_status.h"
#include "tracking_urls.h"



typedef struct campaign_batch_response_data_t {
    char *ad_account_id; // string
    struct campaign_bid_options_t *bid_options; //model
    int *created_time; //numeric
    int *daily_spend_cap; //numeric
    int *default_ad_group_budget_in_micro_currency; //numeric
    int *end_time; //numeric
    char *id; // string
    pinterest_rest_api_intended_promotion_type__e intended_promotion_type; //referenced enum
    int *is_automated_campaign; //boolean
    int *is_campaign_budget_optimization; //boolean
    int *is_carting; //boolean
    int *is_flexible_daily_budgets; //boolean
    int *is_ltv_optimized; //boolean
    int *is_performance_plus; //boolean
    int *is_top_of_search; //boolean
    int *lifetime_spend_cap; //numeric
    char *name; // string
    pinterest_rest_api_campaign_objective_type__e objective_type; //referenced enum
    char *order_line_id; // string
    struct performance_plus_campaign_settings_t *performance_plus_campaign_settings; //model
    int *start_time; //numeric
    nullable_entity_status_t *status; // custom
    summary_status_t *summary_status; // custom
    struct tracking_urls_t *tracking_urls; //model
    char *type; // string
    int *updated_time; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_batch_response_data_t;

__attribute__((deprecated)) campaign_batch_response_data_t *campaign_batch_response_data_create(
    char *ad_account_id,
    campaign_bid_options_t *bid_options,
    int *created_time,
    int *daily_spend_cap,
    int *default_ad_group_budget_in_micro_currency,
    int *end_time,
    char *id,
    pinterest_rest_api_intended_promotion_type__e intended_promotion_type,
    int *is_automated_campaign,
    int *is_campaign_budget_optimization,
    int *is_carting,
    int *is_flexible_daily_budgets,
    int *is_ltv_optimized,
    int *is_performance_plus,
    int *is_top_of_search,
    int *lifetime_spend_cap,
    char *name,
    pinterest_rest_api_campaign_objective_type__e objective_type,
    char *order_line_id,
    performance_plus_campaign_settings_t *performance_plus_campaign_settings,
    int *start_time,
    nullable_entity_status_t *status,
    summary_status_t *summary_status,
    tracking_urls_t *tracking_urls,
    char *type,
    int *updated_time
);

void campaign_batch_response_data_free(campaign_batch_response_data_t *campaign_batch_response_data);

campaign_batch_response_data_t *campaign_batch_response_data_parseFromJSON(cJSON *campaign_batch_response_dataJSON);

cJSON *campaign_batch_response_data_convertToJSON(campaign_batch_response_data_t *campaign_batch_response_data);

#endif /* _campaign_batch_response_data_H_ */

