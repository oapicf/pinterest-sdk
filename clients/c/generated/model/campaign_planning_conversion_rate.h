/*
 * campaign_planning_conversion_rate.h
 *
 * Conversion rate estimate for a specific conversion event and attribution window combination.
 */

#ifndef _campaign_planning_conversion_rate_H_
#define _campaign_planning_conversion_rate_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_planning_conversion_rate_t campaign_planning_conversion_rate_t;

#include "campaign_planning_conversion_attribution.h"
#include "campaign_planning_conversion_event.h"



typedef struct campaign_planning_conversion_rate_t {
    struct campaign_planning_conversion_attribution_t *attribution_windows; //model
    pinterest_rest_api_campaign_planning_conversion_event__e conversion_event; //referenced enum
    float *conversion_rate; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_planning_conversion_rate_t;

__attribute__((deprecated)) campaign_planning_conversion_rate_t *campaign_planning_conversion_rate_create(
    campaign_planning_conversion_attribution_t *attribution_windows,
    pinterest_rest_api_campaign_planning_conversion_event__e conversion_event,
    float *conversion_rate
);

void campaign_planning_conversion_rate_free(campaign_planning_conversion_rate_t *campaign_planning_conversion_rate);

campaign_planning_conversion_rate_t *campaign_planning_conversion_rate_parseFromJSON(cJSON *campaign_planning_conversion_rateJSON);

cJSON *campaign_planning_conversion_rate_convertToJSON(campaign_planning_conversion_rate_t *campaign_planning_conversion_rate);

#endif /* _campaign_planning_conversion_rate_H_ */

