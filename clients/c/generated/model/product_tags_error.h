/*
 * product_tags_error.h
 *
 * Error response for requests containing ineligible product tags.
 */

#ifndef _product_tags_error_H_
#define _product_tags_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct product_tags_error_t product_tags_error_t;

#include "ineligible_product_tags_error_details.h"



typedef struct product_tags_error_t {
    int *code; //numeric
    struct ineligible_product_tags_error_details_t *details; //model
    char *message; // string

    int _library_owned; // Is the library responsible for freeing this object?
} product_tags_error_t;

__attribute__((deprecated)) product_tags_error_t *product_tags_error_create(
    int *code,
    ineligible_product_tags_error_details_t *details,
    char *message
);

void product_tags_error_free(product_tags_error_t *product_tags_error);

product_tags_error_t *product_tags_error_parseFromJSON(cJSON *product_tags_errorJSON);

cJSON *product_tags_error_convertToJSON(product_tags_error_t *product_tags_error);

#endif /* _product_tags_error_H_ */

