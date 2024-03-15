/*
 * catalogs_product_group_create_request.h
 *
 * Request object for creating a product group.
 */

#ifndef _catalogs_product_group_create_request_H_
#define _catalogs_product_group_create_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_product_group_create_request_t catalogs_product_group_create_request_t;

#include "catalogs_product_group_filters_request.h"



typedef struct catalogs_product_group_create_request_t {
    char *name; // string
    char *description; // string
    int is_featured; //boolean
    struct catalogs_product_group_filters_request_t *filters; //model
    char *feed_id; // string

} catalogs_product_group_create_request_t;

catalogs_product_group_create_request_t *catalogs_product_group_create_request_create(
    char *name,
    char *description,
    int is_featured,
    catalogs_product_group_filters_request_t *filters,
    char *feed_id
);

void catalogs_product_group_create_request_free(catalogs_product_group_create_request_t *catalogs_product_group_create_request);

catalogs_product_group_create_request_t *catalogs_product_group_create_request_parseFromJSON(cJSON *catalogs_product_group_create_requestJSON);

cJSON *catalogs_product_group_create_request_convertToJSON(catalogs_product_group_create_request_t *catalogs_product_group_create_request);

#endif /* _catalogs_product_group_create_request_H_ */

