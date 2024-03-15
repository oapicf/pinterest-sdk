/*
 * item_delete_discontinued_batch_record.h
 *
 * Object describing an item batch record to discontinue items
 */

#ifndef _item_delete_discontinued_batch_record_H_
#define _item_delete_discontinued_batch_record_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_delete_discontinued_batch_record_t item_delete_discontinued_batch_record_t;




typedef struct item_delete_discontinued_batch_record_t {
    char *item_id; // string

} item_delete_discontinued_batch_record_t;

item_delete_discontinued_batch_record_t *item_delete_discontinued_batch_record_create(
    char *item_id
);

void item_delete_discontinued_batch_record_free(item_delete_discontinued_batch_record_t *item_delete_discontinued_batch_record);

item_delete_discontinued_batch_record_t *item_delete_discontinued_batch_record_parseFromJSON(cJSON *item_delete_discontinued_batch_recordJSON);

cJSON *item_delete_discontinued_batch_record_convertToJSON(item_delete_discontinued_batch_record_t *item_delete_discontinued_batch_record);

#endif /* _item_delete_discontinued_batch_record_H_ */

