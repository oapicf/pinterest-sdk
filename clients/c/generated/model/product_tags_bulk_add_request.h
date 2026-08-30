/*
 * product_tags_bulk_add_request.h
 *
 * Request body for bulk adding product tags to a pin.
 */

#ifndef _product_tags_bulk_add_request_H_
#define _product_tags_bulk_add_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct product_tags_bulk_add_request_t product_tags_bulk_add_request_t;

#include "product_tag_item.h"



typedef struct product_tags_bulk_add_request_t {
    list_t *product_tags; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} product_tags_bulk_add_request_t;

__attribute__((deprecated)) product_tags_bulk_add_request_t *product_tags_bulk_add_request_create(
    list_t *product_tags
);

void product_tags_bulk_add_request_free(product_tags_bulk_add_request_t *product_tags_bulk_add_request);

product_tags_bulk_add_request_t *product_tags_bulk_add_request_parseFromJSON(cJSON *product_tags_bulk_add_requestJSON);

cJSON *product_tags_bulk_add_request_convertToJSON(product_tags_bulk_add_request_t *product_tags_bulk_add_request);

#endif /* _product_tags_bulk_add_request_H_ */

