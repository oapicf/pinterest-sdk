/*
 * query_label_entity_statuses_items.h
 *
 * 
 */

#ifndef _query_label_entity_statuses_items_H_
#define _query_label_entity_statuses_items_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct query_label_entity_statuses_items_t query_label_entity_statuses_items_t;


// Enum  for query_label_entity_statuses_items

typedef enum { pinterest_rest_api_query_label_entity_statuses_items__NULL = 0, pinterest_rest_api_query_label_entity_statuses_items__ACTIVE, pinterest_rest_api_query_label_entity_statuses_items__ARCHIVED } pinterest_rest_api_query_label_entity_statuses_items__e;

char* query_label_entity_statuses_items_query_label_entity_statuses_items_ToString(pinterest_rest_api_query_label_entity_statuses_items__e query_label_entity_statuses_items);

pinterest_rest_api_query_label_entity_statuses_items__e query_label_entity_statuses_items_query_label_entity_statuses_items_FromString(char* query_label_entity_statuses_items);

cJSON *query_label_entity_statuses_items_convertToJSON(pinterest_rest_api_query_label_entity_statuses_items__e query_label_entity_statuses_items);

pinterest_rest_api_query_label_entity_statuses_items__e query_label_entity_statuses_items_parseFromJSON(cJSON *query_label_entity_statuses_itemsJSON);

#endif /* _query_label_entity_statuses_items_H_ */

