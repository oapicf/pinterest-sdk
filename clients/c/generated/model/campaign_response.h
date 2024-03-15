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

#include "ad_common_tracking_urls.h"
#include "campaign_summary_status.h"
#include "entity_status.h"
#include "objective_type.h"

// Enum  for campaign_response

typedef enum  { pinterest_rest_api_campaign_response__NULL = 0, pinterest_rest_api_campaign_response__AWARENESS, pinterest_rest_api_campaign_response__CONSIDERATION, pinterest_rest_api_campaign_response__VIDEO_VIEW, pinterest_rest_api_campaign_response__WEB_CONVERSION, pinterest_rest_api_campaign_response__CATALOG_SALES, pinterest_rest_api_campaign_response__WEB_SESSIONS } pinterest_rest_api_campaign_response__e;

char* campaign_response_objective_type_ToString(pinterest_rest_api_campaign_response__e objective_type);

pinterest_rest_api_campaign_response__e campaign_response_objective_type_FromString(char* objective_type);



typedef struct campaign_response_t {
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
    objective_type_t *objective_type; // custom
    int created_time; //numeric
    int updated_time; //numeric
    char *type; // string
    int is_flexible_daily_budgets; //boolean
    int is_campaign_budget_optimization; //boolean

} campaign_response_t;

campaign_response_t *campaign_response_create(
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
    objective_type_t *objective_type,
    int created_time,
    int updated_time,
    char *type,
    int is_flexible_daily_budgets,
    int is_campaign_budget_optimization
);

void campaign_response_free(campaign_response_t *campaign_response);

campaign_response_t *campaign_response_parseFromJSON(cJSON *campaign_responseJSON);

cJSON *campaign_response_convertToJSON(campaign_response_t *campaign_response);

#endif /* _campaign_response_H_ */

