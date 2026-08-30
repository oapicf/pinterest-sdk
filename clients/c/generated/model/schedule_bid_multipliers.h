/*
 * schedule_bid_multipliers.h
 *
 * The value of the bid changes. This must be provided when the schedule type is CAMPAIGN_BID_MULTIPLIERS.
 */

#ifndef _schedule_bid_multipliers_H_
#define _schedule_bid_multipliers_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct schedule_bid_multipliers_t schedule_bid_multipliers_t;

#include "bid_options_age_bucket_multipliers.h"
#include "bid_options_app_type_multipliers.h"
#include "bid_options_audience_multipliers.h"
#include "bid_options_gender_multipliers.h"
#include "bid_options_placement_multipliers.h"



typedef struct schedule_bid_multipliers_t {
    struct bid_options_age_bucket_multipliers_t *age_bucket_multipliers; //model
    struct bid_options_app_type_multipliers_t *app_type_multipliers; //model
    list_t *audience_multipliers; //nonprimitive container
    struct bid_options_gender_multipliers_t *gender_multipliers; //model
    struct bid_options_placement_multipliers_t *placement_multipliers; //model

    int _library_owned; // Is the library responsible for freeing this object?
} schedule_bid_multipliers_t;

__attribute__((deprecated)) schedule_bid_multipliers_t *schedule_bid_multipliers_create(
    bid_options_age_bucket_multipliers_t *age_bucket_multipliers,
    bid_options_app_type_multipliers_t *app_type_multipliers,
    list_t *audience_multipliers,
    bid_options_gender_multipliers_t *gender_multipliers,
    bid_options_placement_multipliers_t *placement_multipliers
);

void schedule_bid_multipliers_free(schedule_bid_multipliers_t *schedule_bid_multipliers);

schedule_bid_multipliers_t *schedule_bid_multipliers_parseFromJSON(cJSON *schedule_bid_multipliersJSON);

cJSON *schedule_bid_multipliers_convertToJSON(schedule_bid_multipliers_t *schedule_bid_multipliers);

#endif /* _schedule_bid_multipliers_H_ */

