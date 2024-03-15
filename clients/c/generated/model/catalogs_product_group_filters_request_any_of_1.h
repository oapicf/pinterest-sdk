/*
 * catalogs_product_group_filters_request_any_of_1.h
 *
 * 
 */

#ifndef _catalogs_product_group_filters_request_any_of_1_H_
#define _catalogs_product_group_filters_request_any_of_1_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_product_group_filters_request_any_of_1_t catalogs_product_group_filters_request_any_of_1_t;

#include "catalogs_product_group_filter_keys.h"



typedef struct catalogs_product_group_filters_request_any_of_1_t {
    list_t *all_of; //nonprimitive container

} catalogs_product_group_filters_request_any_of_1_t;

catalogs_product_group_filters_request_any_of_1_t *catalogs_product_group_filters_request_any_of_1_create(
    list_t *all_of
);

void catalogs_product_group_filters_request_any_of_1_free(catalogs_product_group_filters_request_any_of_1_t *catalogs_product_group_filters_request_any_of_1);

catalogs_product_group_filters_request_any_of_1_t *catalogs_product_group_filters_request_any_of_1_parseFromJSON(cJSON *catalogs_product_group_filters_request_any_of_1JSON);

cJSON *catalogs_product_group_filters_request_any_of_1_convertToJSON(catalogs_product_group_filters_request_any_of_1_t *catalogs_product_group_filters_request_any_of_1);

#endif /* _catalogs_product_group_filters_request_any_of_1_H_ */

