/*
 * catalogs_items.h
 *
 * Response object of catalogs items
 */

#ifndef _catalogs_items_H_
#define _catalogs_items_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_items_t catalogs_items_t;

#include "item_response.h"



typedef struct catalogs_items_t {
    list_t *items; //nonprimitive container

} catalogs_items_t;

catalogs_items_t *catalogs_items_create(
    list_t *items
);

void catalogs_items_free(catalogs_items_t *catalogs_items);

catalogs_items_t *catalogs_items_parseFromJSON(cJSON *catalogs_itemsJSON);

cJSON *catalogs_items_convertToJSON(catalogs_items_t *catalogs_items);

#endif /* _catalogs_items_H_ */

