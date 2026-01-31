/*
 * campaign_create_common.h
 *
 * 
 */

#ifndef _campaign_create_common_H_
#define _campaign_create_common_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_create_common_t campaign_create_common_t;

#include "entity_status.h"
#include "tracking_urls.h"



typedef struct campaign_create_common_t {
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

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_create_common_t;

__attribute__((deprecated)) campaign_create_common_t *campaign_create_common_create(
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
    int is_campaign_budget_optimization
);

void campaign_create_common_free(campaign_create_common_t *campaign_create_common);

campaign_create_common_t *campaign_create_common_parseFromJSON(cJSON *campaign_create_commonJSON);

cJSON *campaign_create_common_convertToJSON(campaign_create_common_t *campaign_create_common);

#endif /* _campaign_create_common_H_ */

