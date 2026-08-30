/*
 * campaign_bid_options.h
 *
 * Object describing the campaign level bid multipliers.
 */

#ifndef _campaign_bid_options_H_
#define _campaign_bid_options_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_bid_options_t campaign_bid_options_t;

#include "age_bucket_multipliers.h"
#include "app_type_multipliers.h"
#include "campaign_audience_multipliers.h"
#include "freq_bid_multiplier_time_window.h"
#include "frequency_multipliers.h"
#include "gender_multipliers.h"
#include "placement_multipliers.h"



typedef struct campaign_bid_options_t {
    age_bucket_multipliers_t *age_bucket_multipliers; // custom
    app_type_multipliers_t *app_type_multipliers; // custom
    campaign_audience_multipliers_t *audience_multipliers; // custom
    freq_bid_multiplier_time_window_t *freq_bid_multiplier_time_window; // custom
    frequency_multipliers_t *frequency_multipliers; // custom
    gender_multipliers_t *gender_multipliers; // custom
    placement_multipliers_t *placement_multipliers; // custom

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_bid_options_t;

__attribute__((deprecated)) campaign_bid_options_t *campaign_bid_options_create(
    age_bucket_multipliers_t *age_bucket_multipliers,
    app_type_multipliers_t *app_type_multipliers,
    campaign_audience_multipliers_t *audience_multipliers,
    freq_bid_multiplier_time_window_t *freq_bid_multiplier_time_window,
    frequency_multipliers_t *frequency_multipliers,
    gender_multipliers_t *gender_multipliers,
    placement_multipliers_t *placement_multipliers
);

void campaign_bid_options_free(campaign_bid_options_t *campaign_bid_options);

campaign_bid_options_t *campaign_bid_options_parseFromJSON(cJSON *campaign_bid_optionsJSON);

cJSON *campaign_bid_options_convertToJSON(campaign_bid_options_t *campaign_bid_options);

#endif /* _campaign_bid_options_H_ */

