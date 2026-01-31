/*
 * catalogs_items_request.h
 *
 * Request object of catalogs items
 */

#ifndef _catalogs_items_request_H_
#define _catalogs_items_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_items_request_t catalogs_items_request_t;

#include "catalogs_items_post_filters.h"
#include "country.h"



typedef struct catalogs_items_request_t {
    pinterest_rest_api_country__e country; //referenced enum
    pinterest_rest_api_catalogs_items_request_LANGUAGE_e language; //enum
    struct catalogs_items_post_filters_t *filters; //model

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_items_request_t;

__attribute__((deprecated)) catalogs_items_request_t *catalogs_items_request_create(
    pinterest_rest_api_country__e country,
    pinterest_rest_api_catalogs_items_request_LANGUAGE_e language,
    catalogs_items_post_filters_t *filters
);

void catalogs_items_request_free(catalogs_items_request_t *catalogs_items_request);

catalogs_items_request_t *catalogs_items_request_parseFromJSON(cJSON *catalogs_items_requestJSON);

cJSON *catalogs_items_request_convertToJSON(catalogs_items_request_t *catalogs_items_request);

#endif /* _catalogs_items_request_H_ */

