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
    char *description; // string
    struct catalogs_product_group_filters_request_t *filters; //model
    int is_featured; //boolean
    char *name; // string

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_product_group_update_request_t;

__attribute__((deprecated)) catalogs_product_group_update_request_t *catalogs_product_group_update_request_create(
    char *description,
    catalogs_product_group_filters_request_t *filters,
    int is_featured,
    char *name
);

void catalogs_product_group_update_request_free(catalogs_product_group_update_request_t *catalogs_product_group_update_request);

catalogs_product_group_update_request_t *catalogs_product_group_update_request_parseFromJSON(cJSON *catalogs_product_group_update_requestJSON);

cJSON *catalogs_product_group_update_request_convertToJSON(catalogs_product_group_update_request_t *catalogs_product_group_update_request);

#endif /* _catalogs_product_group_update_request_H_ */

