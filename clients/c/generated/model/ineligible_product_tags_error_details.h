/*
 * ineligible_product_tags_error_details.h
 *
 * Details about ineligible product tags in the request.
 */

#ifndef _ineligible_product_tags_error_details_H_
#define _ineligible_product_tags_error_details_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ineligible_product_tags_error_details_t ineligible_product_tags_error_details_t;

#include "ineligible_product_tag_error_item.h"



typedef struct ineligible_product_tags_error_details_t {
    list_t *product_tags; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} ineligible_product_tags_error_details_t;

__attribute__((deprecated)) ineligible_product_tags_error_details_t *ineligible_product_tags_error_details_create(
    list_t *product_tags
);

void ineligible_product_tags_error_details_free(ineligible_product_tags_error_details_t *ineligible_product_tags_error_details);

ineligible_product_tags_error_details_t *ineligible_product_tags_error_details_parseFromJSON(cJSON *ineligible_product_tags_error_detailsJSON);

cJSON *ineligible_product_tags_error_details_convertToJSON(ineligible_product_tags_error_details_t *ineligible_product_tags_error_details);

#endif /* _ineligible_product_tags_error_details_H_ */

