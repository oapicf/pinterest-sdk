/*
 * advanced_auction_items_submit_record.h
 *
 * Object describing an item bid option operation
 */

#ifndef _advanced_auction_items_submit_record_H_
#define _advanced_auction_items_submit_record_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct advanced_auction_items_submit_record_t advanced_auction_items_submit_record_t;

#include "advanced_auction_bid_options.h"
#include "advanced_auction_items_submit_delete_record.h"
#include "advanced_auction_items_submit_upsert_record.h"
#include "advanced_auction_operation_error.h"
#include "country.h"
#include "language.h"
#include "update_mask_bid_option_field.h"

// Enum OPERATION for advanced_auction_items_submit_record

typedef enum  { pinterest_rest_api_advanced_auction_items_submit_record_OPERATION_NULL = 0, pinterest_rest_api_advanced_auction_items_submit_record_OPERATION__DELETE } pinterest_rest_api_advanced_auction_items_submit_record_OPERATION_e;

char* advanced_auction_items_submit_record_operation_ToString(pinterest_rest_api_advanced_auction_items_submit_record_OPERATION_e operation);

pinterest_rest_api_advanced_auction_items_submit_record_OPERATION_e advanced_auction_items_submit_record_operation_FromString(char* operation);

// Enum  for advanced_auction_items_submit_record

typedef enum  { pinterest_rest_api_advanced_auction_items_submit_record__NULL = 0, pinterest_rest_api_advanced_auction_items_submit_record__BID, pinterest_rest_api_advanced_auction_items_submit_record__APP_TYPE_BID_MULTIPLIER_SET, pinterest_rest_api_advanced_auction_items_submit_record__PLACEMENT_BID_MULTIPLIER_SET } pinterest_rest_api_advanced_auction_items_submit_record__e;

char* advanced_auction_items_submit_record_update_mask_ToString(pinterest_rest_api_advanced_auction_items_submit_record__e update_mask);

pinterest_rest_api_advanced_auction_items_submit_record__e advanced_auction_items_submit_record_update_mask_FromString(char* update_mask);



typedef struct advanced_auction_items_submit_record_t {
    struct advanced_auction_bid_options_t *bid_options; //model
    pinterest_rest_api_country__e country; //referenced enum
    list_t *errors; //nonprimitive container
    char *item_id; // string
    pinterest_rest_api_language__e language; //referenced enum
    pinterest_rest_api_advanced_auction_items_submit_record_OPERATION_e operation; //enum
    list_t *update_mask; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} advanced_auction_items_submit_record_t;

__attribute__((deprecated)) advanced_auction_items_submit_record_t *advanced_auction_items_submit_record_create(
    advanced_auction_bid_options_t *bid_options,
    pinterest_rest_api_country__e country,
    list_t *errors,
    char *item_id,
    pinterest_rest_api_language__e language,
    pinterest_rest_api_advanced_auction_items_submit_record_OPERATION_e operation,
    list_t *update_mask
);

void advanced_auction_items_submit_record_free(advanced_auction_items_submit_record_t *advanced_auction_items_submit_record);

advanced_auction_items_submit_record_t *advanced_auction_items_submit_record_parseFromJSON(cJSON *advanced_auction_items_submit_recordJSON);

cJSON *advanced_auction_items_submit_record_convertToJSON(advanced_auction_items_submit_record_t *advanced_auction_items_submit_record);

#endif /* _advanced_auction_items_submit_record_H_ */

