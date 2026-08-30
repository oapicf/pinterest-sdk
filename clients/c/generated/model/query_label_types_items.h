/*
 * query_label_types_items.h
 *
 * 
 */

#ifndef _query_label_types_items_H_
#define _query_label_types_items_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct query_label_types_items_t query_label_types_items_t;


// Enum  for query_label_types_items

typedef enum { pinterest_rest_api_query_label_types_items__NULL = 0, pinterest_rest_api_query_label_types_items__BRAND, pinterest_rest_api_query_label_types_items__CUSTOM } pinterest_rest_api_query_label_types_items__e;

char* query_label_types_items_query_label_types_items_ToString(pinterest_rest_api_query_label_types_items__e query_label_types_items);

pinterest_rest_api_query_label_types_items__e query_label_types_items_query_label_types_items_FromString(char* query_label_types_items);

cJSON *query_label_types_items_convertToJSON(pinterest_rest_api_query_label_types_items__e query_label_types_items);

pinterest_rest_api_query_label_types_items__e query_label_types_items_parseFromJSON(cJSON *query_label_types_itemsJSON);

#endif /* _query_label_types_items_H_ */

