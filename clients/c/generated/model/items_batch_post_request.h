/*
 * items_batch_post_request.h
 *
 * 
 */

#ifndef _items_batch_post_request_H_
#define _items_batch_post_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct items_batch_post_request_t items_batch_post_request_t;

#include "batch_operation.h"
#include "catalogs_items_batch_request.h"
#include "catalogs_items_request_language.h"
#include "catalogs_vertical_batch_request.h"
#include "country.h"
#include "item_delete_batch_record.h"

// Enum CATALOGTYPE for items_batch_post_request

typedef enum  { pinterest_rest_api_items_batch_post_request_CATALOGTYPE_NULL = 0, pinterest_rest_api_items_batch_post_request_CATALOGTYPE_CREATIVE_ASSETS } pinterest_rest_api_items_batch_post_request_CATALOGTYPE_e;

char* items_batch_post_request_catalog_type_ToString(pinterest_rest_api_items_batch_post_request_CATALOGTYPE_e catalog_type);

pinterest_rest_api_items_batch_post_request_CATALOGTYPE_e items_batch_post_request_catalog_type_FromString(char* catalog_type);



typedef struct items_batch_post_request_t {
    pinterest_rest_api_items_batch_post_request_CATALOGTYPE_e catalog_type; //enum
    pinterest_rest_api_country__e country; //referenced enum
    struct catalogs_items_request_language_t *language; //model
    list_t *items; //nonprimitive container
    char *catalog_id; // string
    pinterest_rest_api_batch_operation__e operation; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} items_batch_post_request_t;

__attribute__((deprecated)) items_batch_post_request_t *items_batch_post_request_create(
    pinterest_rest_api_items_batch_post_request_CATALOGTYPE_e catalog_type,
    pinterest_rest_api_country__e country,
    catalogs_items_request_language_t *language,
    list_t *items,
    char *catalog_id,
    pinterest_rest_api_batch_operation__e operation
);

void items_batch_post_request_free(items_batch_post_request_t *items_batch_post_request);

items_batch_post_request_t *items_batch_post_request_parseFromJSON(cJSON *items_batch_post_requestJSON);

cJSON *items_batch_post_request_convertToJSON(items_batch_post_request_t *items_batch_post_request);

#endif /* _items_batch_post_request_H_ */

