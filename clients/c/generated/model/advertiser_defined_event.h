/*
 * advertiser_defined_event.h
 *
 * 
 */

#ifndef _advertiser_defined_event_H_
#define _advertiser_defined_event_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct advertiser_defined_event_t advertiser_defined_event_t;




typedef struct advertiser_defined_event_t {
    char *name; // string
    pinterest_rest_api_advertiser_defined_event_MAPPEDCONVERSIONTYPE_e mapped_conversion_type; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} advertiser_defined_event_t;

__attribute__((deprecated)) advertiser_defined_event_t *advertiser_defined_event_create(
    char *name,
    pinterest_rest_api_advertiser_defined_event_MAPPEDCONVERSIONTYPE_e mapped_conversion_type
);

void advertiser_defined_event_free(advertiser_defined_event_t *advertiser_defined_event);

advertiser_defined_event_t *advertiser_defined_event_parseFromJSON(cJSON *advertiser_defined_eventJSON);

cJSON *advertiser_defined_event_convertToJSON(advertiser_defined_event_t *advertiser_defined_event);

#endif /* _advertiser_defined_event_H_ */

