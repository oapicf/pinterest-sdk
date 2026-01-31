/*
 * updatable_item_attributes_gtin.h
 *
 * The unique universal product identifier.
 */

#ifndef _updatable_item_attributes_gtin_H_
#define _updatable_item_attributes_gtin_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct updatable_item_attributes_gtin_t updatable_item_attributes_gtin_t;




typedef struct updatable_item_attributes_gtin_t {

    int _library_owned; // Is the library responsible for freeing this object?
} updatable_item_attributes_gtin_t;

__attribute__((deprecated)) updatable_item_attributes_gtin_t *updatable_item_attributes_gtin_create(
);

void updatable_item_attributes_gtin_free(updatable_item_attributes_gtin_t *updatable_item_attributes_gtin);

updatable_item_attributes_gtin_t *updatable_item_attributes_gtin_parseFromJSON(cJSON *updatable_item_attributes_gtinJSON);

cJSON *updatable_item_attributes_gtin_convertToJSON(updatable_item_attributes_gtin_t *updatable_item_attributes_gtin);

#endif /* _updatable_item_attributes_gtin_H_ */

