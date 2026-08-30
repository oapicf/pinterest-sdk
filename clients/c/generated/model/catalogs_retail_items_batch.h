/*
 * catalogs_retail_items_batch.h
 *
 * Object describing the catalogs retail items batch
 */

#ifndef _catalogs_retail_items_batch_H_
#define _catalogs_retail_items_batch_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_retail_items_batch_t catalogs_retail_items_batch_t;

#include "batch_operation_status.h"
#include "item_processing_record.h"

// Enum CATALOGTYPE for catalogs_retail_items_batch

typedef enum  { pinterest_rest_api_catalogs_retail_items_batch_CATALOGTYPE_NULL = 0, pinterest_rest_api_catalogs_retail_items_batch_CATALOGTYPE_RETAIL } pinterest_rest_api_catalogs_retail_items_batch_CATALOGTYPE_e;

char* catalogs_retail_items_batch_catalog_type_ToString(pinterest_rest_api_catalogs_retail_items_batch_CATALOGTYPE_e catalog_type);

pinterest_rest_api_catalogs_retail_items_batch_CATALOGTYPE_e catalogs_retail_items_batch_catalog_type_FromString(char* catalog_type);



typedef struct catalogs_retail_items_batch_t {
    char *batch_id; // string
    pinterest_rest_api_catalogs_retail_items_batch_CATALOGTYPE_e catalog_type; //enum
    char *completed_time; //date time
    char *created_time; //date time
    list_t *items; //nonprimitive container
    pinterest_rest_api_batch_operation_status__e status; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_retail_items_batch_t;

__attribute__((deprecated)) catalogs_retail_items_batch_t *catalogs_retail_items_batch_create(
    char *batch_id,
    pinterest_rest_api_catalogs_retail_items_batch_CATALOGTYPE_e catalog_type,
    char *completed_time,
    char *created_time,
    list_t *items,
    pinterest_rest_api_batch_operation_status__e status
);

void catalogs_retail_items_batch_free(catalogs_retail_items_batch_t *catalogs_retail_items_batch);

catalogs_retail_items_batch_t *catalogs_retail_items_batch_parseFromJSON(cJSON *catalogs_retail_items_batchJSON);

cJSON *catalogs_retail_items_batch_convertToJSON(catalogs_retail_items_batch_t *catalogs_retail_items_batch);

#endif /* _catalogs_retail_items_batch_H_ */

