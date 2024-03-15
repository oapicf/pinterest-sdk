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

// Enum  for hotel_processing_record

typedef enum  { pinterest_rest_api_hotel_processing_record__NULL = 0, pinterest_rest_api_hotel_processing_record__SUCCESS, pinterest_rest_api_hotel_processing_record__FAILURE, pinterest_rest_api_hotel_processing_record__PROCESSING } pinterest_rest_api_hotel_processing_record__e;

char* hotel_processing_record_status_ToString(pinterest_rest_api_hotel_processing_record__e status);

pinterest_rest_api_hotel_processing_record__e hotel_processing_record_status_FromString(char* status);



typedef struct hotel_processing_record_t {
    char *hotel_id; // string
    list_t *errors; //nonprimitive container
    list_t *warnings; //nonprimitive container
    item_processing_status_t *status; // custom

} hotel_processing_record_t;

hotel_processing_record_t *hotel_processing_record_create(
    char *hotel_id,
    list_t *errors,
    list_t *warnings,
    item_processing_status_t *status
);

void hotel_processing_record_free(hotel_processing_record_t *hotel_processing_record);

hotel_processing_record_t *hotel_processing_record_parseFromJSON(cJSON *hotel_processing_recordJSON);

cJSON *hotel_processing_record_convertToJSON(hotel_processing_record_t *hotel_processing_record);

#endif /* _hotel_processing_record_H_ */

