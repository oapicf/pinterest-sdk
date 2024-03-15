/*
 * catalogs_product_group_update_request.h
 *
 * Request object for updating a product group.
 */

#ifndef _catalogs_product_group_update_request_H_
#define _catalogs_product_group_update_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_product_group_update_request_t catalogs_product_group_update_request_t;

#include "catalogs_product_group_filters_request.h"



typedef struct catalogs_product_group_update_request_t {
    char *name; // string
    char *description; // string
    int is_featured; //boolean
    struct catalogs_product_group_filters_request_t *filters; //model

} catalogs_product_group_update_request_t;

catalogs_product_group_update_request_t *catalogs_product_group_update_request_create(
    char *name,
    char *description,
    int is_featured,
    catalogs_product_group_filters_request_t *filters
);

void catalogs_product_group_update_request_free(catalogs_product_group_update_request_t *catalogs_product_group_update_request);

catalogs_product_group_update_request_t *catalogs_product_group_update_request_parseFromJSON(cJSON *catalogs_product_group_update_requestJSON);

cJSON *catalogs_product_group_update_request_convertToJSON(catalogs_product_group_update_request_t *catalogs_product_group_update_request);

#endif /* _catalogs_product_group_update_request_H_ */

