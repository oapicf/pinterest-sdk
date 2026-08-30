/*
 * product_tag_item.h
 *
 * Product tag request item containing the pin_id of the product to tag.
 */

#ifndef _product_tag_item_H_
#define _product_tag_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct product_tag_item_t product_tag_item_t;




typedef struct product_tag_item_t {
    char *pin_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} product_tag_item_t;

__attribute__((deprecated)) product_tag_item_t *product_tag_item_create(
    char *pin_id
);

void product_tag_item_free(product_tag_item_t *product_tag_item);

product_tag_item_t *product_tag_item_parseFromJSON(cJSON *product_tag_itemJSON);

cJSON *product_tag_item_convertToJSON(product_tag_item_t *product_tag_item);

#endif /* _product_tag_item_H_ */

