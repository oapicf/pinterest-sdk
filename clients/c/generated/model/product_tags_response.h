/*
 * product_tags_response.h
 *
 * Response containing a list of product tags for a pin.
 */

#ifndef _product_tags_response_H_
#define _product_tags_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct product_tags_response_t product_tags_response_t;

#include "product_tag_item.h"



typedef struct product_tags_response_t {
    list_t *product_tags; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} product_tags_response_t;

__attribute__((deprecated)) product_tags_response_t *product_tags_response_create(
    list_t *product_tags
);

void product_tags_response_free(product_tags_response_t *product_tags_response);

product_tags_response_t *product_tags_response_parseFromJSON(cJSON *product_tags_responseJSON);

cJSON *product_tags_response_convertToJSON(product_tags_response_t *product_tags_response);

#endif /* _product_tags_response_H_ */

