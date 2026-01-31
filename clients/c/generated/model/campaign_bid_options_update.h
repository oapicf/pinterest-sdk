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

#include "app_type_multipliers.h"
#include "campaign_audience_multipliers.h"
#include "placement_multipliers.h"

// Enum UPDATEMASK for campaign_bid_options_update

typedef enum  { pinterest_rest_api_campaign_bid_options_update_UPDATEMASK_NULL = 0, pinterest_rest_api_campaign_bid_options_update_UPDATEMASK_AUDIENCE, pinterest_rest_api_campaign_bid_options_update_UPDATEMASK_APP_TYPE, pinterest_rest_api_campaign_bid_options_update_UPDATEMASK_PLACEMENT, pinterest_rest_api_campaign_bid_options_update_UPDATEMASK_GENDER, pinterest_rest_api_campaign_bid_options_update_UPDATEMASK_AGE_BUCKET } pinterest_rest_api_campaign_bid_options_update_UPDATEMASK_e;

char* campaign_bid_options_update_update_mask_ToString(pinterest_rest_api_campaign_bid_options_update_UPDATEMASK_e update_mask);

pinterest_rest_api_campaign_bid_options_update_UPDATEMASK_e campaign_bid_options_update_update_mask_FromString(char* update_mask);



typedef struct campaign_bid_options_update_t {
    app_type_multipliers_t *app_type_multipliers; // custom
    campaign_audience_multipliers_t *audience_multipliers; // custom
    placement_multipliers_t *placement_multipliers; // custom
    list_t *update_mask; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_bid_options_update_t;

__attribute__((deprecated)) campaign_bid_options_update_t *campaign_bid_options_update_create(
    app_type_multipliers_t *app_type_multipliers,
    campaign_audience_multipliers_t *audience_multipliers,
    placement_multipliers_t *placement_multipliers,
    list_t *update_mask
);

void campaign_bid_options_update_free(campaign_bid_options_update_t *campaign_bid_options_update);

campaign_bid_options_update_t *campaign_bid_options_update_parseFromJSON(cJSON *campaign_bid_options_updateJSON);

cJSON *campaign_bid_options_update_convertToJSON(campaign_bid_options_update_t *campaign_bid_options_update);

#endif /* _campaign_bid_options_update_H_ */

