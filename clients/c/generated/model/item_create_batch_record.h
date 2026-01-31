/*
 * item_create_batch_record.h
 *
 * Object describing an item batch record to create items
 */

#ifndef _item_create_batch_record_H_
#define _item_create_batch_record_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_create_batch_record_t item_create_batch_record_t;

#include "item_attributes_request.h"



typedef struct item_create_batch_record_t {
    struct item_attributes_request_t *attributes; //model
    char *item_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} item_create_batch_record_t;

__attribute__((deprecated)) item_create_batch_record_t *item_create_batch_record_create(
    item_attributes_request_t *attributes,
    char *item_id
);

void item_create_batch_record_free(item_create_batch_record_t *item_create_batch_record);

item_create_batch_record_t *item_create_batch_record_parseFromJSON(cJSON *item_create_batch_recordJSON);

cJSON *item_create_batch_record_convertToJSON(item_create_batch_record_t *item_create_batch_record);

#endif /* _item_create_batch_record_H_ */

