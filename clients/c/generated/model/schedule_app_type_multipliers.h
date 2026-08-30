/*
 * schedule_app_type_multipliers.h
 *
 * This represents a mapping from app type targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */

#ifndef _schedule_app_type_multipliers_H_
#define _schedule_app_type_multipliers_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct schedule_app_type_multipliers_t schedule_app_type_multipliers_t;

#include "targeting_spec_app_type.h"



typedef struct schedule_app_type_multipliers_t {
    pinterest_rest_api_targeting_spec_app_type__e app_type; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} schedule_app_type_multipliers_t;

__attribute__((deprecated)) schedule_app_type_multipliers_t *schedule_app_type_multipliers_create(
    pinterest_rest_api_targeting_spec_app_type__e app_type
);

void schedule_app_type_multipliers_free(schedule_app_type_multipliers_t *schedule_app_type_multipliers);

schedule_app_type_multipliers_t *schedule_app_type_multipliers_parseFromJSON(cJSON *schedule_app_type_multipliersJSON);

cJSON *schedule_app_type_multipliers_convertToJSON(schedule_app_type_multipliers_t *schedule_app_type_multipliers);

#endif /* _schedule_app_type_multipliers_H_ */

