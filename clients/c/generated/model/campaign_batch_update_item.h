/*
 * campaign_batch_update_item.h
 *
 * Single campaign update item with update-specific bid options.
 */

#ifndef _campaign_batch_update_item_H_
#define _campaign_batch_update_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_batch_update_item_t campaign_batch_update_item_t;

#include "campaign_bid_options_update.h"
#include "conversion_objective_type.h"
#include "entity_status.h"
#include "intended_promotion_type.h"
#include "mobile_app_platform.h"
#include "performance_plus_campaign_settings.h"
#include "tracking_urls.h"



typedef struct campaign_batch_update_item_t {
    char *ad_account_id; // string
    char *app_id; // string
    mobile_app_platform_t *app_platform; // custom
    struct campaign_bid_options_update_t *bid_options; //model
    int *daily_spend_cap; //numeric
    int *default_ad_group_budget_in_micro_currency; //numeric
    int *end_time; //numeric
    char *id; // string
    pinterest_rest_api_intended_promotion_type__e intended_promotion_type; //referenced enum
    int *is_automated_campaign; //boolean
    int *is_campaign_budget_optimization; //boolean
    int *is_flexible_daily_budgets; //boolean
    int *is_ltv_optimized; //boolean
    int *is_performance_plus; //boolean
    int *is_top_of_search; //boolean
    int *lifetime_spend_cap; //numeric
    char *name; // string
    pinterest_rest_api_conversion_objective_type__e objective_type; //referenced enum
    char *order_line_id; // string
    struct performance_plus_campaign_settings_t *performance_plus_campaign_settings; //model
    int *start_time; //numeric
    pinterest_rest_api_entity_status__e status; //referenced enum
    struct tracking_urls_t *tracking_urls; //model

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_batch_update_item_t;

__attribute__((deprecated)) campaign_batch_update_item_t *campaign_batch_update_item_create(
    char *ad_account_id,
    char *app_id,
    mobile_app_platform_t *app_platform,
    campaign_bid_options_update_t *bid_options,
    int *daily_spend_cap,
    int *default_ad_group_budget_in_micro_currency,
    int *end_time,
    char *id,
    pinterest_rest_api_intended_promotion_type__e intended_promotion_type,
    int *is_automated_campaign,
    int *is_campaign_budget_optimization,
    int *is_flexible_daily_budgets,
    int *is_ltv_optimized,
    int *is_performance_plus,
    int *is_top_of_search,
    int *lifetime_spend_cap,
    char *name,
    pinterest_rest_api_conversion_objective_type__e objective_type,
    char *order_line_id,
    performance_plus_campaign_settings_t *performance_plus_campaign_settings,
    int *start_time,
    pinterest_rest_api_entity_status__e status,
    tracking_urls_t *tracking_urls
);

void campaign_batch_update_item_free(campaign_batch_update_item_t *campaign_batch_update_item);

campaign_batch_update_item_t *campaign_batch_update_item_parseFromJSON(cJSON *campaign_batch_update_itemJSON);

cJSON *campaign_batch_update_item_convertToJSON(campaign_batch_update_item_t *campaign_batch_update_item);

#endif /* _campaign_batch_update_item_H_ */

