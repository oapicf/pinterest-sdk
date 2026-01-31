/*
 * campaign_audience_multipliers.h
 *
 * This represents a mapping from Audience ID to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified audience in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 */

#ifndef _campaign_audience_multipliers_H_
#define _campaign_audience_multipliers_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_audience_multipliers_t campaign_audience_multipliers_t;




typedef struct campaign_audience_multipliers_t {
    char *audience_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_audience_multipliers_t;

__attribute__((deprecated)) campaign_audience_multipliers_t *campaign_audience_multipliers_create(
    char *audience_id
);

void campaign_audience_multipliers_free(campaign_audience_multipliers_t *campaign_audience_multipliers);

campaign_audience_multipliers_t *campaign_audience_multipliers_parseFromJSON(cJSON *campaign_audience_multipliersJSON);

cJSON *campaign_audience_multipliers_convertToJSON(campaign_audience_multipliers_t *campaign_audience_multipliers);

#endif /* _campaign_audience_multipliers_H_ */

