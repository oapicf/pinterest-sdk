/*
 * catalogs_product_group_update_many_request_items_one_of_items0.h
 *
 * 
 */

#ifndef _catalogs_product_group_update_many_request_items_one_of_items0_H_
#define _catalogs_product_group_update_many_request_items_one_of_items0_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_product_group_update_many_request_items_one_of_items0_t catalogs_product_group_update_many_request_items_one_of_items0_t;

#include "catalogs_product_group_filters_request.h"



typedef struct catalogs_product_group_update_many_request_items_one_of_items0_t {
    char *description; // string
    struct catalogs_product_group_filters_request_t *filters; //model
    int *is_featured; //boolean
    char *name; // string
    char *id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_product_group_update_many_request_items_one_of_items0_t;

__attribute__((deprecated)) catalogs_product_group_update_many_request_items_one_of_items0_t *catalogs_product_group_update_many_request_items_one_of_items0_create(
    char *description,
    catalogs_product_group_filters_request_t *filters,
    int *is_featured,
    char *name,
    char *id
);

void catalogs_product_group_update_many_request_items_one_of_items0_free(catalogs_product_group_update_many_request_items_one_of_items0_t *catalogs_product_group_update_many_request_items_one_of_items0);

catalogs_product_group_update_many_request_items_one_of_items0_t *catalogs_product_group_update_many_request_items_one_of_items0_parseFromJSON(cJSON *catalogs_product_group_update_many_request_items_one_of_items0JSON);

cJSON *catalogs_product_group_update_many_request_items_one_of_items0_convertToJSON(catalogs_product_group_update_many_request_items_one_of_items0_t *catalogs_product_group_update_many_request_items_one_of_items0);

#endif /* _catalogs_product_group_update_many_request_items_one_of_items0_H_ */

