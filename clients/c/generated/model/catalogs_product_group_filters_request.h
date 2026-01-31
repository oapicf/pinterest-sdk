/*
 * catalogs_product_group_filters_request.h
 *
 * Object holding a group of filters for request on catalog product group. This is a distinct schema It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.
 */

#ifndef _catalogs_product_group_filters_request_H_
#define _catalogs_product_group_filters_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_product_group_filters_request_t catalogs_product_group_filters_request_t;

#include "all_of.h"
#include "any_of.h"
#include "catalogs_product_group_filter_keys.h"



typedef struct catalogs_product_group_filters_request_t {
    list_t *any_of; //nonprimitive container
    list_t *all_of; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_product_group_filters_request_t;

__attribute__((deprecated)) catalogs_product_group_filters_request_t *catalogs_product_group_filters_request_create(
    list_t *any_of,
    list_t *all_of
);

void catalogs_product_group_filters_request_free(catalogs_product_group_filters_request_t *catalogs_product_group_filters_request);

catalogs_product_group_filters_request_t *catalogs_product_group_filters_request_parseFromJSON(cJSON *catalogs_product_group_filters_requestJSON);

cJSON *catalogs_product_group_filters_request_convertToJSON(catalogs_product_group_filters_request_t *catalogs_product_group_filters_request);

#endif /* _catalogs_product_group_filters_request_H_ */

