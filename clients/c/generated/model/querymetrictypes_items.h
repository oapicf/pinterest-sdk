/*
 * querymetrictypes_items.h
 *
 * 
 */

#ifndef _querymetrictypes_items_H_
#define _querymetrictypes_items_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct querymetrictypes_items_t querymetrictypes_items_t;


// Enum  for querymetrictypes_items

typedef enum { pinterest_rest_api_querymetrictypes_items__NULL = 0, pinterest_rest_api_querymetrictypes_items__ENGAGEMENT, pinterest_rest_api_querymetrictypes_items__ENGAGEMENT_RATE, pinterest_rest_api_querymetrictypes_items__IMPRESSION, pinterest_rest_api_querymetrictypes_items__OUTBOUND_CLICK, pinterest_rest_api_querymetrictypes_items__OUTBOUND_CLICK_RATE, pinterest_rest_api_querymetrictypes_items__PIN_CLICK, pinterest_rest_api_querymetrictypes_items__PIN_CLICK_RATE, pinterest_rest_api_querymetrictypes_items__SAVE, pinterest_rest_api_querymetrictypes_items__SAVE_RATE } pinterest_rest_api_querymetrictypes_items__e;

char* querymetrictypes_items_querymetrictypes_items_ToString(pinterest_rest_api_querymetrictypes_items__e querymetrictypes_items);

pinterest_rest_api_querymetrictypes_items__e querymetrictypes_items_querymetrictypes_items_FromString(char* querymetrictypes_items);

cJSON *querymetrictypes_items_convertToJSON(pinterest_rest_api_querymetrictypes_items__e querymetrictypes_items);

pinterest_rest_api_querymetrictypes_items__e querymetrictypes_items_parseFromJSON(cJSON *querymetrictypes_itemsJSON);

#endif /* _querymetrictypes_items_H_ */

