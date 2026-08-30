/*
 * retail_local_inventory_item_attributes.h
 *
 * Local inventory attributes for retail items (required fields for create/upsert)
 */

#ifndef _retail_local_inventory_item_attributes_H_
#define _retail_local_inventory_item_attributes_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct retail_local_inventory_item_attributes_t retail_local_inventory_item_attributes_t;

#include "item_availability.h"



typedef struct retail_local_inventory_item_attributes_t {
    char *ad_link; // string
    item_availability_t *availability; // custom
    char *price; // string
    char *sale_price; // string

    int _library_owned; // Is the library responsible for freeing this object?
} retail_local_inventory_item_attributes_t;

__attribute__((deprecated)) retail_local_inventory_item_attributes_t *retail_local_inventory_item_attributes_create(
    char *ad_link,
    item_availability_t *availability,
    char *price,
    char *sale_price
);

void retail_local_inventory_item_attributes_free(retail_local_inventory_item_attributes_t *retail_local_inventory_item_attributes);

retail_local_inventory_item_attributes_t *retail_local_inventory_item_attributes_parseFromJSON(cJSON *retail_local_inventory_item_attributesJSON);

cJSON *retail_local_inventory_item_attributes_convertToJSON(retail_local_inventory_item_attributes_t *retail_local_inventory_item_attributes);

#endif /* _retail_local_inventory_item_attributes_H_ */

