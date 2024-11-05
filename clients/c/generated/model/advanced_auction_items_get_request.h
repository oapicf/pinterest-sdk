/*
 * advanced_auction_items_get_request.h
 *
 * Request object used to get bid options values for a batch of retail catalog items
 */

#ifndef _advanced_auction_items_get_request_H_
#define _advanced_auction_items_get_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct advanced_auction_items_get_request_t advanced_auction_items_get_request_t;

#include "advanced_auction_items_get_record.h"



typedef struct advanced_auction_items_get_request_t {
    char *catalog_id; // string
    list_t *items; //nonprimitive container

} advanced_auction_items_get_request_t;

advanced_auction_items_get_request_t *advanced_auction_items_get_request_create(
    char *catalog_id,
    list_t *items
);

void advanced_auction_items_get_request_free(advanced_auction_items_get_request_t *advanced_auction_items_get_request);

advanced_auction_items_get_request_t *advanced_auction_items_get_request_parseFromJSON(cJSON *advanced_auction_items_get_requestJSON);

cJSON *advanced_auction_items_get_request_convertToJSON(advanced_auction_items_get_request_t *advanced_auction_items_get_request);

#endif /* _advanced_auction_items_get_request_H_ */

