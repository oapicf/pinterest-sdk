/*
 * catalogs_product_group_filters_all_of.h
 *
 * 
 */

#ifndef _catalogs_product_group_filters_all_of_H_
#define _catalogs_product_group_filters_all_of_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_product_group_filters_all_of_t catalogs_product_group_filters_all_of_t;

#include "catalogs_product_group_filter_keys.h"



typedef struct catalogs_product_group_filters_all_of_t {
    list_t *all_of; //nonprimitive container

} catalogs_product_group_filters_all_of_t;

catalogs_product_group_filters_all_of_t *catalogs_product_group_filters_all_of_create(
    list_t *all_of
);

void catalogs_product_group_filters_all_of_free(catalogs_product_group_filters_all_of_t *catalogs_product_group_filters_all_of);

catalogs_product_group_filters_all_of_t *catalogs_product_group_filters_all_of_parseFromJSON(cJSON *catalogs_product_group_filters_all_ofJSON);

cJSON *catalogs_product_group_filters_all_of_convertToJSON(catalogs_product_group_filters_all_of_t *catalogs_product_group_filters_all_of);

#endif /* _catalogs_product_group_filters_all_of_H_ */

