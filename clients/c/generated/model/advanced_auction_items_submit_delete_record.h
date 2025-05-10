/*
 * advanced_auction_items_submit_delete_record.h
 *
 * Object describing an item bid option deletion operation
 */

#ifndef _advanced_auction_items_submit_delete_record_H_
#define _advanced_auction_items_submit_delete_record_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct advanced_auction_items_submit_delete_record_t advanced_auction_items_submit_delete_record_t;

#include "country.h"
#include "language.h"



typedef struct advanced_auction_items_submit_delete_record_t {
    char *item_id; // string
    pinterest_rest_api_country__e country; //referenced enum
    pinterest_rest_api_language__e language; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} advanced_auction_items_submit_delete_record_t;

__attribute__((deprecated)) advanced_auction_items_submit_delete_record_t *advanced_auction_items_submit_delete_record_create(
    char *item_id,
    pinterest_rest_api_country__e country,
    pinterest_rest_api_language__e language
);

void advanced_auction_items_submit_delete_record_free(advanced_auction_items_submit_delete_record_t *advanced_auction_items_submit_delete_record);

advanced_auction_items_submit_delete_record_t *advanced_auction_items_submit_delete_record_parseFromJSON(cJSON *advanced_auction_items_submit_delete_recordJSON);

cJSON *advanced_auction_items_submit_delete_record_convertToJSON(advanced_auction_items_submit_delete_record_t *advanced_auction_items_submit_delete_record);

#endif /* _advanced_auction_items_submit_delete_record_H_ */

