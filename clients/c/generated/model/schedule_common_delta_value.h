/*
 * schedule_common_delta_value.h
 *
 * 
 */

#ifndef _schedule_common_delta_value_H_
#define _schedule_common_delta_value_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct schedule_common_delta_value_t schedule_common_delta_value_t;

#include "schedule_age_bucket_multipliers.h"
#include "schedule_app_type_multipliers.h"
#include "schedule_audience_multipliers.h"
#include "schedule_bid_options.h"
#include "schedule_bid_options_gender_multipliers.h"
#include "schedule_bid_options_placement_multipliers.h"



typedef struct schedule_common_delta_value_t {
    schedule_age_bucket_multipliers_t *age_bucket_multipliers; // custom
    schedule_app_type_multipliers_t *app_type_multipliers; // custom
    schedule_audience_multipliers_t *audience_multipliers; // custom
    schedule_bid_options_gender_multipliers_t *gender_multipliers; // custom
    struct schedule_bid_options_placement_multipliers_t *placement_multipliers; //model

    int _library_owned; // Is the library responsible for freeing this object?
} schedule_common_delta_value_t;

__attribute__((deprecated)) schedule_common_delta_value_t *schedule_common_delta_value_create(
    schedule_age_bucket_multipliers_t *age_bucket_multipliers,
    schedule_app_type_multipliers_t *app_type_multipliers,
    schedule_audience_multipliers_t *audience_multipliers,
    schedule_bid_options_gender_multipliers_t *gender_multipliers,
    schedule_bid_options_placement_multipliers_t *placement_multipliers
);

void schedule_common_delta_value_free(schedule_common_delta_value_t *schedule_common_delta_value);

schedule_common_delta_value_t *schedule_common_delta_value_parseFromJSON(cJSON *schedule_common_delta_valueJSON);

cJSON *schedule_common_delta_value_convertToJSON(schedule_common_delta_value_t *schedule_common_delta_value);

#endif /* _schedule_common_delta_value_H_ */

