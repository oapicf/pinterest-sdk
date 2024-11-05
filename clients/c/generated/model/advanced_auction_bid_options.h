/*
 * advanced_auction_bid_options.h
 *
 * Object describing a retail catalog item&#39;s bid options (bid price and bid multipliers).
 */

#ifndef _advanced_auction_bid_options_H_
#define _advanced_auction_bid_options_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct advanced_auction_bid_options_t advanced_auction_bid_options_t;

#include "app_type_multipliers.h"
#include "placement_multipliers.h"



typedef struct advanced_auction_bid_options_t {
    long bid_in_micro_currency; //numeric
    app_type_multipliers_t *app_type_multipliers; // custom
    placement_multipliers_t *placement_multipliers; // custom

} advanced_auction_bid_options_t;

advanced_auction_bid_options_t *advanced_auction_bid_options_create(
    long bid_in_micro_currency,
    app_type_multipliers_t *app_type_multipliers,
    placement_multipliers_t *placement_multipliers
);

void advanced_auction_bid_options_free(advanced_auction_bid_options_t *advanced_auction_bid_options);

advanced_auction_bid_options_t *advanced_auction_bid_options_parseFromJSON(cJSON *advanced_auction_bid_optionsJSON);

cJSON *advanced_auction_bid_options_convertToJSON(advanced_auction_bid_options_t *advanced_auction_bid_options);

#endif /* _advanced_auction_bid_options_H_ */

