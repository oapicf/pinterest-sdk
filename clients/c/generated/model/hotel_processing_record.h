/*
 * hotel_processing_record.h
 *
 * Object describing an item processing record
 */

#ifndef _hotel_processing_record_H_
#define _hotel_processing_record_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct hotel_processing_record_t hotel_processing_record_t;

#include "item_processing_status.h"
#include "item_validation_event.h"



typedef struct hotel_processing_record_t {
    list_t *errors; //nonprimitive container
    char *hotel_id; // string
    pinterest_rest_api_item_processing_status__e status; //referenced enum
    list_t *warnings; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} hotel_processing_record_t;

__attribute__((deprecated)) hotel_processing_record_t *hotel_processing_record_create(
    list_t *errors,
    char *hotel_id,
    pinterest_rest_api_item_processing_status__e status,
    list_t *warnings
);

void hotel_processing_record_free(hotel_processing_record_t *hotel_processing_record);

hotel_processing_record_t *hotel_processing_record_parseFromJSON(cJSON *hotel_processing_recordJSON);

cJSON *hotel_processing_record_convertToJSON(hotel_processing_record_t *hotel_processing_record);

#endif /* _hotel_processing_record_H_ */

