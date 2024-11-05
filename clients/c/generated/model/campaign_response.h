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

// Enum  for campaign_response

typedef enum  { pinterest_rest_api_campaign_response__NULL = 0, pinterest_rest_api_campaign_response__AWARENESS, pinterest_rest_api_campaign_response__CONSIDERATION, pinterest_rest_api_campaign_response__VIDEO_VIEW, pinterest_rest_api_campaign_response__WEB_CONVERSION, pinterest_rest_api_campaign_response__CATALOG_SALES, pinterest_rest_api_campaign_response__WEB_SESSIONS, pinterest_rest_api_campaign_response__VIDEO_COMPLETION } pinterest_rest_api_campaign_response__e;

char* campaign_response_objective_type_ToString(pinterest_rest_api_campaign_response__e objective_type);

pinterest_rest_api_campaign_response__e campaign_response_objective_type_FromString(char* objective_type);

// Enum  for campaign_response

typedef enum  { pinterest_rest_api_campaign_response__NULL = 0, pinterest_rest_api_campaign_response__RUNNING, pinterest_rest_api_campaign_response__PAUSED, pinterest_rest_api_campaign_response__NOT_STARTED, pinterest_rest_api_campaign_response__COMPLETED, pinterest_rest_api_campaign_response__ADVERTISER_DISABLED, pinterest_rest_api_campaign_response__ARCHIVED, pinterest_rest_api_campaign_response__DRAFT, pinterest_rest_api_campaign_response__DELETED_DRAFT } pinterest_rest_api_campaign_response__e;

char* campaign_response_summary_status_ToString(pinterest_rest_api_campaign_response__e summary_status);

pinterest_rest_api_campaign_response__e campaign_response_summary_status_FromString(char* summary_status);



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
    objective_type_t *objective_type; // custom
    int created_time; //numeric
    int updated_time; //numeric
    char *type; // string
    int is_campaign_budget_optimization; //boolean
    campaign_summary_status_t *summary_status; // custom

} campaign_response_t;

campaign_response_t *campaign_response_create(
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
    objective_type_t *objective_type,
    int created_time,
    int updated_time,
    char *type,
    int is_campaign_budget_optimization,
    campaign_summary_status_t *summary_status
);

void campaign_response_free(campaign_response_t *campaign_response);

campaign_response_t *campaign_response_parseFromJSON(cJSON *campaign_responseJSON);

cJSON *campaign_response_convertToJSON(campaign_response_t *campaign_response);

#endif /* _campaign_response_H_ */

