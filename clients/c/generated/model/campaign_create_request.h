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

#include "entity_status.h"
#include "objective_type.h"
#include "tracking_urls.h"



typedef struct campaign_create_request_t {
    char *ad_account_id; // string
    char *name; // string
    entity_status_t *status; // custom
    int lifetime_spend_cap; //numeric
    int daily_spend_cap; //numeric
    char *order_line_id; // string
    struct tracking_urls_t *tracking_urls; //model
    int start_time; //numeric
    int end_time; //numeric
    int is_flexible_daily_budgets; //boolean
    int default_ad_group_budget_in_micro_currency; //numeric
    int is_automated_campaign; //boolean
    pinterest_rest_api_objective_type__e objective_type; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_create_request_t;

__attribute__((deprecated)) campaign_create_request_t *campaign_create_request_create(
    char *ad_account_id,
    char *name,
    entity_status_t *status,
    int lifetime_spend_cap,
    int daily_spend_cap,
    char *order_line_id,
    tracking_urls_t *tracking_urls,
    int start_time,
    int end_time,
    int is_flexible_daily_budgets,
    int default_ad_group_budget_in_micro_currency,
    int is_automated_campaign,
    pinterest_rest_api_objective_type__e objective_type
);

void campaign_create_request_free(campaign_create_request_t *campaign_create_request);

campaign_create_request_t *campaign_create_request_parseFromJSON(cJSON *campaign_create_requestJSON);

cJSON *campaign_create_request_convertToJSON(campaign_create_request_t *campaign_create_request);

#endif /* _campaign_create_request_H_ */

