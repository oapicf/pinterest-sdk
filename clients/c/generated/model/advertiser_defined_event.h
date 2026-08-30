/*
 * advertiser_defined_event.h
 *
 * Advertiser defined event
 */

#ifndef _advertiser_defined_event_H_
#define _advertiser_defined_event_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct advertiser_defined_event_t advertiser_defined_event_t;

#include "conversion_tag_type_optimal.h"



typedef struct advertiser_defined_event_t {
    conversion_tag_type_optimal_t *mapped_conversion_type; // custom
    char *name; // string

    int _library_owned; // Is the library responsible for freeing this object?
} advertiser_defined_event_t;

__attribute__((deprecated)) advertiser_defined_event_t *advertiser_defined_event_create(
    conversion_tag_type_optimal_t *mapped_conversion_type,
    char *name
);

void advertiser_defined_event_free(advertiser_defined_event_t *advertiser_defined_event);

advertiser_defined_event_t *advertiser_defined_event_parseFromJSON(cJSON *advertiser_defined_eventJSON);

cJSON *advertiser_defined_event_convertToJSON(advertiser_defined_event_t *advertiser_defined_event);

#endif /* _advertiser_defined_event_H_ */

