/*
 * campaign_delivery_estimates_response.h
 *
 * Delivery estimates response for a campaign.
 */

#ifndef _campaign_delivery_estimates_response_H_
#define _campaign_delivery_estimates_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_delivery_estimates_response_t campaign_delivery_estimates_response_t;

#include "campaign_delivery_estimates_derived_metrics.h"
#include "campaign_planning_curve_estimate.h"



typedef struct campaign_delivery_estimates_response_t {
    list_t *curves; //nonprimitive container
    struct campaign_delivery_estimates_derived_metrics_t *derived_metrics; //model
    int *max_potential_spend; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_delivery_estimates_response_t;

__attribute__((deprecated)) campaign_delivery_estimates_response_t *campaign_delivery_estimates_response_create(
    list_t *curves,
    campaign_delivery_estimates_derived_metrics_t *derived_metrics,
    int *max_potential_spend
);

void campaign_delivery_estimates_response_free(campaign_delivery_estimates_response_t *campaign_delivery_estimates_response);

campaign_delivery_estimates_response_t *campaign_delivery_estimates_response_parseFromJSON(cJSON *campaign_delivery_estimates_responseJSON);

cJSON *campaign_delivery_estimates_response_convertToJSON(campaign_delivery_estimates_response_t *campaign_delivery_estimates_response);

#endif /* _campaign_delivery_estimates_response_H_ */

