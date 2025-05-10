/*
 * catalogs_items_delete_discontinued_batch_request.h
 *
 * Request object to discontinue catalogs items
 */

#ifndef _catalogs_items_delete_discontinued_batch_request_H_
#define _catalogs_items_delete_discontinued_batch_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_items_delete_discontinued_batch_request_t catalogs_items_delete_discontinued_batch_request_t;

#include "batch_operation.h"
#include "catalogs_items_request_language.h"
#include "country.h"
#include "item_delete_discontinued_batch_record.h"



typedef struct catalogs_items_delete_discontinued_batch_request_t {
    pinterest_rest_api_country__e country; //referenced enum
    struct catalogs_items_request_language_t *language; //model
    pinterest_rest_api_batch_operation__e operation; //referenced enum
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_items_delete_discontinued_batch_request_t;

__attribute__((deprecated)) catalogs_items_delete_discontinued_batch_request_t *catalogs_items_delete_discontinued_batch_request_create(
    pinterest_rest_api_country__e country,
    catalogs_items_request_language_t *language,
    pinterest_rest_api_batch_operation__e operation,
    list_t *items
);

void catalogs_items_delete_discontinued_batch_request_free(catalogs_items_delete_discontinued_batch_request_t *catalogs_items_delete_discontinued_batch_request);

catalogs_items_delete_discontinued_batch_request_t *catalogs_items_delete_discontinued_batch_request_parseFromJSON(cJSON *catalogs_items_delete_discontinued_batch_requestJSON);

cJSON *catalogs_items_delete_discontinued_batch_request_convertToJSON(catalogs_items_delete_discontinued_batch_request_t *catalogs_items_delete_discontinued_batch_request);

#endif /* _catalogs_items_delete_discontinued_batch_request_H_ */

