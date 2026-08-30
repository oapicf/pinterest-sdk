/*
 * campaign_delivery_estimates_campaign.h
 *
 * Campaign configuration for delivery estimates.
 */

#ifndef _campaign_delivery_estimates_campaign_H_
#define _campaign_delivery_estimates_campaign_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_delivery_estimates_campaign_t campaign_delivery_estimates_campaign_t;

#include "ad_group_delivery_estimates.h"
#include "budget_duration_type.h"
#include "delivery_estimate_objective_type.h"



typedef struct campaign_delivery_estimates_campaign_t {
    list_t *ad_groups; //nonprimitive container
    budget_duration_type_t *budget_duration_type; // custom
    int *daily_spend_cap; //numeric
    char *end_date; // string
    int *lifetime_spend_cap; //numeric
    pinterest_rest_api_delivery_estimate_objective_type__e objective_type; //referenced enum
    char *start_date; // string

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_delivery_estimates_campaign_t;

__attribute__((deprecated)) campaign_delivery_estimates_campaign_t *campaign_delivery_estimates_campaign_create(
    list_t *ad_groups,
    budget_duration_type_t *budget_duration_type,
    int *daily_spend_cap,
    char *end_date,
    int *lifetime_spend_cap,
    pinterest_rest_api_delivery_estimate_objective_type__e objective_type,
    char *start_date
);

void campaign_delivery_estimates_campaign_free(campaign_delivery_estimates_campaign_t *campaign_delivery_estimates_campaign);

campaign_delivery_estimates_campaign_t *campaign_delivery_estimates_campaign_parseFromJSON(cJSON *campaign_delivery_estimates_campaignJSON);

cJSON *campaign_delivery_estimates_campaign_convertToJSON(campaign_delivery_estimates_campaign_t *campaign_delivery_estimates_campaign);

#endif /* _campaign_delivery_estimates_campaign_H_ */

