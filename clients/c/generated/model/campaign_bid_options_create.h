/*
 * campaign_bid_options_create.h
 *
 * Object describing the campaign level bid multipliers.
 */

#ifndef _campaign_bid_options_create_H_
#define _campaign_bid_options_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_bid_options_create_t campaign_bid_options_create_t;

#include "app_type_multipliers.h"
#include "campaign_audience_multipliers.h"
#include "placement_multipliers.h"



typedef struct campaign_bid_options_create_t {
    app_type_multipliers_t *app_type_multipliers; // custom
    campaign_audience_multipliers_t *audience_multipliers; // custom
    placement_multipliers_t *placement_multipliers; // custom

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_bid_options_create_t;

__attribute__((deprecated)) campaign_bid_options_create_t *campaign_bid_options_create_create(
    app_type_multipliers_t *app_type_multipliers,
    campaign_audience_multipliers_t *audience_multipliers,
    placement_multipliers_t *placement_multipliers
);

void campaign_bid_options_create_free(campaign_bid_options_create_t *campaign_bid_options_create);

campaign_bid_options_create_t *campaign_bid_options_create_parseFromJSON(cJSON *campaign_bid_options_createJSON);

cJSON *campaign_bid_options_create_convertToJSON(campaign_bid_options_create_t *campaign_bid_options_create);

#endif /* _campaign_bid_options_create_H_ */

