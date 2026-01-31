/*
 * item_processing_record.h
 *
 * Object describing an item processing record
 */

#ifndef _item_processing_record_H_
#define _item_processing_record_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_processing_record_t item_processing_record_t;

#include "item_processing_status.h"
#include "item_validation_event.h"



typedef struct item_processing_record_t {
    list_t *errors; //nonprimitive container
    char *item_id; // string
    pinterest_rest_api_item_processing_status__e status; //referenced enum
    list_t *warnings; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} item_processing_record_t;

__attribute__((deprecated)) item_processing_record_t *item_processing_record_create(
    list_t *errors,
    char *item_id,
    pinterest_rest_api_item_processing_status__e status,
    list_t *warnings
);

void item_processing_record_free(item_processing_record_t *item_processing_record);

item_processing_record_t *item_processing_record_parseFromJSON(cJSON *item_processing_recordJSON);

cJSON *item_processing_record_convertToJSON(item_processing_record_t *item_processing_record);

#endif /* _item_processing_record_H_ */

