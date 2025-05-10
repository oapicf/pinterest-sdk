/*
 * advanced_auction_processed_item.h
 *
 * Object describing the result of an operation on an item bid option
 */

#ifndef _advanced_auction_processed_item_H_
#define _advanced_auction_processed_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct advanced_auction_processed_item_t advanced_auction_processed_item_t;

#include "advanced_auction_bid_options.h"
#include "advanced_auction_items_submit_record.h"
#include "advanced_auction_operation.h"
#include "advanced_auction_operation_error.h"
#include "country.h"
#include "language.h"
#include "update_mask_bid_option_field.h"

// Enum  for advanced_auction_processed_item

typedef enum  { pinterest_rest_api_advanced_auction_processed_item__NULL = 0, pinterest_rest_api_advanced_auction_processed_item__BID, pinterest_rest_api_advanced_auction_processed_item__APP_TYPE_BID_MULTIPLIER_SET, pinterest_rest_api_advanced_auction_processed_item__PLACEMENT_BID_MULTIPLIER_SET } pinterest_rest_api_advanced_auction_processed_item__e;

char* advanced_auction_processed_item_update_mask_ToString(pinterest_rest_api_advanced_auction_processed_item__e update_mask);

pinterest_rest_api_advanced_auction_processed_item__e advanced_auction_processed_item_update_mask_FromString(char* update_mask);



typedef struct advanced_auction_processed_item_t {
    pinterest_rest_api_advanced_auction_operation__e operation; //referenced enum
    char *item_id; // string
    pinterest_rest_api_country__e country; //referenced enum
    pinterest_rest_api_language__e language; //referenced enum
    struct advanced_auction_bid_options_t *bid_options; //model
    list_t *update_mask; //nonprimitive container
    list_t *errors; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} advanced_auction_processed_item_t;

__attribute__((deprecated)) advanced_auction_processed_item_t *advanced_auction_processed_item_create(
    pinterest_rest_api_advanced_auction_operation__e operation,
    char *item_id,
    pinterest_rest_api_country__e country,
    pinterest_rest_api_language__e language,
    advanced_auction_bid_options_t *bid_options,
    list_t *update_mask,
    list_t *errors
);

void advanced_auction_processed_item_free(advanced_auction_processed_item_t *advanced_auction_processed_item);

advanced_auction_processed_item_t *advanced_auction_processed_item_parseFromJSON(cJSON *advanced_auction_processed_itemJSON);

cJSON *advanced_auction_processed_item_convertToJSON(advanced_auction_processed_item_t *advanced_auction_processed_item);

#endif /* _advanced_auction_processed_item_H_ */

