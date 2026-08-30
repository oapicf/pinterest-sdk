/*
 * campaign_planning_conversion_attribution.h
 *
 * Attribution windows for a conversion event.
 */

#ifndef _campaign_planning_conversion_attribution_H_
#define _campaign_planning_conversion_attribution_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_planning_conversion_attribution_t campaign_planning_conversion_attribution_t;

#include "campaign_planning_conversion_attribution_window_days.h"



typedef struct campaign_planning_conversion_attribution_t {
    campaign_planning_conversion_attribution_window_days_t *click_window_days; // custom
    campaign_planning_conversion_attribution_window_days_t *engagement_window_days; // custom
    campaign_planning_conversion_attribution_window_days_t *view_window_days; // custom

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_planning_conversion_attribution_t;

__attribute__((deprecated)) campaign_planning_conversion_attribution_t *campaign_planning_conversion_attribution_create(
    campaign_planning_conversion_attribution_window_days_t *click_window_days,
    campaign_planning_conversion_attribution_window_days_t *engagement_window_days,
    campaign_planning_conversion_attribution_window_days_t *view_window_days
);

void campaign_planning_conversion_attribution_free(campaign_planning_conversion_attribution_t *campaign_planning_conversion_attribution);

campaign_planning_conversion_attribution_t *campaign_planning_conversion_attribution_parseFromJSON(cJSON *campaign_planning_conversion_attributionJSON);

cJSON *campaign_planning_conversion_attribution_convertToJSON(campaign_planning_conversion_attribution_t *campaign_planning_conversion_attribution);

#endif /* _campaign_planning_conversion_attribution_H_ */

