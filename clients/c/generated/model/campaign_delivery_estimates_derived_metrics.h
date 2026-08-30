/*
 * campaign_delivery_estimates_derived_metrics.h
 *
 * Derived metrics for an ad campaign.
 */

#ifndef _campaign_delivery_estimates_derived_metrics_H_
#define _campaign_delivery_estimates_derived_metrics_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_delivery_estimates_derived_metrics_t campaign_delivery_estimates_derived_metrics_t;




typedef struct campaign_delivery_estimates_derived_metrics_t {
    float *cpc; //numeric
    float *cpc_lower; //numeric
    float *cpc_upper; //numeric
    float *cpm; //numeric
    float *cpm_lower; //numeric
    float *cpm_upper; //numeric
    float *lifetime_frequency; //numeric
    float *lifetime_frequency_lower; //numeric
    float *lifetime_frequency_upper; //numeric
    float *lifetime_impression; //numeric
    float *lifetime_impression_lower; //numeric
    float *lifetime_impression_upper; //numeric
    float *lifetime_reach; //numeric
    float *lifetime_reach_lower; //numeric
    float *lifetime_reach_upper; //numeric
    float *weekly_click; //numeric
    float *weekly_click_lower; //numeric
    float *weekly_click_upper; //numeric
    float *weekly_frequency; //numeric
    float *weekly_frequency_lower; //numeric
    float *weekly_frequency_upper; //numeric
    float *weekly_impression; //numeric
    float *weekly_impression_lower; //numeric
    float *weekly_impression_upper; //numeric
    float *weekly_reach; //numeric
    float *weekly_reach_lower; //numeric
    float *weekly_reach_upper; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_delivery_estimates_derived_metrics_t;

__attribute__((deprecated)) campaign_delivery_estimates_derived_metrics_t *campaign_delivery_estimates_derived_metrics_create(
    float *cpc,
    float *cpc_lower,
    float *cpc_upper,
    float *cpm,
    float *cpm_lower,
    float *cpm_upper,
    float *lifetime_frequency,
    float *lifetime_frequency_lower,
    float *lifetime_frequency_upper,
    float *lifetime_impression,
    float *lifetime_impression_lower,
    float *lifetime_impression_upper,
    float *lifetime_reach,
    float *lifetime_reach_lower,
    float *lifetime_reach_upper,
    float *weekly_click,
    float *weekly_click_lower,
    float *weekly_click_upper,
    float *weekly_frequency,
    float *weekly_frequency_lower,
    float *weekly_frequency_upper,
    float *weekly_impression,
    float *weekly_impression_lower,
    float *weekly_impression_upper,
    float *weekly_reach,
    float *weekly_reach_lower,
    float *weekly_reach_upper
);

void campaign_delivery_estimates_derived_metrics_free(campaign_delivery_estimates_derived_metrics_t *campaign_delivery_estimates_derived_metrics);

campaign_delivery_estimates_derived_metrics_t *campaign_delivery_estimates_derived_metrics_parseFromJSON(cJSON *campaign_delivery_estimates_derived_metricsJSON);

cJSON *campaign_delivery_estimates_derived_metrics_convertToJSON(campaign_delivery_estimates_derived_metrics_t *campaign_delivery_estimates_derived_metrics);

#endif /* _campaign_delivery_estimates_derived_metrics_H_ */

