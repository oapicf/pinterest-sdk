/*
 * campaign_bid_options_update.h
 *
 * Object describing an update to the campaign level bid multipliers.
 */

#ifndef _campaign_bid_options_update_H_
#define _campaign_bid_options_update_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_bid_options_update_t campaign_bid_options_update_t;

#include "age_bucket_multipliers.h"
#include "app_type_multipliers.h"
#include "campaign_audience_multipliers.h"
#include "campaign_bid_options_update_mask_items.h"
#include "freq_bid_multiplier_time_window.h"
#include "frequency_multipliers.h"
#include "gender_multipliers.h"
#include "placement_multipliers.h"

// Enum  for campaign_bid_options_update

typedef enum  { pinterest_rest_api_campaign_bid_options_update__NULL = 0, pinterest_rest_api_campaign_bid_options_update__AUDIENCE, pinterest_rest_api_campaign_bid_options_update__APP_TYPE, pinterest_rest_api_campaign_bid_options_update__PLACEMENT, pinterest_rest_api_campaign_bid_options_update__GENDER, pinterest_rest_api_campaign_bid_options_update__AGE_BUCKET, pinterest_rest_api_campaign_bid_options_update__FREQUENCY } pinterest_rest_api_campaign_bid_options_update__e;

char* campaign_bid_options_update_update_mask_ToString(pinterest_rest_api_campaign_bid_options_update__e update_mask);

pinterest_rest_api_campaign_bid_options_update__e campaign_bid_options_update_update_mask_FromString(char* update_mask);



typedef struct campaign_bid_options_update_t {
    age_bucket_multipliers_t *age_bucket_multipliers; // custom
    app_type_multipliers_t *app_type_multipliers; // custom
    campaign_audience_multipliers_t *audience_multipliers; // custom
    freq_bid_multiplier_time_window_t *freq_bid_multiplier_time_window; // custom
    frequency_multipliers_t *frequency_multipliers; // custom
    gender_multipliers_t *gender_multipliers; // custom
    placement_multipliers_t *placement_multipliers; // custom
    list_t *update_mask; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_bid_options_update_t;

__attribute__((deprecated)) campaign_bid_options_update_t *campaign_bid_options_update_create(
    age_bucket_multipliers_t *age_bucket_multipliers,
    app_type_multipliers_t *app_type_multipliers,
    campaign_audience_multipliers_t *audience_multipliers,
    freq_bid_multiplier_time_window_t *freq_bid_multiplier_time_window,
    frequency_multipliers_t *frequency_multipliers,
    gender_multipliers_t *gender_multipliers,
    placement_multipliers_t *placement_multipliers,
    list_t *update_mask
);

void campaign_bid_options_update_free(campaign_bid_options_update_t *campaign_bid_options_update);

campaign_bid_options_update_t *campaign_bid_options_update_parseFromJSON(cJSON *campaign_bid_options_updateJSON);

cJSON *campaign_bid_options_update_convertToJSON(campaign_bid_options_update_t *campaign_bid_options_update);

#endif /* _campaign_bid_options_update_H_ */

