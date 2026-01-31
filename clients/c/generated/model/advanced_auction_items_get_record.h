/*
 * advanced_auction_items_get_record.h
 *
 * Object uniquely identifying a retail catalog item
 */

#ifndef _advanced_auction_items_get_record_H_
#define _advanced_auction_items_get_record_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct advanced_auction_items_get_record_t advanced_auction_items_get_record_t;

#include "country.h"
#include "language.h"



typedef struct advanced_auction_items_get_record_t {
    pinterest_rest_api_country__e country; //referenced enum
    char *item_id; // string
    pinterest_rest_api_language__e language; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} advanced_auction_items_get_record_t;

__attribute__((deprecated)) advanced_auction_items_get_record_t *advanced_auction_items_get_record_create(
    pinterest_rest_api_country__e country,
    char *item_id,
    pinterest_rest_api_language__e language
);

void advanced_auction_items_get_record_free(advanced_auction_items_get_record_t *advanced_auction_items_get_record);

advanced_auction_items_get_record_t *advanced_auction_items_get_record_parseFromJSON(cJSON *advanced_auction_items_get_recordJSON);

cJSON *advanced_auction_items_get_record_convertToJSON(advanced_auction_items_get_record_t *advanced_auction_items_get_record);

#endif /* _advanced_auction_items_get_record_H_ */

