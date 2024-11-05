/*
 * advanced_auction_items.h
 *
 * Response object containing item bid options
 */

#ifndef _advanced_auction_items_H_
#define _advanced_auction_items_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct advanced_auction_items_t advanced_auction_items_t;

#include "advanced_auction_item.h"



typedef struct advanced_auction_items_t {
    char *catalog_id; // string
    list_t *items; //nonprimitive container

} advanced_auction_items_t;

advanced_auction_items_t *advanced_auction_items_create(
    char *catalog_id,
    list_t *items
);

void advanced_auction_items_free(advanced_auction_items_t *advanced_auction_items);

advanced_auction_items_t *advanced_auction_items_parseFromJSON(cJSON *advanced_auction_itemsJSON);

cJSON *advanced_auction_items_convertToJSON(advanced_auction_items_t *advanced_auction_items);

#endif /* _advanced_auction_items_H_ */

