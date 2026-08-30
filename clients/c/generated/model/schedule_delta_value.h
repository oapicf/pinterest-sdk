/*
 * schedule_delta_value.h
 *
 * The value of the scheduled adjustment.
 */

#ifndef _schedule_delta_value_H_
#define _schedule_delta_value_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct schedule_delta_value_t schedule_delta_value_t;

#include "bid_options_age_bucket_multipliers.h"
#include "bid_options_app_type_multipliers.h"
#include "bid_options_audience_multipliers.h"
#include "bid_options_gender_multipliers.h"
#include "bid_options_placement_multipliers.h"
#include "schedule_bid_multipliers.h"



typedef struct schedule_delta_value_t {
    struct bid_options_age_bucket_multipliers_t *age_bucket_multipliers; //model
    struct bid_options_app_type_multipliers_t *app_type_multipliers; //model
    list_t *audience_multipliers; //nonprimitive container
    struct bid_options_gender_multipliers_t *gender_multipliers; //model
    struct bid_options_placement_multipliers_t *placement_multipliers; //model

    int _library_owned; // Is the library responsible for freeing this object?
} schedule_delta_value_t;

__attribute__((deprecated)) schedule_delta_value_t *schedule_delta_value_create(
    bid_options_age_bucket_multipliers_t *age_bucket_multipliers,
    bid_options_app_type_multipliers_t *app_type_multipliers,
    list_t *audience_multipliers,
    bid_options_gender_multipliers_t *gender_multipliers,
    bid_options_placement_multipliers_t *placement_multipliers
);

void schedule_delta_value_free(schedule_delta_value_t *schedule_delta_value);

schedule_delta_value_t *schedule_delta_value_parseFromJSON(cJSON *schedule_delta_valueJSON);

cJSON *schedule_delta_value_convertToJSON(schedule_delta_value_t *schedule_delta_value);

#endif /* _schedule_delta_value_H_ */

