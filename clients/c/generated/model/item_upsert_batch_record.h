/*
 * item_upsert_batch_record.h
 *
 * Object describing an item batch record to upsert items
 */

#ifndef _item_upsert_batch_record_H_
#define _item_upsert_batch_record_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_upsert_batch_record_t item_upsert_batch_record_t;

#include "item_attributes_request.h"



typedef struct item_upsert_batch_record_t {
    char *item_id; // string
    struct item_attributes_request_t *attributes; //model

} item_upsert_batch_record_t;

item_upsert_batch_record_t *item_upsert_batch_record_create(
    char *item_id,
    item_attributes_request_t *attributes
);

void item_upsert_batch_record_free(item_upsert_batch_record_t *item_upsert_batch_record);

item_upsert_batch_record_t *item_upsert_batch_record_parseFromJSON(cJSON *item_upsert_batch_recordJSON);

cJSON *item_upsert_batch_record_convertToJSON(item_upsert_batch_record_t *item_upsert_batch_record);

#endif /* _item_upsert_batch_record_H_ */

