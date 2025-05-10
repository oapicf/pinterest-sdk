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
#include "catalogs_creative_assets_items_batch.h"
#include "catalogs_hotel_items_batch.h"
#include "catalogs_retail_items_batch.h"
#include "catalogs_type.h"
#include "creative_assets_processing_record.h"



typedef struct catalogs_items_batch_t {
    pinterest_rest_api_catalogs_type__e catalog_type; //referenced enum
    char *batch_id; // string
    char *created_time; //date time
    char *completed_time; //date time
    pinterest_rest_api_batch_operation_status__e status; //referenced enum
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_items_batch_t;

__attribute__((deprecated)) catalogs_items_batch_t *catalogs_items_batch_create(
    pinterest_rest_api_catalogs_type__e catalog_type,
    char *batch_id,
    char *created_time,
    char *completed_time,
    pinterest_rest_api_batch_operation_status__e status,
    list_t *items
);

void catalogs_items_batch_free(catalogs_items_batch_t *catalogs_items_batch);

catalogs_items_batch_t *catalogs_items_batch_parseFromJSON(cJSON *catalogs_items_batchJSON);

cJSON *catalogs_items_batch_convertToJSON(catalogs_items_batch_t *catalogs_items_batch);

#endif /* _catalogs_items_batch_H_ */

