/*
 * catalogs_items_batch.h
 *
 * Object describing the catalogs items batch
 */

#ifndef _catalogs_items_batch_H_
#define _catalogs_items_batch_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_items_batch_t catalogs_items_batch_t;

#include "batch_operation_status.h"
#include "catalogs_hotel_items_batch.h"
#include "catalogs_retail_items_batch.h"
#include "catalogs_type.h"
#include "hotel_processing_record.h"

// Enum  for catalogs_items_batch

typedef enum  { pinterest_rest_api_catalogs_items_batch__NULL = 0, pinterest_rest_api_catalogs_items_batch__RETAIL, pinterest_rest_api_catalogs_items_batch__HOTEL } pinterest_rest_api_catalogs_items_batch__e;

char* catalogs_items_batch_catalog_type_ToString(pinterest_rest_api_catalogs_items_batch__e catalog_type);

pinterest_rest_api_catalogs_items_batch__e catalogs_items_batch_catalog_type_FromString(char* catalog_type);

// Enum  for catalogs_items_batch

typedef enum  { pinterest_rest_api_catalogs_items_batch__NULL = 0, pinterest_rest_api_catalogs_items_batch__PROCESSING, pinterest_rest_api_catalogs_items_batch__COMPLETED } pinterest_rest_api_catalogs_items_batch__e;

char* catalogs_items_batch_status_ToString(pinterest_rest_api_catalogs_items_batch__e status);

pinterest_rest_api_catalogs_items_batch__e catalogs_items_batch_status_FromString(char* status);



typedef struct catalogs_items_batch_t {
    catalogs_type_t *catalog_type; // custom
    char *batch_id; // string
    char *created_time; //date time
    char *completed_time; //date time
    batch_operation_status_t *status; // custom
    list_t *items; //nonprimitive container

} catalogs_items_batch_t;

catalogs_items_batch_t *catalogs_items_batch_create(
    catalogs_type_t *catalog_type,
    char *batch_id,
    char *created_time,
    char *completed_time,
    batch_operation_status_t *status,
    list_t *items
);

void catalogs_items_batch_free(catalogs_items_batch_t *catalogs_items_batch);

catalogs_items_batch_t *catalogs_items_batch_parseFromJSON(cJSON *catalogs_items_batchJSON);

cJSON *catalogs_items_batch_convertToJSON(catalogs_items_batch_t *catalogs_items_batch);

#endif /* _catalogs_items_batch_H_ */

