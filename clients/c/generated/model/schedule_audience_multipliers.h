/*
 * schedule_audience_multipliers.h
 *
 * This represents a mapping from Audience ID to a bid price change value. This is paired with the bid_multipliers schedule type. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */

#ifndef _schedule_audience_multipliers_H_
#define _schedule_audience_multipliers_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct schedule_audience_multipliers_t schedule_audience_multipliers_t;




typedef struct schedule_audience_multipliers_t {
    char *audience_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} schedule_audience_multipliers_t;

__attribute__((deprecated)) schedule_audience_multipliers_t *schedule_audience_multipliers_create(
    char *audience_id
);

void schedule_audience_multipliers_free(schedule_audience_multipliers_t *schedule_audience_multipliers);

schedule_audience_multipliers_t *schedule_audience_multipliers_parseFromJSON(cJSON *schedule_audience_multipliersJSON);

cJSON *schedule_audience_multipliers_convertToJSON(schedule_audience_multipliers_t *schedule_audience_multipliers);

#endif /* _schedule_audience_multipliers_H_ */

