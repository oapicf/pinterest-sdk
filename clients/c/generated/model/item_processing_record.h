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

// Enum  for item_processing_record

typedef enum  { pinterest_rest_api_item_processing_record__NULL = 0, pinterest_rest_api_item_processing_record__SUCCESS, pinterest_rest_api_item_processing_record__FAILURE, pinterest_rest_api_item_processing_record__PROCESSING } pinterest_rest_api_item_processing_record__e;

char* item_processing_record_status_ToString(pinterest_rest_api_item_processing_record__e status);

pinterest_rest_api_item_processing_record__e item_processing_record_status_FromString(char* status);



typedef struct item_processing_record_t {
    char *item_id; // string
    list_t *errors; //nonprimitive container
    list_t *warnings; //nonprimitive container
    item_processing_status_t *status; // custom

} item_processing_record_t;

item_processing_record_t *item_processing_record_create(
    char *item_id,
    list_t *errors,
    list_t *warnings,
    item_processing_status_t *status
);

void item_processing_record_free(item_processing_record_t *item_processing_record);

item_processing_record_t *item_processing_record_parseFromJSON(cJSON *item_processing_recordJSON);

cJSON *item_processing_record_convertToJSON(item_processing_record_t *item_processing_record);

#endif /* _item_processing_record_H_ */

