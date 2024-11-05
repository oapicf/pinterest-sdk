/*
 * advanced_auction_items_submit_request.h
 *
 * Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items
 */

#ifndef _advanced_auction_items_submit_request_H_
#define _advanced_auction_items_submit_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct advanced_auction_items_submit_request_t advanced_auction_items_submit_request_t;

#include "advanced_auction_items_submit_record.h"



typedef struct advanced_auction_items_submit_request_t {
    char *catalog_id; // string
    list_t *items; //nonprimitive container

} advanced_auction_items_submit_request_t;

advanced_auction_items_submit_request_t *advanced_auction_items_submit_request_create(
    char *catalog_id,
    list_t *items
);

void advanced_auction_items_submit_request_free(advanced_auction_items_submit_request_t *advanced_auction_items_submit_request);

advanced_auction_items_submit_request_t *advanced_auction_items_submit_request_parseFromJSON(cJSON *advanced_auction_items_submit_requestJSON);

cJSON *advanced_auction_items_submit_request_convertToJSON(advanced_auction_items_submit_request_t *advanced_auction_items_submit_request);

#endif /* _advanced_auction_items_submit_request_H_ */

