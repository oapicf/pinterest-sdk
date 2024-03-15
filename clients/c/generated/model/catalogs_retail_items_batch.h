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
#include "catalogs_type.h"
#include "item_processing_record.h"

// Enum  for catalogs_retail_items_batch

typedef enum  { pinterest_rest_api_catalogs_retail_items_batch__NULL = 0, pinterest_rest_api_catalogs_retail_items_batch__PROCESSING, pinterest_rest_api_catalogs_retail_items_batch__COMPLETED } pinterest_rest_api_catalogs_retail_items_batch__e;

char* catalogs_retail_items_batch_status_ToString(pinterest_rest_api_catalogs_retail_items_batch__e status);

pinterest_rest_api_catalogs_retail_items_batch__e catalogs_retail_items_batch_status_FromString(char* status);

// Enum  for catalogs_retail_items_batch

typedef enum  { pinterest_rest_api_catalogs_retail_items_batch__NULL = 0, pinterest_rest_api_catalogs_retail_items_batch__RETAIL, pinterest_rest_api_catalogs_retail_items_batch__HOTEL } pinterest_rest_api_catalogs_retail_items_batch__e;

char* catalogs_retail_items_batch_catalog_type_ToString(pinterest_rest_api_catalogs_retail_items_batch__e catalog_type);

pinterest_rest_api_catalogs_retail_items_batch__e catalogs_retail_items_batch_catalog_type_FromString(char* catalog_type);



typedef struct catalogs_retail_items_batch_t {
    char *batch_id; // string
    char *created_time; //date time
    char *completed_time; //date time
    batch_operation_status_t *status; // custom
    catalogs_type_t *catalog_type; // custom
    list_t *items; //nonprimitive container

} catalogs_retail_items_batch_t;

catalogs_retail_items_batch_t *catalogs_retail_items_batch_create(
    char *batch_id,
    char *created_time,
    char *completed_time,
    batch_operation_status_t *status,
    catalogs_type_t *catalog_type,
    list_t *items
);

void catalogs_retail_items_batch_free(catalogs_retail_items_batch_t *catalogs_retail_items_batch);

catalogs_retail_items_batch_t *catalogs_retail_items_batch_parseFromJSON(cJSON *catalogs_retail_items_batchJSON);

cJSON *catalogs_retail_items_batch_convertToJSON(catalogs_retail_items_batch_t *catalogs_retail_items_batch);

#endif /* _catalogs_retail_items_batch_H_ */

