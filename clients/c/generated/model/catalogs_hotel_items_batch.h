/*
 * catalogs_hotel_items_batch.h
 *
 * Object describing the catalogs hotel items batch
 */

#ifndef _catalogs_hotel_items_batch_H_
#define _catalogs_hotel_items_batch_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_hotel_items_batch_t catalogs_hotel_items_batch_t;

#include "batch_operation_status.h"
#include "catalogs_type.h"
#include "hotel_processing_record.h"



typedef struct catalogs_hotel_items_batch_t {
    char *batch_id; // string
    char *created_time; //date time
    char *completed_time; //date time
    pinterest_rest_api_batch_operation_status__e status; //referenced enum
    pinterest_rest_api_catalogs_type__e catalog_type; //referenced enum
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_hotel_items_batch_t;

__attribute__((deprecated)) catalogs_hotel_items_batch_t *catalogs_hotel_items_batch_create(
    char *batch_id,
    char *created_time,
    char *completed_time,
    pinterest_rest_api_batch_operation_status__e status,
    pinterest_rest_api_catalogs_type__e catalog_type,
    list_t *items
);

void catalogs_hotel_items_batch_free(catalogs_hotel_items_batch_t *catalogs_hotel_items_batch);

catalogs_hotel_items_batch_t *catalogs_hotel_items_batch_parseFromJSON(cJSON *catalogs_hotel_items_batchJSON);

cJSON *catalogs_hotel_items_batch_convertToJSON(catalogs_hotel_items_batch_t *catalogs_hotel_items_batch);

#endif /* _catalogs_hotel_items_batch_H_ */

