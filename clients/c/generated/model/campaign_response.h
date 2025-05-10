/*
 * campaign_response.h
 *
 * 
 */

#ifndef _campaign_response_H_
#define _campaign_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_response_t campaign_response_t;

#include "campaign_summary_status.h"
#include "entity_status.h"
#include "objective_type.h"
#include "tracking_urls.h"



typedef struct campaign_response_t {
    char *id; // string
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
    pinterest_rest_api_objective_type__e objective_type; //referenced enum
    int created_time; //numeric
    int updated_time; //numeric
    char *type; // string
    int is_campaign_budget_optimization; //boolean
    pinterest_rest_api_campaign_summary_status__e summary_status; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_response_t;

__attribute__((deprecated)) campaign_response_t *campaign_response_create(
    char *id,
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
    pinterest_rest_api_objective_type__e objective_type,
    int created_time,
    int updated_time,
    char *type,
    int is_campaign_budget_optimization,
    pinterest_rest_api_campaign_summary_status__e summary_status
);

void campaign_response_free(campaign_response_t *campaign_response);

campaign_response_t *campaign_response_parseFromJSON(cJSON *campaign_responseJSON);

cJSON *campaign_response_convertToJSON(campaign_response_t *campaign_response);

#endif /* _campaign_response_H_ */

