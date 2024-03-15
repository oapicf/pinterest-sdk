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

#include "ad_common_tracking_urls.h"
#include "campaign_summary_status.h"
#include "entity_status.h"
#include "objective_type.h"



typedef struct campaign_update_request_t {
    char *id; // string
    char *ad_account_id; // string
    char *name; // string
    entity_status_t *status; // custom
    int lifetime_spend_cap; //numeric
    int daily_spend_cap; //numeric
    char *order_line_id; // string
    struct ad_common_tracking_urls_t *tracking_urls; //model
    int start_time; //numeric
    int end_time; //numeric
    campaign_summary_status_t *summary_status; // custom
    int is_flexible_daily_budgets; //boolean
    int default_ad_group_budget_in_micro_currency; //numeric
    int is_automated_campaign; //boolean
    int is_campaign_budget_optimization; //boolean
    objective_type_t *objective_type; // custom

} campaign_update_request_t;

campaign_update_request_t *campaign_update_request_create(
    char *id,
    char *ad_account_id,
    char *name,
    entity_status_t *status,
    int lifetime_spend_cap,
    int daily_spend_cap,
    char *order_line_id,
    ad_common_tracking_urls_t *tracking_urls,
    int start_time,
    int end_time,
    campaign_summary_status_t *summary_status,
    int is_flexible_daily_budgets,
    int default_ad_group_budget_in_micro_currency,
    int is_automated_campaign,
    int is_campaign_budget_optimization,
    objective_type_t *objective_type
);

void campaign_update_request_free(campaign_update_request_t *campaign_update_request);

campaign_update_request_t *campaign_update_request_parseFromJSON(cJSON *campaign_update_requestJSON);

cJSON *campaign_update_request_convertToJSON(campaign_update_request_t *campaign_update_request);

#endif /* _campaign_update_request_H_ */

