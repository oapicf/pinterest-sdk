/*
 * bulk_campaign_delivery_estimates_item.h
 *
 * Delivery estimate result for a single campaign within a bulk request.
 */

#ifndef _bulk_campaign_delivery_estimates_item_H_
#define _bulk_campaign_delivery_estimates_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bulk_campaign_delivery_estimates_item_t bulk_campaign_delivery_estimates_item_t;

#include "campaign_delivery_estimates_derived_metrics.h"
#include "campaign_planning_ad_group_audience_size.h"
#include "campaign_planning_conversion_rate.h"
#include "campaign_planning_curve_estimate.h"
#include "campaign_planning_response_error.h"



typedef struct bulk_campaign_delivery_estimates_item_t {
    list_t *adgroup_audience_sizes; //nonprimitive container
    float *conversion_rate; //numeric
    list_t *conversion_rates; //nonprimitive container
    list_t *curves; //nonprimitive container
    struct campaign_delivery_estimates_derived_metrics_t *derived_metrics; //model
    list_t *errors; //nonprimitive container
    char *estimate_id; // string
    int *max_potential_spend; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} bulk_campaign_delivery_estimates_item_t;

__attribute__((deprecated)) bulk_campaign_delivery_estimates_item_t *bulk_campaign_delivery_estimates_item_create(
    list_t *adgroup_audience_sizes,
    float *conversion_rate,
    list_t *conversion_rates,
    list_t *curves,
    campaign_delivery_estimates_derived_metrics_t *derived_metrics,
    list_t *errors,
    char *estimate_id,
    int *max_potential_spend
);

void bulk_campaign_delivery_estimates_item_free(bulk_campaign_delivery_estimates_item_t *bulk_campaign_delivery_estimates_item);

bulk_campaign_delivery_estimates_item_t *bulk_campaign_delivery_estimates_item_parseFromJSON(cJSON *bulk_campaign_delivery_estimates_itemJSON);

cJSON *bulk_campaign_delivery_estimates_item_convertToJSON(bulk_campaign_delivery_estimates_item_t *bulk_campaign_delivery_estimates_item);

#endif /* _bulk_campaign_delivery_estimates_item_H_ */

