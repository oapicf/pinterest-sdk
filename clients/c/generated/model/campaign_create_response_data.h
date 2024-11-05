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

#include "campaign_summary_status.h"
#include "entity_status.h"
#include "objective_type.h"
#include "tracking_urls.h"

// Enum  for campaign_create_response_data

typedef enum  { pinterest_rest_api_campaign_create_response_data__NULL = 0, pinterest_rest_api_campaign_create_response_data__AWARENESS, pinterest_rest_api_campaign_create_response_data__CONSIDERATION, pinterest_rest_api_campaign_create_response_data__VIDEO_VIEW, pinterest_rest_api_campaign_create_response_data__WEB_CONVERSION, pinterest_rest_api_campaign_create_response_data__CATALOG_SALES, pinterest_rest_api_campaign_create_response_data__WEB_SESSIONS, pinterest_rest_api_campaign_create_response_data__VIDEO_COMPLETION } pinterest_rest_api_campaign_create_response_data__e;

char* campaign_create_response_data_objective_type_ToString(pinterest_rest_api_campaign_create_response_data__e objective_type);

pinterest_rest_api_campaign_create_response_data__e campaign_create_response_data_objective_type_FromString(char* objective_type);

// Enum  for campaign_create_response_data

typedef enum  { pinterest_rest_api_campaign_create_response_data__NULL = 0, pinterest_rest_api_campaign_create_response_data__RUNNING, pinterest_rest_api_campaign_create_response_data__PAUSED, pinterest_rest_api_campaign_create_response_data__NOT_STARTED, pinterest_rest_api_campaign_create_response_data__COMPLETED, pinterest_rest_api_campaign_create_response_data__ADVERTISER_DISABLED, pinterest_rest_api_campaign_create_response_data__ARCHIVED, pinterest_rest_api_campaign_create_response_data__DRAFT, pinterest_rest_api_campaign_create_response_data__DELETED_DRAFT } pinterest_rest_api_campaign_create_response_data__e;

char* campaign_create_response_data_summary_status_ToString(pinterest_rest_api_campaign_create_response_data__e summary_status);

pinterest_rest_api_campaign_create_response_data__e campaign_create_response_data_summary_status_FromString(char* summary_status);



typedef struct campaign_create_response_data_t {
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
    char *id; // string
    objective_type_t *objective_type; // custom
    int created_time; //numeric
    int updated_time; //numeric
    char *type; // string
    int is_campaign_budget_optimization; //boolean
    campaign_summary_status_t *summary_status; // custom

} campaign_create_response_data_t;

campaign_create_response_data_t *campaign_create_response_data_create(
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
    char *id,
    objective_type_t *objective_type,
    int created_time,
    int updated_time,
    char *type,
    int is_campaign_budget_optimization,
    campaign_summary_status_t *summary_status
);

void campaign_create_response_data_free(campaign_create_response_data_t *campaign_create_response_data);

campaign_create_response_data_t *campaign_create_response_data_parseFromJSON(cJSON *campaign_create_response_dataJSON);

cJSON *campaign_create_response_data_convertToJSON(campaign_create_response_data_t *campaign_create_response_data);

#endif /* _campaign_create_response_data_H_ */

