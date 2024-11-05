/*
 * placement_multipliers.h
 *
 * This represents a mapping from placement to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified placement in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 */

#ifndef _placement_multipliers_H_
#define _placement_multipliers_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct placement_multipliers_t placement_multipliers_t;


// Enum PLACEMENT for placement_multipliers

typedef enum  { pinterest_rest_api_placement_multipliers_PLACEMENT_NULL = 0, pinterest_rest_api_placement_multipliers_PLACEMENT_SEARCH, pinterest_rest_api_placement_multipliers_PLACEMENT_BROWSE } pinterest_rest_api_placement_multipliers_PLACEMENT_e;

char* placement_multipliers_placement_ToString(pinterest_rest_api_placement_multipliers_PLACEMENT_e placement);

pinterest_rest_api_placement_multipliers_PLACEMENT_e placement_multipliers_placement_FromString(char* placement);



typedef struct placement_multipliers_t {
    pinterest_rest_api_placement_multipliers_PLACEMENT_e placement; //enum

} placement_multipliers_t;

placement_multipliers_t *placement_multipliers_create(
    pinterest_rest_api_placement_multipliers_PLACEMENT_e placement
);

void placement_multipliers_free(placement_multipliers_t *placement_multipliers);

placement_multipliers_t *placement_multipliers_parseFromJSON(cJSON *placement_multipliersJSON);

cJSON *placement_multipliers_convertToJSON(placement_multipliers_t *placement_multipliers);

#endif /* _placement_multipliers_H_ */

