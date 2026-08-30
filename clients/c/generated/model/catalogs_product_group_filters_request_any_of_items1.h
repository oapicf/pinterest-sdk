/*
 * catalogs_product_group_filters_request_any_of_items1.h
 *
 * 
 */

#ifndef _catalogs_product_group_filters_request_any_of_items1_H_
#define _catalogs_product_group_filters_request_any_of_items1_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_product_group_filters_request_any_of_items1_t catalogs_product_group_filters_request_any_of_items1_t;

#include "catalogs_product_group_filter_keys.h"



typedef struct catalogs_product_group_filters_request_any_of_items1_t {
    list_t *all_of; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_product_group_filters_request_any_of_items1_t;

__attribute__((deprecated)) catalogs_product_group_filters_request_any_of_items1_t *catalogs_product_group_filters_request_any_of_items1_create(
    list_t *all_of
);

void catalogs_product_group_filters_request_any_of_items1_free(catalogs_product_group_filters_request_any_of_items1_t *catalogs_product_group_filters_request_any_of_items1);

catalogs_product_group_filters_request_any_of_items1_t *catalogs_product_group_filters_request_any_of_items1_parseFromJSON(cJSON *catalogs_product_group_filters_request_any_of_items1JSON);

cJSON *catalogs_product_group_filters_request_any_of_items1_convertToJSON(catalogs_product_group_filters_request_any_of_items1_t *catalogs_product_group_filters_request_any_of_items1);

#endif /* _catalogs_product_group_filters_request_any_of_items1_H_ */

