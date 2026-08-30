/*
 * advanced_auction_item.h
 *
 * 
 */

#ifndef _advanced_auction_item_H_
#define _advanced_auction_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct advanced_auction_item_t advanced_auction_item_t;

#include "advanced_auction_bid_options.h"
#include "country.h"
#include "language.h"



typedef struct advanced_auction_item_t {
    struct advanced_auction_bid_options_t *bid_options; //model
    pinterest_rest_api_country__e country; //referenced enum
    char *item_id; // string
    pinterest_rest_api_language__e language; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} advanced_auction_item_t;

__attribute__((deprecated)) advanced_auction_item_t *advanced_auction_item_create(
    advanced_auction_bid_options_t *bid_options,
    pinterest_rest_api_country__e country,
    char *item_id,
    pinterest_rest_api_language__e language
);

void advanced_auction_item_free(advanced_auction_item_t *advanced_auction_item);

advanced_auction_item_t *advanced_auction_item_parseFromJSON(cJSON *advanced_auction_itemJSON);

cJSON *advanced_auction_item_convertToJSON(advanced_auction_item_t *advanced_auction_item);

#endif /* _advanced_auction_item_H_ */

