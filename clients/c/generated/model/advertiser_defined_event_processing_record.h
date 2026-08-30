/*
 * advertiser_defined_event_processing_record.h
 *
 * Processing record for an advertiser defined event operation
 */

#ifndef _advertiser_defined_event_processing_record_H_
#define _advertiser_defined_event_processing_record_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct advertiser_defined_event_processing_record_t advertiser_defined_event_processing_record_t;




typedef struct advertiser_defined_event_processing_record_t {
    list_t *exceptions; //primitive container
    char *name; // string
    char *status; // string

    int _library_owned; // Is the library responsible for freeing this object?
} advertiser_defined_event_processing_record_t;

__attribute__((deprecated)) advertiser_defined_event_processing_record_t *advertiser_defined_event_processing_record_create(
    list_t *exceptions,
    char *name,
    char *status
);

void advertiser_defined_event_processing_record_free(advertiser_defined_event_processing_record_t *advertiser_defined_event_processing_record);

advertiser_defined_event_processing_record_t *advertiser_defined_event_processing_record_parseFromJSON(cJSON *advertiser_defined_event_processing_recordJSON);

cJSON *advertiser_defined_event_processing_record_convertToJSON(advertiser_defined_event_processing_record_t *advertiser_defined_event_processing_record);

#endif /* _advertiser_defined_event_processing_record_H_ */

