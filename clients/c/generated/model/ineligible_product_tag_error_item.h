/*
 * ineligible_product_tag_error_item.h
 *
 * Error item for a product tag that failed eligibility check.
 */

#ifndef _ineligible_product_tag_error_item_H_
#define _ineligible_product_tag_error_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ineligible_product_tag_error_item_t ineligible_product_tag_error_item_t;

#include "ineligible_product_tag_reason.h"



typedef struct ineligible_product_tag_error_item_t {
    ineligible_product_tag_reason_t *error_message; // custom
    char *pin_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ineligible_product_tag_error_item_t;

__attribute__((deprecated)) ineligible_product_tag_error_item_t *ineligible_product_tag_error_item_create(
    ineligible_product_tag_reason_t *error_message,
    char *pin_id
);

void ineligible_product_tag_error_item_free(ineligible_product_tag_error_item_t *ineligible_product_tag_error_item);

ineligible_product_tag_error_item_t *ineligible_product_tag_error_item_parseFromJSON(cJSON *ineligible_product_tag_error_itemJSON);

cJSON *ineligible_product_tag_error_item_convertToJSON(ineligible_product_tag_error_item_t *ineligible_product_tag_error_item);

#endif /* _ineligible_product_tag_error_item_H_ */

